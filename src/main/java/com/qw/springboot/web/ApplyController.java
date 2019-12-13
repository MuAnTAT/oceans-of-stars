package com.qw.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qw.springboot.mapper.ApplyMapper;
import com.qw.springboot.pojo.Information;

@Controller
public class ApplyController {
@Autowired ApplyMapper applyMapper;

//添加个人履历(用户访问)
/*
@RequestMapping("/addInfor")
public String addInfor(Information i) throws Exception{
	return "addInfor";
}
*/
@RequestMapping("/subInfor")
public String listInfor(Information i) throws Exception{
	applyMapper.save(i);
	return "redirect:apply_success";
}
//提交成功
@RequestMapping("/apply_success")
public String applySuccess() {
	return "apply_success";
}
//删除个人履历(暂时后台管理,有账户中心后交由个人管理)
@RequestMapping("/deleteInfor")
public String deleteInfor(Information i) throws Exception{
	applyMapper.delete(i.getId());
	return "redirect:listInfor?start=1";
}
//编辑个人履历(暂时后台管理,有账户中心后交由个人管理)
@RequestMapping("/updateInfor")
public String updateInfor(Information i)throws Exception{
	applyMapper.update(i);
	return "redirect:listInfor?start=1";
}
@RequestMapping("/editInfor")
public String listInfor(int id,Model m)throws Exception{
	Information i=applyMapper.get(id);
	m.addAttribute("i",i);
	return "editInfor";
}
//查看投递个人履历(后台管理)
@RequestMapping("/listInfor")
public String listInfor(Model m,@RequestParam(value="start",defaultValue="0")int start,@RequestParam(value="size",defaultValue="5")int size)throws Exception{
	PageHelper.startPage(start,size);
	List<Information> is=applyMapper.findAll();
	PageInfo<Information> page=new PageInfo<>(is);
	m.addAttribute("page",page);
	return "listInfor";
}
}
