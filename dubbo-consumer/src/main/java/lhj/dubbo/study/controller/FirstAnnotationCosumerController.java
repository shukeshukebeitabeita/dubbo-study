/**
 * @(#)FirstAnnotationCosumerController.java 2014-6-29
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

import lhj.dubbo.study.service.DemoAnnotationService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * @author hongjian.liu
 * @version 1.0.0 2014-6-29
 * @since 1.0
 */
@Controller
//@Component
public class FirstAnnotationCosumerController {
	@Reference(version="1.0.0")
	private DemoAnnotationService demoAnnotationService;
	
	
	@RequestMapping("index2.htm")
	public String index(ModelMap model){
		long startTime = System.currentTimeMillis();
		String result = demoAnnotationService.love("world");
		model.put("result", result);
		
		long endTime = System.currentTimeMillis();
		model.put("useTimes", endTime-startTime);
		
		return "index";
	}
}
