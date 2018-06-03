package com.sdw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdw.dao.TestMapper;
import com.sdw.dao.model.Test;
import com.sdw.dao.model.TestExample;
import com.sdw.daoEx.TestMapperEx;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	@Autowired
	private TestMapperEx testMapperEx;

	/**
	 * Propagation.REQUIRED
	 * Propagation.SUPPORTS
	 *
	 REQUIRED：支持当前事务，如果当前没有事务，就新建一个事务。这是最常见的选择。

	 SUPPORTS：支持当前事务，如果当前没有事务，就以非事务方式执行。

	 MANDATORY：支持当前事务，如果当前没有事务，就抛出异常。

	 REQUIRES_NEW：新建事务，如果当前存在事务，把当前事务挂起。

	 NOT_SUPPORTED：以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。

	 NEVER：以非事务方式执行，如果当前存在事务，则抛出异常。

	 NESTED：支持当前事务，如果当前事务存在，则执行一个嵌套事务，如果当前没有事务，就新建
	 */
	@Transactional(propagation = Propagation.SUPPORTS)
	public int countByExample(TestExample example) {
		return this.testMapper.countByExample(example);
	}
	@Transactional(propagation = Propagation.SUPPORTS)
	public Test selectByPrimaryKey(Integer id) {
		return this.testMapper.selectByPrimaryKey(id);
	}
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Test> selectByExample(TestExample example) {
		return this.testMapper.selectByExample(example);
	}
	@Transactional(propagation = Propagation.SUPPORTS)
	public Test selectOne(TestExample example) {
		List<Test> list = this.testMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public int deleteByPrimaryKey(Integer id) {
		return this.testMapper.deleteByPrimaryKey(id);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public int updateByPrimaryKeySelective(Test record) {
		return this.testMapper.updateByPrimaryKeySelective(record);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public int updateByPrimaryKey(Test record) {
		return this.testMapper.updateByPrimaryKey(record);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public int deleteByExample(TestExample example) {
		return this.testMapper.deleteByExample(example);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public int updateByExampleSelective(Test record, TestExample example) {
		return this.testMapper.updateByExampleSelective(record, example);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public int updateByExample(Test record, TestExample example) {
		return this.testMapper.updateByExample(record, example);
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public int insertSelective(Test record) {
		return this.testMapper.insertSelective(record);
	}

}
