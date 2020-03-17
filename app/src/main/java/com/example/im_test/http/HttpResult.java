package com.example.im_test.http;

/**
 * Created by sh-lx on 2017/5/31.
 */

public class HttpResult<T> {

    // 请求状态
    private boolean success;

    private String desc;

    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



}
