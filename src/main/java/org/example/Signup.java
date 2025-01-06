package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Signup {
    private static AndroidDriver driver;

    private WebDriverWait wait;


    public Signup(AndroidDriver driver) {
        this.driver =driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(60));
    }
    private By skipbutton = By.xpath("//android.widget.Button[@content-desc=\"Skip\"]");
    private By SignupOption = By.xpath("//android.view.View[@content-desc=\"Sign up\"]");
    private By SelectCountryCod =By.xpath("//android.view.View[@content-desc=\"+44\"]");
    private By searchCountry = By.xpath("//android.widget.EditText");
    private By SelectCountryIndia = By.xpath("//android.view.View[@content-desc=\"+91\"]");
    private By ClickCountryIndia = By.xpath(" //android.widget.ImageView[@content-desc=\"India\"]");
    private By EnterPhoneNumber =By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
    private By EnterEmailID = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
    private By SignupButton = By.xpath("//android.widget.Button[@content-desc=\"Sign up\"]");
    private By PhoneNumberAlreadyExists =By.xpath("//android.view.View[@content-desc=\"Phone number already exists !\"]");
    private By EmailAlreadyExists =By.xpath("//android.view.View[@content-desc=\"Email already exists!\"]");
    private By SacredGrovesLogo = By.xpath("//android.view.View[@content-desc=\"Sacred\n" +
            "Groves\"]");


    public boolean SignupWithAlreadyExistsPhoneNumberAndEmailID() throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skipbutton));
        driver.findElement(skipbutton).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignupOption));
        driver.findElement(SignupOption).click();
        wait.until(ExpectedConditions.elementToBeClickable(SelectCountryCod));
        driver.findElement(SelectCountryCod).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchCountry));
        driver.findElement(searchCountry).click();
        driver.findElement(searchCountry).sendKeys("India");
        wait.until(ExpectedConditions.elementToBeClickable(ClickCountryIndia));
        driver.findElement(ClickCountryIndia).click();
        wait.until(ExpectedConditions.elementToBeClickable(EnterPhoneNumber));
        driver.findElement(EnterPhoneNumber).click();
        driver.findElement(EnterPhoneNumber).sendKeys("9550821167");
        wait.until(ExpectedConditions.elementToBeClickable(EnterEmailID));
        driver.findElement(EnterEmailID).click();
        driver.findElement(EnterEmailID).sendKeys("dharma@frugaltesting.com");
        wait.until(ExpectedConditions.elementToBeClickable(SacredGrovesLogo));
        driver.findElement(SacredGrovesLogo).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignupButton));
        driver.findElement(SignupButton).click();
        Thread.sleep(10000);
        if (driver.findElement(PhoneNumberAlreadyExists).isDisplayed()) {
            if (driver.findElement(EmailAlreadyExists).isDisplayed()) {
                return true;
            }
        }
        return false;

    }
    public boolean SignupWithAlreadyExistsPhoneNumber() throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skipbutton));
        driver.findElement(skipbutton).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignupOption));
        driver.findElement(SignupOption).click();
        wait.until(ExpectedConditions.elementToBeClickable(SelectCountryCod));
        driver.findElement(SelectCountryCod).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchCountry));
        driver.findElement(searchCountry).click();
        driver.findElement(searchCountry).sendKeys("India");
        wait.until(ExpectedConditions.elementToBeClickable(ClickCountryIndia));
        driver.findElement(ClickCountryIndia).click();
        wait.until(ExpectedConditions.elementToBeClickable(EnterPhoneNumber));
        driver.findElement(EnterPhoneNumber).click();
        driver.findElement(EnterPhoneNumber).sendKeys("9550821167");
        wait.until(ExpectedConditions.elementToBeClickable(EnterEmailID));
        driver.findElement(EnterEmailID).click();
        driver.findElement(EnterEmailID).sendKeys("dharmajgjk@frugaltesting.com");
        wait.until(ExpectedConditions.elementToBeClickable(SacredGrovesLogo));
        driver.findElement(SacredGrovesLogo).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignupButton));
        driver.findElement(SignupButton).click();
        Thread.sleep(10000);
        return driver.findElement(PhoneNumberAlreadyExists).isDisplayed();
    }
    public boolean SignupWithAlreadyExistsEmailID() throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skipbutton));
        driver.findElement(skipbutton).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignupOption));
        driver.findElement(SignupOption).click();
        wait.until(ExpectedConditions.elementToBeClickable(SelectCountryCod));
        driver.findElement(SelectCountryCod).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchCountry));
        driver.findElement(searchCountry).click();
        driver.findElement(searchCountry).sendKeys("India");
        wait.until(ExpectedConditions.elementToBeClickable(ClickCountryIndia));
        driver.findElement(ClickCountryIndia).click();
        wait.until(ExpectedConditions.elementToBeClickable(EnterPhoneNumber));
        driver.findElement(EnterPhoneNumber).click();
        driver.findElement(EnterPhoneNumber).sendKeys("8686645771");
        wait.until(ExpectedConditions.elementToBeClickable(EnterEmailID));
        driver.findElement(EnterEmailID).click();
        driver.findElement(EnterEmailID).sendKeys("dharma@frugaltesting.com");
        wait.until(ExpectedConditions.elementToBeClickable(SacredGrovesLogo));
        driver.findElement(SacredGrovesLogo).click();
        wait.until(ExpectedConditions.elementToBeClickable(SignupButton));
        driver.findElement(SignupButton).click();
        Thread.sleep(10000);
        return driver.findElement(SignupButton).isDisplayed();
    }

}
