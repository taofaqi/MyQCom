package com.ttpai.myqcom.network;

/**
 * Created by taofa on 2018/5/3.
 */

public class BaseEntity<T> {
    private static int SUCCESS_CODE = 200;//成功的code
    private int code;
    private String msg;
    private T data;

    public boolean isSuccess() {
//        return getCode() == SUCCESS_CODE;
        return true;
    }

    public static int getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static void setSuccessCode(int successCode) {
        SUCCESS_CODE = successCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
