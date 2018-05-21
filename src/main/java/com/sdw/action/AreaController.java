package com.sdw.action;
import com.sdw.aspect.HttpAspect;
import com.sdw.dao.model.Code;
import com.sdw.dao.model.CodeExample;
import com.sdw.entity.Area;
import com.sdw.service.AreaService;
import com.sdw.service.CodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
