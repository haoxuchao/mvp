package com.example.im_test.entity;


import com.example.im_test.common.Constants;
import com.google.gson.annotations.SerializedName;

/**
 * @author Created by stone
 * @since 2019/2/23
 */
public class HttpStatus {

    @SerializedName("code")
    private String code;
    @SerializedName("desc")
    private String message;
    @SerializedName("success")
    private boolean status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * API是否请求失败
     *
     * @return 失败返回true, 成功返回false
     */
    public boolean codeIsInvalid() {
        return !code.equals(Constants.REQUEST_CODE);
    }

    public boolean statusIsFailure() {
        return !status;

    }
}
