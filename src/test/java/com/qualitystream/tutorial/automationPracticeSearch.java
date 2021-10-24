package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPracticeSearch {
	
	private WebDriver driver;
	By searchLocation = By.name("search_query");
	By searchBtnLocator = By.name("submit_search");

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
			driver.findElement(searchLocation).sendKeys("Dress");
			driver.findElement(searchBtnLocator).click();
		
	}

}
