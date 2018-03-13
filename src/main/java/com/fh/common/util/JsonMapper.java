package com.fh.common.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

@SuppressWarnings("serial")
public class JsonMapper extends ObjectMapper {

	private static Logger logger = LoggerFactory.getLogger(JsonMapper.class);
	private static final JsonMapper mapper = new JsonMapper();
	
	static {
		// 设置输出时包含属性的风格
		//mapper.setSerializationInclusion(Include.NON_EMPTY);//不输出空值字段
		
		// 允许单引号、允许不带引号的字段名称
		enableSimple();
		// 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		/*
        // 空值处理为空串
		mapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>(){
			@Override
			public void serialize(Object value, JsonGenerator jgen,
					SerializerProvider provider) throws IOException,
					JsonProcessingException {
				jgen.writeString("");
			}
        });
		*/
		// 进行HTML解码。
		mapper.registerModule(new SimpleModule().addSerializer(String.class, new JsonSerializer<String>(){
			@Override
			public void serialize(String value, JsonGenerator jgen,
					SerializerProvider provider) throws IOException,
					JsonProcessingException {
				jgen.writeString(StringEscapeUtils.unescapeHtml4(value));
			}
        }));
		// 设置时区
		mapper.setTimeZone(TimeZone.getDefault());//getTimeZone("GMT+8:00")
		
		//日期默认序列号/解析格式
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
	}

	/**
	 * 允许单引号
	 * 允许不带引号的字段名称
	 */
	public static void enableSimple() {
		mapper.configure(Feature.ALLOW_SINGLE_QUOTES, true);
		mapper.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
	}
	
	/**
	 * 設定是否使用Enum的toString函數來讀寫Enum,
	 * 為False時時使用Enum的name()函數來讀寫Enum, 默認為False.
	 * 注意本函數一定要在Mapper創建後, 所有的讀寫動作之前調用.
	 */
	public JsonMapper enableEnumUseToString() {
		mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
		mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
		return this;
	}

	
	
	
	/**
	 * 对象转换为JSON字符串
	 * @param object
	 * @return
	 */
	public static String toJsonString(Object object){
		return toJson(object);
	}
	/**
	 * Object可以是POJO，也可以是Collection或数组。
	 * 如果对象为Null, 返回"null".
	 * 如果集合为空集合, 返回"[]".
	 */
	public static String toJson(Object object) {
		try {
			return mapper.writeValueAsString(object);
		} catch (IOException e) {
			logger.warn("write to json string error:" + object, e);
			return null;
		}
	}

	/**
	 * 反序列化POJO或简单Collection如List<String>.
	 * 
	 * 如果JSON字符串为Null或"null"字符串, 返回Null.
	 * 如果JSON字符串为"[]", 返回空集合.
	 * 
	 * 如需反序列化复杂Collection如List<MyBean>, 请使用parseJson(String,JavaType)
	 * @see #parseJson(String, JavaType)
	 */
	public static <T> T parseJson(String jsonString, Class<T> clazz) {
		if (StringUtils.isEmpty(jsonString)) {
			return null;
		}
		try {
			return mapper.readValue(jsonString, clazz);
		} catch (IOException e) {
			logger.warn("parse json string error:" + jsonString, e);
			return null;
		}
	}

	/**
	 * JSON字符串转换为对象
	 * @param jsonString
	 * @param clazz
	 * @return
	 */
	public static Object parseJsonString(String jsonString, Class<?> clazz){
		return parseJson(jsonString, clazz);
	}
	
	/**
	 * 輸出JSONP格式數據.
	 */
	public static String toJsonP(String functionName, Object object) {
		return toJson(new JSONPObject(functionName, object));
	}
	
	/**
	 * 反序列化复杂Collection如List<Bean>, 先使用函數createCollectionType构造类型,然后调用本函数.
	 * @see #createCollectionType(Class, Class...)
	 */
	@SuppressWarnings("unchecked")
	public static <T> T parseJson(String jsonString, JavaType javaType) {
		if (StringUtils.isEmpty(jsonString)) {
			return null;
		}
		try {
			return (T) mapper.readValue(jsonString, javaType);
		} catch (IOException e) {
			logger.warn("parse json string error:" + jsonString, e);
			return null;
		}
	}

	/**
	 * 構造泛型的Collection Type如:
	 * ArrayList<MyBean>, 则调用constructCollectionType(ArrayList.class,MyBean.class)
	 * HashMap<String,MyBean>, 则调用(HashMap.class,String.class, MyBean.class)
	 */
	public JavaType createCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
		return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
	}

	/**
	 * 當JSON裡只含有Bean的部分屬性時，更新一個已存在Bean，只覆蓋該部分的屬性.
	 */
	@SuppressWarnings("unchecked")
	public <T> T update(String jsonString, T object) {
		try {
			return (T) mapper.readerForUpdating(object).readValue(jsonString);
		} catch (JsonProcessingException e) {
			logger.warn("update json string:" + jsonString + " to object:" + object + " error.", e);
		} catch (IOException e) {
			logger.warn("update json string:" + jsonString + " to object:" + object + " error.", e);
		}
		return null;
	}

	public static Map<String, Object> json2Map(String jsonStr) {
		if (jsonStr==null || jsonStr.trim().equals("")) {
			return new HashMap<String, Object>();
		}
		Map<String, Object> map = (Map<String, Object>) JSON.parse(jsonStr);
		return map;
	}

	
	/**
	 * 测试
	 */
	public static void main(String[] args) {
		List<Map<String, Object>> list = Lists.newArrayList();
		Map<String, Object> map = Maps.newHashMap();
		map.put("id", 1);
		map.put("pId", -1);
		map.put("name", "根节点");
		list.add(map);
		map = Maps.newHashMap();
		map.put("id", 2);
		map.put("pId", 1);
		map.put("name", "你好");
		map.put("open", true);
		list.add(map);
		String json = toJson(list);
		System.out.println(json);
	}
	
}
