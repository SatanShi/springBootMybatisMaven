package com.sdw.service;/**
 * Created by Administrator on 2018/5/12.
 */

import com.sdw.enums.ResultEnum;
import com.sdw.exception.GirlExpection;
import org.springframework.stereotype.Service;

import java.beans.Transient;

/**
 * @author SHIDIWEN
 * @create 2018-05-12 23:00
 * @desc service
 **/
@Service
public class HelloService {

    public void insert(){

    }

    public void getWeight() throws Exception{
        if(true){
            throw new GirlExpection(ResultEnum.MY_EXCEPTION);
        }else if(true){
            throw new GirlExpection(ResultEnum.MY_EXCEPTION2);
        }
    }
}
