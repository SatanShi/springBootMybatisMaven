package com.sdw.action;

import com.sdw.aspect.HttpAspect;
import com.sdw.dao.model.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SHIDIWEN
 * @create 2018-05-12 16:52
 * @desc spring boot 模板引擎
 **/
@Controller
@RequestMapping(value = "th")
public class TheymleafController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        return "thymeleaf/index";
    }
    @RequestMapping("/center")
    public String center(ModelMap map){
        map.addAttribute("name","thymeleaf-sdw");
        Test test = new Test();
        test.setId(0);
        test.setName("<div style='color: red;'>第一</div>");
        map.addAttribute("test",test);
        return "thymeleaf/other/center";
    }
    @RequestMapping("/postform")
    public String postform(Test test){
        System.out.println(test.getName());
        return "thymeleaf/other/center";
    }
}
