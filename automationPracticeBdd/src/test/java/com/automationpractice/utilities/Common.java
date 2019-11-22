package com.automationpractice.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * created Sep 22, 2019, upd Oct 27, 2019
 * 
 * @author Denis
 *
 */

public final class Common {

	private static Logger logger = Logger.getLogger(Common.class);

	public static final String USER_HOME_DIR = System.getProperty("user.home");
	public static final String USER_HOME = System.getProperty("user.dir");

	private Common() {
	}

	public static void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
			logger.info("sleep for " + seconds + " seconds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void deleteFiles(String directoryPath) {
		File file = new File(System.getProperty("user.dir") + directoryPath);
		for (File file1 : file.listFiles()) {
			boolean isFileDeleted = file1.delete();
			if (isFileDeleted) {
				System.out.println("File \"" + file1.toPath().getFileName() + "\" deleted");
			} else {
				System.out.println("File \"" + file1.toPath().getFileName() + "\" not deleted");
			}
		}

	}

	public static String takeScreenshotForReporting(WebDriver driver) {
		long ms = System.currentTimeMillis();
		String path = System.getProperty("user.dir") + "/target/screenshots" + "/Screenshot" + ms;

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		// getScreenshotAs method to create image file
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		try {
			// Move image file to new destination
			// Copy file at destination
			FileUtils.copyFile(file, new File(path + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return path + ".png";
	}

	public static boolean isFile(String pathname) {
		File file = new File(pathname);
		boolean isFile = file.exists();
		
		int numberOfAttempts = 0;
		while (!isFile && numberOfAttempts <= 5) {
			sleep(1);
			isFile = file.exists();
			numberOfAttempts++;
		}
		return isFile;
	}

	public static void failTest(String errorMessage) {

		throw new RuntimeException(errorMessage);

	}

	void q() {
		TestDataGenerator.getRandomInt(1, 2);
	}

}
