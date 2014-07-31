/**
 * @(#)DemoAnnotationService.java 2014-6-29
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
package lhj.dubbo.study.service;

import lhj.dubbo.study.service.model.Address;
import lhj.dubbo.study.service.model.Person;

/**
 * @author hongjian.liu
 * @version 1.0.0 2014-6-29
 * @since 1.0
 */
public interface DemoAnnotationService {
	String love(String name);
	
	//test pojo
	Person<Address> getPerson(String name);
}
