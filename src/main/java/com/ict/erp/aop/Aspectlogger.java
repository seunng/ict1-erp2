package com.ict.erp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ict.erp.HomeController;

@Service
@Aspect /*메모리 생성하지 않음*/
public class Aspectlogger {

	private static final Logger logger = LoggerFactory.getLogger(Aspectlogger.class);
	@Before("execution(*com.ict.erp.controller.URIcontroller.*(..))")
	public void beforeLog(JoinPoint jp) {
		logger.debug("jp=>{}",jp);
		
	}
}

