package com.istic.base;


import java.io.Serializable;

public class Result implements Serializable {

	private static final long serialVersionUID = -8833553383219217359L;
	// 返回状态码   (默认0:成功,1:失败)
	private int code = 0;

	// 返回的消息提示
	private String message;

	// 成功时携带的数据
	private transient Object data;

	public int getCode() {
		return code;
	}

	public Result setCode(int code) {
		this.code = code;
		return this;
	}

	public String getMessage() {
		return message;
	}
	
	public Result setMessage(String message) {
		this.message = message;
		return this;
	}

	public Object getData() {
		return data;
	}

	public Result setData(Object data) {
		this.data = data;
		return this;
	}

	public Result addSuccess(String message) {
		this.message = message;
		this.code = 0;
		this.data = null;
		return this;
	}

	public Result addError(String message) {
		this.message = message;
		this.code = 1;
		this.data = null;
		return this;
	}

	public Result addFail(String message) {
		this.message = message;
		this.code = 999;
		this.data = null;
		return this;
	}

	public Result addWarn(String message) {
		this.message = message;
		this.code = 2;
		this.data = null;
		return this;
	}

	public boolean isSuccess() {
		return getCode() == 0;
	}
}
