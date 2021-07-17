package com.simpliLearnLog4j;

import org.testng.annotations.Test;

import java.io.ObjectInputFilter.Config;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

public class Logtester2 {
	
	private static Logger logger = LogManager.getLogger(Logtester2.class.getName());
	

  @BeforeClass
  public void beforeClass() {
	  //System.out.println(Logtester2.class.getName()+"------------Before Class ---------------------");
	  //BasicConfigurator.configure(); // as we have added log4j.properties
	  PropertyConfigurator.configure("log4j.properties");;
//	  logger.setLevel(Level.FATAL);
	  logger.info("::----Before Logs-----::");
  }
  @Test
  public void f() {
	  System.out.println("----------------Test----------------");
	  logger.debug("Debug Level Log");
	  logger.info("INFO---test log4j----");
	  logger.warn("Warn Level Log");
	  logger.error("Error Level Log");
	  logger.trace("Trace Level Log");
	  logger.fatal("Fatal Level Log");
  }

}
