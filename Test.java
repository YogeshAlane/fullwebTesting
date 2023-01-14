package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.getProperty("Webdriver.chrome.driver ", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Software/Offline%20Website/index.html ");
		//driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input ")).sendKeys("kiran@gmail.com"); //username
		driver.findElement(By.xpath(" /html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");// password
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button ")).click(); //submit button
		
		
		driver.findElementByXPath("/html/body/div/aside/section/ul/li[3]/a ").click(); // user button
		driver.findElementByXPath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button ").click(); //add button
		driver.findElementByXPath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[1]/div/input ").sendKeys("YOGESH ALANE"); // username
		driver.findElementByXPath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[2]/div/input ").sendKeys("9175185944");//mobile no
		driver.findElementByXPath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[3]/div/input ").sendKeys("yogesha@6gmail.com "); // email
		
		
		driver.findElementByXPath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[4]/div/input ").sendKeys("core java"); // course
		driver.findElementByXPath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[5]/label").isSelected();//male and female
		driver.findElementByXPath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select ").sendKeys("maharaster"); // state
		driver.findElementByXPath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[7]/div/input").sendKeys("333457890");//password
		driver.findElementByXPath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/button ").click();//submit button
		driver.findElementByXPath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input ").sendKeys("9595952233"); //mobile.no
		
		
		
	}

}
