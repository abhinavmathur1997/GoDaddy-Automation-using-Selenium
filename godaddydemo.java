package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class godaddydemo {
public static void main(String[] args)throws SocketException
{
;
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.godaddy.com/");
    driver.manage().window().setSize(new Dimension(1024, 768));
    

 String pageTitle = driver.getTitle();

 if(pageTitle == "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN") {
  System.out.println("Test Passed.");
 }
 else {
  System.out.println("Test Failed.");
 }


 driver.close();
 driver.quit();
}
}
