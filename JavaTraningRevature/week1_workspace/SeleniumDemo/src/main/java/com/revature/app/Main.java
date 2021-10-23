package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080");
		
		//to pause 
		Thread.sleep(6000);
		
		// Locate the 2 input elements and button for adding numbers
		WebElement addInput1 = driver.findElement(By.id("addNum1"));
		WebElement addInput2 = driver.findElement(By.id("addNum2"));
		WebElement addButton = driver.findElement(By.id("addButton"));
		
		addInput1.sendKeys("90.9");
		addInput2.sendKeys("87.3");
		addButton.click();
		

		driver.switchTo().frame("addResult"); // Switch into the inside of the iframe
		
		WebElement addOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the addition result is embedded into inside of the iframe
		System.out.println("The result of adding 10.5 and 15.3 is " + addOutput.getText()); // print out the text of the output element
		

		driver.switchTo().defaultContent(); // Switch back outside of the iframe
		
	
		
		//quit method
		// whenever we are done with the scripted tasks we will provide to Selenium 
		// WebDriver. You should quit the driver.
		
		driver.quit();

	}

}
