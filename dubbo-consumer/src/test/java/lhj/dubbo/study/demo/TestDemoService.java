/**
 * @(#)TestDemoService.java 2014-7-31
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

import javax.annotation.Resource;

import lhj.dubbo.study.service.DemoService;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * TESTNG方式调用非注解形式的服务提供者. <br />
 * 不懂testng的可参考main方法调用类TestMainDemoService
 * 
 * @author hongjian.liu
 * @version 1.0.0 2014-7-31
 * @since 1.0
 */
// @ContextConfiguration(locations = {"classpath*:/context/*.xml"})
@ContextConfiguration(locations = { "/context/dubbo-common.xml",
		"/context/dubbo-consumer.xml" })
public class TestDemoService extends AbstractTestNGSpringContextTests {
	@Resource(name = "demoService")
	private DemoService demoService;

	@Test
	public void sayHello() {
		String hello = demoService.sayHello("dubbo"); // 执行远程方法

		System.out.println(hello); // 显示调用结果
	}
}
