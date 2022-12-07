package org.example.practice.javaSamples;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PreviousTab {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.drive", "C:\\Users\\Neeraj Prasher\\OneDrive\\Documents\\projects\\sampleTest\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement element1 = driver.findElement(By.name("q"));
        element1.sendKeys("software testing");
        element1.sendKeys(Keys.ENTER);
        String a = Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.partialLinkText("Software testing - Wikipedia")).sendKeys(a);
        ArrayList<String> tabs2 = new ArrayList <String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }
}