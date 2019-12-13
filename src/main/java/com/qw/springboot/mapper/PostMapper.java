package com.qw.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import com.qw.springboot.pojo.PostJobInfor;

@Mapper
public interface PostMapper {
	@Select("select * from recruit")
	List<PostJobInfor> findAll();
	
	@Insert("insert into recruit (position,degree,salary,experience) values(#{position},#{degree},#{salary},#{experience})")
	public int save(PostJobInfor infor);
	
	@Delete("delete from recruit where id=#{id}")
	public void delete(int id);
	
	@Select("select * from recruit where id=#{id}")
	public PostJobInfor get(int id);
	
	@Select("select position from recruit where id=#{id}")
	public PostJobInfor getP(int id);
	
	@Update("update recruit set position=#{position},degree=#{degree},salary=#{salary},experience=#{experience} where id=#{id}")
	public int update(PostJobInfor infor);
}
