package org.example.practice.javaSamples;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neeraj Prasher\\OneDrive\\Documents\\projects\\sampleTest\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("SoftwareTestingHelp");
        element.sendKeys(Keys.ENTER);
        js.executeScript("window.scrollBy(0,1000)");

    }

}