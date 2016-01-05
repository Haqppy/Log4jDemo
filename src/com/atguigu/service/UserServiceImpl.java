package com.atguigu.service;

import org.apache.log4j.Logger;


public class UserServiceImpl
{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
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
		logger.debug("main(String[]) - debug");
		logger.info("main(String[]) - info");
		logger.warn("main(String[]) - warn");
		logger.error("main(String[]) - error");	
	}

}
