package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FaceBookTest {
    public static void main(String[] args) {
        //Chromedriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        //Maxime
        driver.manage().window().maximize();

        //Launch the url
        driver.get("https://www.facebook.com/");

        //Waiting time for the software
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Create new account
        driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
        //Firstname
        driver.findElement(By.name("firstname")).sendKeys("Kumaran");
        //Lastname
        driver.findElement(By.name("lastname")).sendKeys("Arunagiri");
        //Contact number
        driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
        //Password
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");

        //DOB day
        WebElement dayDropDown = driver.findElement(By.name("birthday_day"));
        Select selectDay = new Select(dayDropDown);
        selectDay.selectByValue("14");

        //DOB month
        WebElement monthDropDown = driver.findElement(By.name("birthday_month"));
        Select selectMonth = new Select(monthDropDown);
        selectMonth.selectByValue("8");

        //DOB year
        WebElement yearDropDown = driver.findElement(By.name("birthday_year"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByValue("2001");

        //Radio button
        WebElement maleRadio = driver.findElement(By.xpath("//input[@value = '2']"));
        maleRadio.click();

        //Close the browser
        driver.close();



    }
}
