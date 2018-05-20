package com.sdw.model;/**
 * Created by Administrator on 2018/5/14.
 */

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.validation.constraints.Min;

/**
 * @author SHIDIWEN
 * @create 2018-05-14 21:17
 * @desc 实体类
 **/
public class BoyModel {

    private String name;

    private Integer id;

    @Min(value = 18,message = "最小年龄18")
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
