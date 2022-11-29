package org.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitConditionCheck {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neeraj Prasher\\OneDrive\\Documents\\projects\\sampleTest\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-arguments");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Testing");
        element.submit();
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,duration);

        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("COVID")));
        element2.click();

        System.out.println("Clicked on first link");

        driver.quit();

    }}