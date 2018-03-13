package com.fh.common.domain;

public class Res {
	private int errno;
	private String msg;
	private Object data;
	public final static int SUCCESS = 1;
	public final static int ERROR = 0;
	private Integer code = ERROR;
	public Res() {
	}
	public Res(boolean success, String msg){
		this.code = success ? 1 : 0;
		this.msg = msg;
	}
	public Res(boolean success, String msg,Object data){
		this.code = success ? 1 : 0;
		this.msg = msg;
		this.data=data;
	}
	public static Res data(Object data){
		return new Res().setData(data);
	}
	public static Res data(boolean success){
		return new Res().setErrno(success ? 0 : 1);
	}
	public static Res data(int errno, String errmsg){
		return new Res().setErrno(errno).setMsg(errmsg);
	}
	public static Res errno(int errno){
		return new Res().setErrno(errno);
	}
	public static Res success(String msg){
		return new Res().setSuccess(1).setMsg(msg);
	}
	public static Res success(Object data){
		return new Res().setSuccess(1).setMsg("success").setData(data);
	}
	public static Res success(String msg,Object data){
		return new Res().setSuccess(1).setMsg(msg).setData(data);
	}
	public static Res success(){
		return new Res().setSuccess(1);
	}
	public static Res error(String msg){
		return new Res().setErrno(0).setMsg(msg);
	}
	public boolean isSuccess(){
		return errno == 0;
	}
	public int getErrno() {
		return errno;
	}
	public Res setErrno(int code) {
		this.code = code;
		return this;
	}
	public Res setSuccess(int code) {
		this.code = code;
		return this;
	}
	public String getMsg() {
		return msg;
	}
	public Res setMsg(String msg) {
		this.msg = msg;
		return this;
	}
	public Object getData() {
		return data;
	}
	public Res setData(Object data) {
		this.data = data;
		return this;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
}
