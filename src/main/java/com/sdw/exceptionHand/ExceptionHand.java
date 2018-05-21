package com.sdw.exceptionHand;/**
 * Created by Administrator on 2018/5/15.
 */

import com.sdw.exception.GirlExpection;
import com.sdw.dao.model.Result;
import com.sdw.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author SHIDIWEN
 * @create 2018-05-15 20:38
 * @desc 异常捕获
 **/
@ControllerAdvice
public class ExceptionHand {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHand.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result hand(Exception e){
        if(e instanceof GirlExpection){
            GirlExpection girlExpection =(GirlExpection)e;
            return ResultUtil.error(girlExpection.getCode(),girlExpection.getMessage());
        }else{
            logger.error("[系统异常]{}",e);
            return ResultUtil.error(-1,"未知错误");
        }
    }
}
