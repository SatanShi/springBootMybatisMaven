package com.sdw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sdw.dao.model.Code;
import com.sdw.dao.model.CodeExample;

public interface CodeMapper {
	int countByExample(CodeExample example);

	int deleteByExample(CodeExample example);

	int deleteByPrimaryKey(Integer code);

	int insert(Code record);

	int insertSelective(Code record);

	List<Code> selectByExample(CodeExample example);

	Code selectByPrimaryKey(Integer code);

	int updateByExampleSelective(@Param("record") Code record,@Param("example") CodeExample example);

	int updateByExample(@Param("record") Code record,@Param("example") CodeExample example);

	int updateByPrimaryKeySelective(Code record);

	int updateByPrimaryKey(Code record);

}
