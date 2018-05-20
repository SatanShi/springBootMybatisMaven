package com.sdw.enums;

/**
 * Created by Administrator on 2018/5/15.
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    MY_EXCEPTION(100,"我的异常1"),
    MY_EXCEPTION2(101,"我的异常2"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
