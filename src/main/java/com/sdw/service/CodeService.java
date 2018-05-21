package com.sdw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdw.dao.CodeMapper;
import com.sdw.dao.model.Code;
import com.sdw.dao.model.CodeExample;
import com.sdw.daoEx.CodeMapperEx;

@Service
public class CodeService {
	@Autowired
	private CodeMapper codeMapper;
	/*@Autowired
	private CodeMapperEx codeMapperEx;*/

	public int countByExample(CodeExample example) {
		return this.codeMapper.countByExample(example);
	}

	public Code selectByPrimaryKey(Integer code) {
		return this.codeMapper.selectByPrimaryKey(code);
	}

	public List<Code> selectByExample(CodeExample example) {
		return this.codeMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(Integer code) {
		return this.codeMapper.deleteByPrimaryKey(code);
	}

	public int updateByPrimaryKeySelective(Code record) {
		return this.codeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Code record) {
		return this.codeMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(CodeExample example) {
		return this.codeMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Code record, CodeExample example) {
		return this.codeMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Code record, CodeExample example) {
		return this.codeMapper.updateByExample(record, example);
	}

	public int insertSelective(Code record) {
		return this.codeMapper.insertSelective(record);
	}

}
