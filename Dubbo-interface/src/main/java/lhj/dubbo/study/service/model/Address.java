/**
 * @(#)Address.java 2014-7-31
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
package lhj.dubbo.study.service.model;

import java.io.Serializable;

/**
 * @author hongjian.liu
 * @version 1.0.0 2014-7-31
 * @since 1.0
 */
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6774692054770255415L;
	private String post;
	private String address;
	private String phon;
	/**
	 * @return the post
	 */
	public String getPost() {
		return post;
	}
	/**
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phon
	 */
	public String getPhon() {
		return phon;
	}
	/**
	 * @param phon the phon to set
	 */
	public void setPhon(String phon) {
		this.phon = phon;
	}
	
	
}
