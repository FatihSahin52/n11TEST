package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class n11Test {
    WebDriver driver = new ChromeDriver();
    ChromeOptions chromeOptions= new ChromeOptions();
    String testUrl = "https://www.n11.com/";


    @Test
    public void logintest() throws InterruptedException {
        driver.get(testUrl);
        chromeOptions.addArguments("--kiosk");
        chromeOptions.addArguments("--disable-notifications");
        driver.manage().window().maximize();
        System.out.println("N11 web sitesi açılıyor.");
        driver.findElement(By.cssSelector(".btnSignIn")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys("mailiniz@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Şifreniz");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@title='Hesabım']"));




        driver.close();
    }
}
