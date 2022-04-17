package com.projectz.back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.projectz.back.model.Stage;



@Mapper
public interface GameMapper {

	
	@Select("SELECT * FROM pz.maintexto WHERE id =#{id}")
	public Stage getStageInfoById(@Param("id")Long id);
}
