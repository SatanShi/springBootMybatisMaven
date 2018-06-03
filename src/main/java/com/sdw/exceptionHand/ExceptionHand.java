package com.sdw.exceptionHand;/**
 * Created by Administrator on 2018/5/15.
 */

import com.sdw.exception.GirlExpection;
import com.sdw.dao.model.Result;
import com.sdw.utils.ResultUtil;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @author SHIDIWEN
 * @create 2018-05-15 20:38
 * @desc 全局异常捕获
 **/
@ControllerAdvice
public class ExceptionHand {
    private final static Logger logger = LoggerFactory.getLogger(ExceptionHand.class);

    @ExceptionHandler(value = Exception.class)
    public Object hand(Exception e, HttpServletRequest request,
                       HttpServletResponse response) {
        if(isAjax(request)){
                //ajax异常
                return ResultUtil.error(0,e.getMessage());
        }else{
            if(e instanceof GirlExpection){
                GirlExpection girlExpection =(GirlExpection)e;
                return ResultUtil.error(girlExpection.getCode(),girlExpection.getMessage());
            }else{
                logger.error("[系统异常]{}",e);
                return ResultUtil.error(-1,"未知错误");
            }
        }
    }

    /**
     * 判断是否ajax请求
     * @param request
     * @return
     */
    public static boolean isAjax(HttpServletRequest request){
        return (request.getHeader("X-Requested-With")!=null
                && "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
    }
}
