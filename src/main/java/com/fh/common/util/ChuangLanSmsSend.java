package com.fh.common.util;

import com.alibaba.fastjson.JSON;
import com.fh.common.constants.Consts;
import com.fh.common.util.sms.ChuangLanSmsUtil;
import com.fh.common.util.sms.SmsSendRequest;
import com.fh.common.util.sms.SmsSendResponse;

import java.io.UnsupportedEncodingException;

public class ChuangLanSmsSend {
    public static final String charset = "utf-8";
    public static String account = "N3241069";
    public static String pswd = "h9gEuk08Y";

    public static SmsSendResponse sendSms(String mobile, String code, String msg) throws UnsupportedEncodingException {
        String smsSingleRequestServerUrl = Consts.SMS_SINGLE_REQUESTSERVER_URL;
        msg = msg.replace("CODE", code);
        String phone = mobile;
        String report= "true";
        SmsSendRequest smsSingleRequest = new SmsSendRequest(account, pswd, msg, phone,report);
        String requestJson = JSON.toJSONString(smsSingleRequest);
        System.out.println("before request string is: " + requestJson);
        String response = ChuangLanSmsUtil.sendSmsByPost(smsSingleRequestServerUrl, requestJson);
        System.out.println("response after request result is :" + response);
        SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);
        System.out.println("response  toString is :" + smsSingleResponse);
        return smsSingleResponse;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
        String msg = Consts.REG_TEMPLATE_CODE;
        String phone = "18012178021";
        String report= "true";
        SmsSendRequest smsSingleRequest = new SmsSendRequest(account, pswd, msg, phone,report);
        String requestJson = JSON.toJSONString(smsSingleRequest);
        System.out.println("before request string is: " + requestJson);
        String response = ChuangLanSmsUtil.sendSmsByPost(smsSingleRequestServerUrl, requestJson);
        System.out.println("response after request result is :" + response);
        SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);
        System.out.println("response  toString is :" + smsSingleResponse);
    }
}
