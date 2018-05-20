package com.sdw.exception;/**
 * Created by Administrator on 2018/5/15.
 */

import com.sdw.enums.ResultEnum;

/**
 * @author SHIDIWEN
 * @create 2018-05-15 20:43
 * @desc 自定义异常
 **/
public class GirlExpection extends  RuntimeException {
    private Integer code ;

    public GirlExpection(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code=resultEnum.getCode();
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
