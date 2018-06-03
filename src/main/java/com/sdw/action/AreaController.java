package com.sdw.action;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.sdw.aspect.HttpAspect;
import com.sdw.dao.model.*;
import com.sdw.daoEx.model.TestEx;
import com.sdw.entity.Area;
import com.sdw.service.AreaService;
import com.sdw.service.CodeService;
import com.sdw.service.TestService;
import com.sdw.task.AsyncTask;
import com.sdw.utils.ResultUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.Future;

/**
 * @author SHIDIWEN
 * @create 2018-05-12 16:52
 * @desc spring boot 开始之旅
 **/
@RestController
@RequestMapping(value = "/area")
public class AreaController {
    private  final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
    @Autowired
    private AreaService areaService;
    @Autowired
    private CodeService codeService;
    @Autowired
    private TestService testService;
    @Autowired
    private AsyncTask asyncTask;
    @RequestMapping("test1")
    public String test1() throws Exception {
        long start =System.currentTimeMillis();
        Future<Boolean> a =asyncTask.doTask11();
        Future<Boolean> b =asyncTask.doTask22();
        Future<Boolean> c =asyncTask.doTask33();
        while(!a.isDone() || !b.isDone() || !c.isDone()){
            if(a.isDone() && b.isDone() && c.isDone()){
                break;
            }
        }
        long end =System.currentTimeMillis();
        String times ="任务全部完成,总耗时;"+(end - start)+" 毫秒";
        System.out.println(times);
        return  times;
    }
    @RequestMapping(value = {"/list"},method = RequestMethod.GET)
    public List<Area> queryArea(){
        return areaService.queryArea();
    }

    @RequestMapping(value = {"/getCode"},method = RequestMethod.GET)
    public Code getCode(){
        return codeService.selectByPrimaryKey(132970);
    }
    @RequestMapping(value = {"/getCodeList"},method = RequestMethod.GET)
    public List<Code> getCodeList(){
        CodeExample codeExample =new CodeExample();
        codeExample.setOrderByClause("code desc");
        //  codeExample.createCriteria().andCodeEqualTo(132970);
        List<Code> list = codeService.selectByExample(codeExample);
        return list;
    }

    /**
     * 分页
     * @return
     */
    @RequestMapping(value = {"/getTestList"},method = RequestMethod.GET)
    public List<Test> getTestList(int page,int rows){
        PageHelper.startPage(page,rows);
        TestExample testExample =new TestExample();
        List<Test> list =testService.selectByExample(testExample);
        return list;
    }

    /**
     * 返回带code  msg 和data的json字符串
     * @return
     */
    @RequestMapping(value = {"/getTest"},method = RequestMethod.GET)
    public Result getTest(){
       Test test=testService.selectByPrimaryKey(1);
        return   ResultUtil.success(test);
    }

}
