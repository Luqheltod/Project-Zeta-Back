package com.projectz.back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.projectz.back.model.Options;


@Mapper
public interface OptionsMapper {

	@Select("SELECT * FROM pz.maintexto WHERE id =#{id}")
	public Options getOptionsById(@Param("id")Integer id);
}
