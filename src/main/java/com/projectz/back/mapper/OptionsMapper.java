package com.projectz.back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.projectz.back.model.Options;


@Mapper
public interface OptionsMapper {

	@Select({
		"SELECT * FROM pz.options o WHERE o.id_options = #{idStage} "
	})
	public Options getOptionsFromStageId(@Param("idStage")Long idStage);
}
