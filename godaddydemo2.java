package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class godaddydemo2 {
    public static void main(String[] args) throws InterruptedException {
        // Set system property for WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Set Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("accept-language=en-US,en;q=0.9");
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");
        // Uncomment if you want to run in headless mode
        // options.addArguments("--headless");
        
        // You can also set a proxy here if needed
        // options.addArguments("--proxy-server=http://<proxy-ip>:<proxy-port>");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.godaddy.com/");
        driver.manage().window().maximize();
        Thread.sleep((long) (Math.random() * 5000));  // Random delay to mimic human browsing
        
        try {
            // Create WebDriverWait instance
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            // Wait for the search input to be present and enter the domain name
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("searchText"))).sendKeys("mydomain" + Keys.RETURN);

            // Validate the page title after the search
            String currentPageTitle = driver.getTitle();
            String expectedPageTitle = "Search & Buy Available Domains - Register a Domain with GoDaddy";
            
            if (currentPageTitle.equalsIgnoreCase(expectedPageTitle)) {
                System.out.println("Titles match");
            } else {
                System.out.println("No matches");
            }

            // Use a more stable XPath or better locator if possible for the button click
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'ux-text ux-button favorites text-black bg-transparent border-0 rounded text-primary-o spin-left-icon ux-button-square ux-text-action')]"))).click();
            Thread.sleep((long) (Math.random() * 5000));  // Random delay to mimic human browsing
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
