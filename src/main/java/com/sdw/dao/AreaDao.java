package com.sdw.dao;
import com.sdw.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author SHIDIWEN
 * @create 2018-05-19 13:29
 * @desc dao文件
 **/
public interface AreaDao {
    /**
     * 集合
     * @return
     */
    List<Area> queryArea();

    /**
     * 实体类
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 更新
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
