package io.me;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javacodegeeks.examples.logbackmavenexample.beans.Message;

public class Data {
	
	private static final Logger logger = LoggerFactory.getLogger(Data.class);
	
	public void getData()
	{
		logger.info("INFO mode.......");
		logger.debug("DEBUG mode.......");
		logger.error("ERROR mode.......");
	}

}
