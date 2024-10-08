package org.example.practice.javaSamples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitConditionCheck {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("software testing");
        element.submit();
        Duration duration = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(driver,duration);

        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Software QA testing")));
        element2.click();

        System.out.println("Clicked on first link");

        driver.quit();

    }}