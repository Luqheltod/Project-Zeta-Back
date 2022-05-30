package com.projectz.back.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.projectz.back.model.RestDto;

@Mapper
public interface RestMapper {
	
	@Select({
		"SELECT * FROM pzz.rest_info ri WHERE ri.id_rest_info = #{idRest} "
	})
	public RestDto getRestInfoByIdRest(@Param("idRest")Long idRest);

}
