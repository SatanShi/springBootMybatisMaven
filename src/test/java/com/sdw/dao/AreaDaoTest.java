package com.sdw.dao;

import com.sdw.entity.Area;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * junit 单元测试
 * Created by Administrator on 2018/5/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void queryArea() throws Exception {
        List<Area> area =areaDao.queryArea();
        Assert.assertEquals(2,area.size());
    }

    @Test
    @Ignore
    public void queryAreaById() throws Exception {
        Area area =areaDao.queryAreaById(1);
        //Assert.assertEquals();
    }

    @Test
    @Ignore
    public void insertArea() throws Exception {

    }

    @Test
    @Ignore
    public void updateArea() throws Exception {

    }

    @Test
    @Ignore
    public void deleteArea() throws Exception {

    }

}