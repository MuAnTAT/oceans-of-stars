package com.qw.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.qw.springboot.mapper.PostMapper;
import com.qw.springboot.pojo.Information;
import com.qw.springboot.pojo.PostJobInfor;

@Controller
public class PostController {
	@Autowired PostMapper postMapper;
	
	//发布职位
	@RequestMapping("/postJob")
	public String postJob(PostJobInfor p)throws Exception{
		return "postJob";
	}
	@RequestMapping("/submit")
	public String listPost(PostJobInfor p)throws Exception{
		postMapper.save(p);
		return "redirect:listPost?start=1";
	}
	
	//删除职位
	@RequestMapping("/deleteJob")
	public String deleteJob(PostJobInfor p)throws Exception{
		postMapper.delete(p.getId());
		return "redirect:listPost?start=1";
	}
	//编辑职位             -
	@RequestMapping("/updateJob")
	public String updateJob(PostJobInfor p)throws Exception{
		postMapper.update(p);
		return "redirect:listPost?start=1";
	}
	@RequestMapping("/editJob")
	public String listJob(int id,Model m)throws Exception{
		PostJobInfor p=postMapper.get(id);
		m.addAttribute("p",p);
		return "editJob";
	}
	//查看已发布职位(后台管理)
	@RequestMapping("/listPost")
	public String listPost(Model m,@RequestParam(value="start",defaultValue="0")int start,@RequestParam(value="size",defaultValue="5")int size)throws Exception{
		PageHelper.startPage(start,size);
		List<PostJobInfor> is=postMapper.findAll();
		PageInfo<PostJobInfor> page=new PageInfo<>(is);
		m.addAttribute("page",page);
		return "listPost";
	}
	//用户访问招聘职位(仅查看)
	@RequestMapping("/careers")
	public String careers(Model m,@RequestParam(value="start",defaultValue="0")int start,@RequestParam(value="size",defaultValue="5")int size)throws Exception{
		PageHelper.startPage(start,size);
		List<PostJobInfor> is=postMapper.findAll();
		PageInfo<PostJobInfor> page=new PageInfo<>(is);
		m.addAttribute("page",page);
		return "careers";
	}
	
	@RequestMapping("/addInfor")
	public String getPosition(Information i,int id,Model m)throws Exception{
		PostJobInfor ps=postMapper.getP(id);
		m.addAttribute("ps",ps);
		return "addInfor";
	}
	
}
