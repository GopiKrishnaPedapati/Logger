package com.javacodegeeks.examples.logbackmavenexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javacodegeeks.examples.logbackmavenexample.beans.Message;

import io.me.Data;

public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		Message message = new Message();
		Data data=new Data();
		
		logger.debug("Starting debugging");
		
		message.sayHello();
		data.getData();
		
		logger.debug("Ending debugging");
	}
}
