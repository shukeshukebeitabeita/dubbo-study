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
package lhj.dubbo.study;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动xml配置方式，即非注解方式
 * @author hongjian.liu
 * @version 1.0.0 2014-7-31
 * @since 1.0
 */
public class TestStartXmlServer {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/context/dubbo-common.xml",  "/context/dubbo-service.xml"});
		context.start();
		
		System.in.read(); // 按任意键退出
	}
}
