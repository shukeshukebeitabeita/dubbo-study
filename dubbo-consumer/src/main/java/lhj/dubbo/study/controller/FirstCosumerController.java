/**
 * @(#)FirstCosumerController.java 2014-7-18
 *
 * Copyright (c) 2014-2015 BuShangBan (China) Int'l Co., Ltd
 * yongtai Road. pu dong District.Shanghai China
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of BuShangBan (China)
 *  Int'l Co., Ltd ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with BuShangBan (China).
 */
package lhj.dubbo.study.controller;

import javax.annotation.Resource;

import lhj.dubbo.study.service.DemoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hongjian.liu
 * @version 1.0.0 2014-7-18
 * @since 1.0
 */
@Controller
public class FirstCosumerController {
	@Resource(name="demoService")
	private DemoService demoService;
	
	
	@RequestMapping("index.htm")
	public String index(ModelMap model){
		
		String result = demoService.sayHello("world");
		model.put("result", result);
		
		
		return "index";
	}

}
