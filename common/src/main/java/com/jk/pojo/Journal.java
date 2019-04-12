/** 
 * <pre>项目名称:zsf123 
 * 文件名称:Log.java 
 * 包名:com.jk.zsf.pojo 
 * 创建日期:2019年1月23日下午4:29:43 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.pojo;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

/** 
 * <pre>项目名称：zsf123    
 * 类名称：Log    
 * 类描述：    
 * 创建人：张少飞 
 * 创建时间：2019年1月23日 下午4:29:43    
 * 修改人：张少飞 
 * 修改时间：2019年1月23日 下午4:29:43    
 * 修改备注：       
 * @version </pre>    
 */
@Document(collection="log")
public class Journal {
	private String id;
	private Integer userId;
	private String username;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createDate;
	private String ip;
	private String className;//类名
	private String method;//方法名
	private String reqParam;//请求
	private String repParam;//响应
	
	
	//业务字段
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date start;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date end;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getReqParam() {
		return reqParam;
	}
	public void setReqParam(String reqParam) {
		this.reqParam = reqParam;
	}
	public String getRepParam() {
		return repParam;
	}
	public void setRepParam(String repParam) {
		this.repParam = repParam;
	}
	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "Log [id=" + id + ", userId=" + userId + ", username=" + username + ", createDate=" + createDate
				+ ", ip=" + ip + ", className=" + className + ", method=" + method + ", reqParam=" + reqParam
				+ ", repParam=" + repParam + ", start=" + start + ", end=" + end + "]";
	}
	
}
