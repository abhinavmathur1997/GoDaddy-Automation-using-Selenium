package demo;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.SocketException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

public class godaddydemo1 {

	public static void main(String[] args)throws SocketException, InterruptedException, NoSuchElementException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.godaddy.com/");
		    driver.manage().window().setSize(new Dimension(1024, 768));
		    driver.findElement(By.className("hf-phcpy7u")).sendKeys(Keys.RETURN);
		    Thread.sleep(3000);
		    driver.findElement(By.className("hf-bco7y7j")).click();
		    driver.findElement(By.className("hf-pypzz58")).sendKeys(Keys.RETURN);
		    String pageTitle="Search & Buy Available Domains - Register a Domain with GoDaddy";
		    String actualTitle=driver.getTitle();
		    if(pageTitle.equals(actualTitle))
		    {
		    	System.out.println("Title matches");
		    }
		    else
		    {
		    	System.out.println("No title match");
		    }

		    	}}