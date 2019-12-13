package com.qw.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		return "admin/index";
	}
	
	@RequestMapping("/")
	public String example() {
		return "index1";
	}
	@RequestMapping("/404")
	public String test404() {
		return "";
	}
	@RequestMapping("/test01")
	public String test01() {
		return "webM";
	}
	@RequestMapping("/login")
	public String test02() {
		return "admin/login";
	}
	@RequestMapping("/rbac-admin")
	public String test03() {
		return "admin/rbac-admin";
	}
	@RequestMapping("/rbac-user-list")
	public String test04() {
		return "admin/rbac-user-list";
	}
	@RequestMapping("/welcome")
	public String test05() {
		return "admin/welcome";
	}
	@RequestMapping("/system")
	public String test06() {
		return "admin/system";
	}
	@RequestMapping("/admin-info")
	public String test07() {
		return "admin/admin-info";
	}
	@RequestMapping("/position-add")
	public String test08() {
		return "admin/position-add";
	}
	@RequestMapping("/position-list")
	public String test09() {
		return "admin/position-list";
	}
	@RequestMapping("/position-edit")
	public String test10() {
		return "admin/position-edit";
	}
	@RequestMapping("/infor-list")
	public String test11() {
		return "admin/infor-list";
	}
	@RequestMapping("/infor-edit")
	public String test12() {
		return "admin/infor-edit";
	}
	@RequestMapping("/product-add")
	public String test13() {
		return "admin/product-add";
	}
	@RequestMapping("/product-list")
	public String test14() {
		return "admin/product-list";
	}
	@RequestMapping("/product-edit")
	public String test15(){
		return "admin/product-edit";
	}
	@RequestMapping("/order-form")
	public String test16(){
		return "admin/order-form";
	}
	@RequestMapping("/order-edit")
	public String test17(){
		return "admin/order-edit";
	}
	@RequestMapping("/article-detail")
	public String test18() {
		return "admin/article-detail";
	}
	@RequestMapping("/article-list")
	public String test19() {
		return "admin/article-list";
	}
	@RequestMapping("/article-edit")
	public String test20(){
		return "admin/article-edit";
	}
	@RequestMapping("/article-add")
	public String test22(){
		return "admin/article-add";
	}
}
