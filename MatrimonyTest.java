package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MatrimonyTest {
    public static void main(String[] args) {
        //Chromedriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        //Maxime
        driver.manage().window().maximize();

        //Launch the url
        driver.get("https://www.tamilmatrimony.in/");

        //Select profile Dropdown
        WebElement registered_by = driver.findElement(By.name("REGISTERED_BY"));
        Select selectRegisteredBy = new Select(registered_by);
        selectRegisteredBy.selectByValue("1");

        //Name
        driver.findElement(By.name("NAME")).sendKeys("Kumaran");

        //Gender radio button
        WebElement gender = driver.findElement(By.xpath("(//input[@class = 'hp-gender'])[1]"));
        gender.click();

        //DOB day
        WebElement dayDropDown = driver.findElement(By.name("DOBDAY"));
        Select selectDay = new Select(dayDropDown);
        selectDay.selectByValue("14");

        //DOB month
        WebElement monthDropDown = driver.findElement(By.name("DOBMONTH"));
        Select selectMonth = new Select(monthDropDown);
        selectMonth.selectByValue("8");

        //DOB year
        WebElement yearDropDown = driver.findElement(By.name("DOBYEAR"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByValue("2001");

        //Religion
        WebElement religionDropDown = driver.findElement(By.id("RELIGION"));
        Select selectReligion = new Select(religionDropDown);
        selectReligion.selectByValue("1");

        //Mother Tongue
        WebElement motherTongueDropDown = driver.findElement(By.id("MOTHERTONGUE"));
        Select selectMotherTongue = new Select(motherTongueDropDown);
        selectMotherTongue.selectByValue("47");

        //Country code
        WebElement CountryCodeDropDown = driver.findElement(By.id("M_COUNTRYCODE"));
        Select selectCountryCode = new Select(CountryCodeDropDown);
        selectCountryCode.selectByValue("98");

        //Country
        WebElement countryDropDown = driver.findElement(By.id("COUNTRY"));
        Select selectCountry = new Select(countryDropDown);
        selectCountry.selectByValue("98");

        //Mobile number
        driver.findElement(By.id("MOBILENO")).sendKeys("1234566876");
        //Email ID
        driver.findElement(By.id("EMAIL")).sendKeys("spidey123@gmail.com");
        //Password
        driver.findElement(By.name("PASSWD1")).sendKeys("46468468");

        //For closing the browser
        driver.quit();

    }
}
