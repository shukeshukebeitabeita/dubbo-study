/**
 * @(#)TestMainDemoService.java 2014-7-31
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
package lhj.dubbo.study.demo;

import lhj.dubbo.study.service.DemoService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * main方法方式调用非注解形式的服务提供者
 * @author hongjian.liu
 * @version 1.0.0 2014-7-31
 * @since 1.0
 */
public class TestMainDemoService {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/context/dubbo-common.xml",
						"/context/dubbo-consumer.xml" });
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String hello = demoService.sayHello("world"); // 执行远程方法
		
		System.out.println(hello); // 显示调用结果
	}
}
