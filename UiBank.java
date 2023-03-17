package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
    public static void main(String[] args) {
        //Chromedriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        //Maxime
        driver.manage().window().maximize();

        //Launch the url
        driver.get("https://uibank.uipath.com/register-account");
        //Firstname
        driver.findElement(By.id("firstName")).sendKeys("Kumaran");

        //title
        WebElement title = driver.findElement(By.id("title"));
        Select selectTitle = new Select(title);
        selectTitle.selectByValue("mr");

        //Middle name
        driver.findElement(By.id("middleName")).sendKeys("Maverick");
        //Lastname
        driver.findElement(By.id("lastName")).sendKeys("Arunagiri");

        //Gender
        WebElement gender = driver.findElement(By.name("gender"));
        Select selectGender = new Select(gender);
        selectGender.selectByValue("male");

        //Employment Status
        WebElement employmentStatus = driver.findElement(By.name("employmentStatus"));
        Select selectEmploymentStatus = new Select(employmentStatus);
        selectEmploymentStatus.selectByVisibleText("Unemployed");

        //Username
        driver.findElement(By.name("username")).sendKeys("Kumaran14");
        //Email
        driver.findElement(By.name("email")).sendKeys("kumaran@gmail.com");
        //Password
        driver.findElement(By.id("password")).sendKeys("984546413");
        //Close the browser
        driver.close();

    }
}
