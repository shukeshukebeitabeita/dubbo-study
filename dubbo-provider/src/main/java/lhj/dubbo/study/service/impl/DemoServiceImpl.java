/**
 * @(#)DemoServiceImpl.java 2014-7-21
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
package lhj.dubbo.study.service.impl;

import lhj.dubbo.study.service.DemoService;

/**
 * @author hongjian.liu
 * @version 1.0.0 2014-7-21
 * @since 1.0
 */
public class DemoServiceImpl implements DemoService {

	/* (non-Javadoc)
	 * @see lhj.dubbo.study.service.DemoService#sayHello(java.lang.String)
	 */
	public String sayHello(String name) {
		return "liuhongjian--Hello " + name;
	}

}
