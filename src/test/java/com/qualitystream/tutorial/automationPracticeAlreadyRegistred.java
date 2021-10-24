package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationPracticeAlreadyRegistred {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Sign in");
	By registerPageLocator = By.xpath("//i[@class='icon-lock left']");
	By userNameLocator = By.id("email");
	By passwordLocation = By.name("passwd");
	By signInBtnLocator = By.name("SubmitLogin");

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
	public void test() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			
			driver.findElement(userNameLocator).sendKeys("diiegoaguirrel@gmail.com");
			driver.findElement(passwordLocation).sendKeys("Diiego9503");
			driver.findElement(signInBtnLocator).click();
		}
		else {
			System.out.print("No se encontro la pagina de Iniciar Sesión");
		}
		
	}

}

