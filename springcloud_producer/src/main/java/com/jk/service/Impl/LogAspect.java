/** 
 * <pre>项目名称:ssm-maven-wdd 
 * 文件名称:LogAspect.java 
 * 包名:com.jk.wdd.service.impl 
 * 创建日期:2018年12月27日上午9:59:03 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service.Impl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.jk.pojo.Journal;
import com.jk.utils.CommonUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;



/** 
 * <pre>项目名称：ssm-maven-wdd    
 * 类名称：LogAspect    
 * 类描述：    
 * 创建人：wdd   
 * 创建时间：2018年12月27日 上午9:59:03    
 * 修改人：wdd 
 * 修改时间：2018年12月27日 上午9:59:03    
 * 修改备注：       
 * @version </pre>    
 */
//声明该类为一个切面类
@Aspect
//如果一个类不属于controller层不属于service层页不属于dao层那么用真个注解
@Component
public class LogAspect {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	//切点的注解  是指那些方法需要被执行"AOP"
	@Pointcut("execution(* com.jk.service..*.*(..))")
	public void logPoinCut(){}//定义一个切入点
	
	//返回后通知value="logPoinCut()"是指通知是在logPoinCut()切点返回后通知的
	//returning="rtv"是返回值
	//@AfterReturning这个注解是返回后通知的注解
	@AfterReturning(value="logPoinCut()",returning="rtv")
	//JoinPoint是连接点的意思我们要获取到的如类名，方法名，请求参数等都是从连接点中取出来的
	public void afterLog(JoinPoint joinpoint,Object rtv){
		System.out.println("进去切点。。。。。");
		Journal logBean = new Journal();
		logBean.setCreateDate(new Date());
		//获取类名
		String classname = joinpoint.getTarget().getClass().getSimpleName();
		logBean.setClassName(classname);
		//获取方法名
		String method = joinpoint.getSignature().getName();
		logBean.setMethod(method);
		//获取请求参数
		String reqparam = "";
		Object[] args = joinpoint.getArgs();
		for (Object object : args) {
			reqparam+="||"+object.toString();
		}
		logBean.setReqParam(reqparam);
		//返回值
		if(rtv!=null){
			logBean.setRepParam(rtv.toString());
		}
		//获取request对象
	ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();
		/*	UserBean user = (UserBean) request.getSession().getAttribute("user");
		if(user!=null){
			logBean.setUserId(user.getId());
		}*/
		//获取ip地址是封装好的一个类
		String ip = CommonUtils.getIp(request);
		logBean.setIp(ip);
		//保存mongodb
		mongoTemplate.save(logBean);
	}
	
	
}
