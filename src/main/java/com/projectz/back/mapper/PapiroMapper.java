package com.projectz.back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.projectz.back.model.Papiro;

@Mapper
public interface PapiroMapper {

	
	@Select("SELECT * FROM pz.maintexto WHERE id =#{id}")
	public Papiro findPapiro(@Param("id")Integer id);
}
