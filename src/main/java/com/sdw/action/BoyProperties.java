package com.sdw.action;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author SHIDIWEN
 * @create 2018-05-12 17:30
 * @desc 获取配置文件
 **/
@Component
@ConfigurationProperties(prefix = "boy")
public class BoyProperties {
    private String height;

    private String weight;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
