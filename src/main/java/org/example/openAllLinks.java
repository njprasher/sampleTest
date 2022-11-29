package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openAllLinks {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive", "C:\\Users\\Neeraj Prasher\\OneDrive\\Documents\\projects\\sampleTest\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com/");
        java.util.List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        for (WebElement link2: link) {

            //print the links i.e. http://google.com or https://www.gmail.com
            System.out.println(link2.getAttribute("href"));

            //print the links text
            System.out.println(link2.getText());
        }
    }
}