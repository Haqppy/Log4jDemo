package com.atguigu.dao;

import java.util.*;

import org.apache.log4j.Logger;

public class UserDaoImpl
{
	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);
	
	public void getUserInfo()
	{
		if (logger.isDebugEnabled())
		{
			logger.debug("getUserInfo() - start");
		}
		
		
		
		
		if (logger.isDebugEnabled())
		{
			logger.debug("getUserInfo() - end");
		}
	}
	
	
	public static void main(String[] args)
	{
		logger.debug("**********debug");
		logger.info("**********info");
		logger.warn("**********warn");
		logger.error("**********error");
		
		try
		{
			int age = 10/0;
			
			System.out.println("####"+age);
			
			logger.info("####"+age);
			
			
			if (logger.isInfoEnabled())
			{
				logger.info("main(String[]) - int age=" + age);
			}
			
			
			
			
		} catch (Exception e){
			e.printStackTrace();
			logger.error(e,e.getCause());;
		}
		
	}
}
