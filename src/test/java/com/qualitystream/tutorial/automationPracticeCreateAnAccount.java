package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPracticeCreateAnAccount {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Sign in");
	By registerPageLocator = By.xpath("//i[@class='icon-user left']");
	By userNameLocator = By.id("email_create");
	By registerBtnLocator = By.name("SubmitCreate");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void signIn() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			
			driver.findElement(userNameLocator).sendKeys("diegoaguirrel@hotmail.com");
			driver.findElement(registerBtnLocator).click();
		}
		else {
			System.out.print("No se encontro la pagina de Registro");
		}
		
	}

}
