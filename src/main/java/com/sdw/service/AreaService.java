package com.sdw.service;

import com.sdw.dao.AreaDao;
import com.sdw.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SHIDIWEN
 * @create 2018-05-12 23:00
 * @desc service
 **/
@Service
public class AreaService {
    @Autowired
    private AreaDao areaDao;

    public List<Area> queryArea(){
        return areaDao.queryArea();
    };
}
