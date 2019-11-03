package com.automationpractice.utilities;

import java.io.File;

import org.apache.log4j.Logger;


/**
 * created Sep 22, 2019, 
 * upd Oct 27, 2019
 * @author Denis
 *
 */

public final class Common {

	private static Logger logger = Logger.getLogger(Common.class);
	
	private Common() {}
	
	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
			logger.info("sleep for "+ seconds + " seconds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}

	
	public static void deleteFiles(String directoryPath) {
		File file = new File(System.getProperty("user.dir")+directoryPath);
		for (File file1:file.listFiles()) {
			boolean isFileDeleted=file1.delete();
			if(isFileDeleted) {
				System.out.println("File \"" + file1.toPath().getFileName() 
	                    + "\" deleted");
			}else {
				System.out.println("File \"" + file1.toPath().getFileName()
	                    + "\" not deleted");
			}
		}
		
	}
	public static void failTest(String errorMessage){
		
		throw new RuntimeException(errorMessage);
		
	}
	
	void q() {
		TestDataGenerator.getRandomInt(1, 2);
	}

}
