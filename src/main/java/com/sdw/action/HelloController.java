package com.sdw.action;
import com.sdw.aspect.HttpAspect;
import com.sdw.model.BoyModel;
import com.sdw.model.Result;
import com.sdw.service.HelloService;
import com.sdw.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author SHIDIWEN
 * @create 2018-05-12 16:52
 * @desc spring boot 开始之旅
 **/
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    private  final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
    @Value("${cupSize}")
    private String cupSize;
    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Value("${jdbc.url}")
    private String url;
    @Autowired
    private BoyProperties boyProperties;

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = {"/say","/hi"},method = RequestMethod.POST)
    public String say(){
        return url;
    }

    @RequestMapping(value = "/cupSize",method = RequestMethod.GET)
    public String cupSize(){
        return cupSize;
    }

    @RequestMapping(value = "/age",method = RequestMethod.GET)
    public Integer age(){
        return age;
    }

    @RequestMapping(value = "/content",method = RequestMethod.GET)
    public String content(){
        return content;
    }

    @RequestMapping(value = "boyProperties",method = RequestMethod.GET)
    public String boyProperties(){
        return boyProperties.getHeight();
    }

    /**
     * /getParam/100
     * @param id
     * @return
     */
    @RequestMapping(value = "/getParam/{id}",method = RequestMethod.GET)
    public String getParam(@PathVariable("id") Integer id){
        return "id:"+id;
    }

    /**
     * /getParam2?id=100
     * @param id
     * @return
     */
    @RequestMapping(value = "/getParam2",method = RequestMethod.GET)
    public String getParam2(@RequestParam(value = "id",required = false ,defaultValue = "0") Integer id){
        return "id:"+id;
    }

    /**
     * 验证对象  BoyModel
     * @param boy
     * @return
     */
    @RequestMapping(value = "/insertBoy",method = RequestMethod.GET)
    public Result<BoyModel> insertBoy(@Valid BoyModel boy, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            //获取错误信息
            //System.out.println(bindingResult.getFieldError().getDefaultMessage());
            logger.info(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        helloService.insert();
        return ResultUtil.success(boy);
    }

    /**
     * 异常捕获
     * @return
     */
    @RequestMapping(value = "/insertBoyException",method = RequestMethod.GET)
    public void insertBoyException()throws Exception{
        helloService.getWeight();
    }
}
