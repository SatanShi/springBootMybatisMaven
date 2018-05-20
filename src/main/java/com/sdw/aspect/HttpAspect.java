package com.sdw.aspect;/**
 * Created by Administrator on 2018/5/14.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author SHIDIWEN
 * @create 2018-05-14 21:38
 * @desc 记录请求  使用AOP记录请求
 **/
@Aspect
@Component
public class HttpAspect {
    private  final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public  * com.sdw.action.HelloController.*(..))")
    public  void log(){

    }
    @Before("log()")
    public void doBefore(){
        //System.out.println();
        //logger.info("请求之前");
        //url
        ServletRequestAttributes attributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("url={}",request.getRequestURI());
        //method
        logger.info("method={}",request.getMethod());
        //id
        logger.info("id={}",request.getRemoteAddr());
        //类方法
       // logger.info("class_method={}", joinPoint);
        //参数
    }

    @After("log()")
    public void doAfter(){
        //System.out.println("请求之后");
        logger.info("请求之后");
    }
}
