package com.sdw.utils;/**
 * Created by Administrator on 2018/5/14.
 */

import com.sdw.model.Result;

/**
 * @author SHIDIWEN
 * @create 2018-05-14 22:17
 * @desc 工具类
 **/
public class ResultUtil {
    public static Result success(Object o){
        Result result =new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(o);
        return result;
    }

    public static Result success(){
        return success(null);
    }
    public static Result error(Integer code ,String msg){
        Result result =new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
