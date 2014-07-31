/**
 * @(#)TestAnnotationDemoService.java 2014-7-31
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
package lhj.dubbo.study.demo.annotation;

import lhj.dubbo.study.service.DemoAnnotationService;
import lhj.dubbo.study.service.model.Address;
import lhj.dubbo.study.service.model.Person;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * 注意，此类所在包，也应该是在dubbo注解扫描范围。如果不在，请在注解扫描中加入此包，以都号分割。
 * <dubbo:annotation package="lhj.dubbo.study" />
 * or <dubbo:annotation package="lhj.dubbo.study,lhj.test" />
 * @author hongjian.liu
 * @version 1.0.0 2014-7-31
 * @since 1.0
 */
@ContextConfiguration(locations = { "/context/dubbo-common.xml",
		"/context/dubbo-consumer.xml" })
public class TestAnnotationDemoService extends AbstractTestNGSpringContextTests {
	@Reference(version = "1.0.0")
	private DemoAnnotationService demoAnnotationService;

	@Test
	public void sayHello() {
		String result = demoAnnotationService.love("dubbo");
		System.out.println(result);
	}
	
	//test pojo
	@Test
	public void getPerson() {
		Person<Address> person = demoAnnotationService.getPerson("liuhongjian");
		System.out.println(person.getName());
		System.out.println(person.getList().get(0).getAddress());
	}
}
