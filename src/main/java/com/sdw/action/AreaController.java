package com.sdw.action;
import com.sdw.aspect.HttpAspect;
import com.sdw.entity.Area;
import com.sdw.service.AreaService;
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

    @RequestMapping(value = {"/list"},method = RequestMethod.GET)
    public List<Area> queryArea(){
        return areaService.queryArea();
    }
}
