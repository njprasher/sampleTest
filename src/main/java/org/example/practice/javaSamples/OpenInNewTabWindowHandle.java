package org.example.practice.javaSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class OpenInNewTabWindowHandle {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com");
    WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("software testing");
        element.submit();
    String str = Keys.chord(Keys.CONTROL, Keys.RETURN);
    WebElement element2 =      driver.findElement(By.partialLinkText("Software"));
        element2.sendKeys(str);
    String str2 = driver.getWindowHandle();
    Set<String> str3 = driver.getWindowHandles();
        for(String obj: str3) {
        if(!obj.equals(str2)) {
            driver.switchTo().window(obj);
        }
    }
        driver.quit();

}
}
