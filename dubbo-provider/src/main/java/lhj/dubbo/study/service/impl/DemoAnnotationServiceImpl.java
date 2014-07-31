/**
 * @(#)DemoAnnotationServiceImpl.java 2014-6-29
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

import java.util.ArrayList;
import java.util.List;

import lhj.dubbo.study.service.DemoAnnotationService;
import lhj.dubbo.study.service.model.Address;
import lhj.dubbo.study.service.model.Person;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author hongjian.liu
 * @version 1.0.0 2014-6-29
 * @since 1.0
 */
@Service(version="1.0.0")
public class DemoAnnotationServiceImpl implements DemoAnnotationService {

	/* (non-Javadoc)
	 * @see lhj.dubbo.study.service.DemoAnnotationService#love(java.lang.String)
	 */
	public String love(String name) {
		
		return "Annotation--Hello " + name;
	}

	/* (non-Javadoc)
	 * @see lhj.dubbo.study.service.DemoAnnotationService#getPerson(java.lang.String)
	 */
	public Person<Address> getPerson(String name) {
		//test pojo
		Person<Address> person = new Person<Address>();
		person.setName(name);
		person.setAge("18");
		person.setSex("girl");
		List<Address> list = new ArrayList<Address>();
		Address ad = new Address();
		ad.setAddress("xxx");
		ad.setPhon("13671555555");
		ad.setPost("200000");
		list.add(ad);
		person.setList(list);
		
		
		return person;
	}

}
