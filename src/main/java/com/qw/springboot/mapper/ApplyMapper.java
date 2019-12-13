package com.qw.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.qw.springboot.pojo.Information;

@Mapper
public interface ApplyMapper {

	@Select("select * from resume")
	List<Information> findAll();
	
	@Insert("insert into resume (name,age,position,phone) values(#{name},#{age},#{position},#{phone})")
	public int save(Information infor);
	
	@Delete("delete from resume where id=#{id}")
	public void delete(int id);
	
	@Select("select * from resume where id=#{id}")
	public Information get(int id);
	
	@Update("update resume set name=#{name},age=#{age},position=#{position},phone=#{phone} where id=#{id}")
	public int update(Information infor);
}
