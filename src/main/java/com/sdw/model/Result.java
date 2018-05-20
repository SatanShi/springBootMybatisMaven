package com.sdw.model;/**
 * Created by Administrator on 2018/5/14.
 */

/**
 * @author SHIDIWEN
 * @create 2018-05-14 22:10
 * @desc http请求返回的对象
 **/
public class Result<T> {
    /**错误码**/
    private Integer code ;
    /**提示信息**/
    private String msg;
    /**具体内容**/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
