package com.sdw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdw.dao.TestMapper;
import com.sdw.dao.model.Test;
import com.sdw.dao.model.TestExample;
import com.sdw.daoEx.TestMapperEx;

@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	/*@Autowired
	private TestMapperEx testMapperEx;*/

	public int countByExample(TestExample example) {
		return this.testMapper.countByExample(example);
	}

	public Test selectByPrimaryKey(Integer id) {
		return this.testMapper.selectByPrimaryKey(id);
	}

	public List<Test> selectByExample(TestExample example) {
		return this.testMapper.selectByExample(example);
	}

	public Test selectOne(TestExample example) {
		List<Test> list = this.testMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	public int deleteByPrimaryKey(Integer id) {
		return this.testMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Test record) {
		return this.testMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Test record) {
		return this.testMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(TestExample example) {
		return this.testMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Test record, TestExample example) {
		return this.testMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Test record, TestExample example) {
		return this.testMapper.updateByExample(record, example);
	}

	public int insertSelective(Test record) {
		return this.testMapper.insertSelective(record);
	}

}
