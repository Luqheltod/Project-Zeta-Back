package com.projectz.back.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.projectz.back.model.InstadeathDto;
import com.projectz.back.model.Stage;



@Mapper
public interface GameMapper {

	
	@Select({
	"SELECT * FROM pz.stage WHERE id_stage =#{idStage}"})
	@Results(value = {
			
			@Result(property = "options", column = "id_stage", many = @Many(select = "com.projectz.back.mapper.OptionsMapper.getOptionsFromStageId"))
		
	})
	public Stage getStageInfoById(@Param("idStage")Long id);

	@Select({
	"SELECT * FROM pz.instadeath i WHERE id_options =#{idOption}"})
	public InstadeathDto getInstadeathInfo(@Param("idOption")Long idOption);
}
