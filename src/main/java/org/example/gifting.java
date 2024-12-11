package org.example;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class gifting {
    private static AndroidDriver driver;

    private WebDriverWait wait;

    public gifting(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    private By Actions = By.xpath("//android.widget.ImageView[@content-desc=\"Actions\"]");
    private By EcoFriendlyGifting = By.xpath("//android.view.View[@content-desc=\"Eco Friendly Gifting\"]");
    private By PersonalEcoFriendlyGifts = By.xpath("//android.view.View[@content-desc=\"Personal Eco-Friendly Gifts\"]");
    private By AllContacts = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    private By ChooseOccasionOthers = By.xpath("//android.widget.Button[@content-desc=\"Others\"]");
    private By ChooseOccasionCongratulations = By.xpath("//android.view.View[@content-desc=\"Congratulations\"]");
    private By ChooseOccasionAppreciation = By.xpath("//android.view.View[@content-desc=\"Appreciation\"]");
    private By ChooseOccasionCelebrations = By.xpath("//android.view.View[@content-desc=\"Celebrations\"]");
    private By ChooseOccasionGeneral = By.xpath("//android.widget.Button[@content-desc=\"General\"]");
    private By ChooseOccasionGetWellSoon = By.xpath("//android.view.View[@content-desc=\"Get Well Soon\"]");
    private By ChooseOccasionGoodBye = By.xpath("//android.view.View[@content-desc=\"Good Bye\"]");
    private By ChooseOccasionMissingYou = By.xpath("//android.view.View[@content-desc=\"Missing You \"]");
    private By ChooseOccasionsorry = By.xpath("//android.view.View[@content-desc=\"Sorry\"]");
    private By ChooseOccasionSympathy = By.xpath("//android.view.View[@content-desc=\"Sympathy\"]");
    private By RecipientName = By.xpath("//android.widget.Button[@content-desc=\"Enter recipient details\"]/following-sibling::android.widget.EditText[1]");
    private By RecipientEmail = By.xpath("//android.widget.Button[@content-desc=\"Enter recipient details\"]/following-sibling::android.widget.EditText[2]");
    private By RecipientNumber = By.xpath("//android.widget.Button[@content-desc=\"Enter recipient details\"]/following-sibling::android.widget.EditText[3]");
    private By Message = By.xpath("//android.view.View[@content-desc=\"£\"]//preceding-sibling::android.widget.EditText[1]");
    private By EnterRecipientDetails = By.xpath("//android.widget.Button[@content-desc=\"Enter recipient details\"]");
    private By GBPCurrency = By.xpath("//android.view.View[@content-desc=\"£\"]");
    private By UsdCurrency = By.xpath("//android.view.View[@content-desc=\"$\"]");
    private By TermsAndConditions = By.xpath("//android.widget.CheckBox");
    private By PayNowButton = By.xpath("//android.widget.Button[@content-desc=\"Pay Now\"]");
    private By GiftFromSGCsBalanceButton = By.xpath("//android.widget.Button[@content-desc=\"Gift from your SGC balance?\"]");
    private By ErrorMessageForField = By.xpath("//android.view.View[@content-desc=\"Field is empty\"]");

    public void SendGiftWithFromSGCsBalance() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.elementToBeClickable(EcoFriendlyGifting));
        driver.findElement(EcoFriendlyGifting).click();
        wait.until(ExpectedConditions.elementToBeClickable(PersonalEcoFriendlyGifts));
        driver.findElement(PersonalEcoFriendlyGifts).click();
        Thread.sleep(10000);
        driver.findElement(AllContacts).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionOthers));
        driver.findElement(ChooseOccasionOthers).click();
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionCongratulations));
        driver.findElement(ChooseOccasionCongratulations).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(RecipientEmail));
        driver.findElement(RecipientEmail).click();
        Thread.sleep(10000);
        driver.findElement(RecipientEmail).sendKeys("ankitSDET01@gmail.com");
        Thread.sleep(10000);
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(RecipientName));
        driver.findElement(RecipientName).click();
        driver.findElement(RecipientName).click();
        Thread.sleep(10000);
        driver.findElement(RecipientName).sendKeys("ankit");
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(Message));
        driver.findElement(Message).click();
        Thread.sleep(10000);
        driver.findElement(Message).sendKeys("Test gift");
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditions));
        driver.findElement(TermsAndConditions).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(GiftFromSGCsBalanceButton));
        driver.findElement(GiftFromSGCsBalanceButton).click();
        Thread.sleep(10000);
    }

    public void scroll(String pageDirection, double scrollRatio) {
        Duration SCROLL_DUR = Duration.ofMillis(300);
        if (scrollRatio < 0 || scrollRatio > 1) {
            throw new Error("Scroll distance must be between 0 and 1");
        }
        Dimension size = driver.manage().window().getSize();
        Point midPoint = new Point((int) (size.width * 0.5), (int) (size.height * 0.5));
        int bottom = midPoint.y + (int) (midPoint.y * scrollRatio);
        int top = midPoint.y - (int) (midPoint.y * scrollRatio);
        int left = midPoint.x - (int) (midPoint.x * scrollRatio);
        int right = midPoint.x + (int) (midPoint.x * scrollRatio);
        if (pageDirection == "UP") {
            //Swipe Top to bottom, Page will go UP
            swipe(new Point(midPoint.x, top), new Point(midPoint.x, bottom), SCROLL_DUR);
        } else if (pageDirection == "DOWN") {
            swipe(new Point(midPoint.x, bottom), new Point(midPoint.x, top), SCROLL_DUR);
        } else if (pageDirection == "LEFT") {
            swipe(new Point(left, midPoint.y), new Point(right, midPoint.y), SCROLL_DUR);
        } else {
            //RIGHT
            swipe(new Point(right, midPoint.y), new Point(left, midPoint.y), SCROLL_DUR);
        }
    }

    public void swipe(Point start, Point end, Duration duration) {//core function to swipe in scroll method
        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipe = new Sequence(input, 0);
        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(ImmutableList.of(swipe));
    }

    public void scrollRightTill(By elementToFind, By endElement) throws Exception {
        int foundElem = 0;
        while (foundElem == 0) {
            scroll("RIGHT", 0.6);
            foundElem = driver.findElements(elementToFind).size();
            if (foundElem == 1) {
                foundElem++;
                break;
            }
            if (driver.findElements(endElement).size() == 1) {
                break;
            }
        }
        if (foundElem == 0) {
            throw new Exception("Element Not Found");
        }
    }

    public void ScrollDownTill(By elementToFind, By endElement) throws Exception {
        int foundElem = 0;
        while (foundElem == 0) {
            scroll("DOWN", 0.8);
            foundElem = driver.findElements(elementToFind).size();
            if (foundElem == 1) {
                break;
            }
            if (driver.findElements(endElement).size() == 1) {
                break;
            }
        }
        if (foundElem == 0) {
            throw new Exception("Element Not Found");
        }
    }

    public boolean SendGiftWithoutMessage() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.elementToBeClickable(EcoFriendlyGifting));
        driver.findElement(EcoFriendlyGifting).click();
        wait.until(ExpectedConditions.elementToBeClickable(PersonalEcoFriendlyGifts));
        driver.findElement(PersonalEcoFriendlyGifts).click();
        Thread.sleep(10000);
        driver.findElement(AllContacts).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionOthers));
        driver.findElement(ChooseOccasionOthers).click();
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionCongratulations));
        driver.findElement(ChooseOccasionCongratulations).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(RecipientEmail));
        driver.findElement(RecipientEmail).click();
        Thread.sleep(10000);
        driver.findElement(RecipientEmail).sendKeys("ankitSDET01@gmail.com");
        Thread.sleep(10000);


        wait.until(ExpectedConditions.elementToBeClickable(RecipientName));
        driver.findElement(RecipientName).click();
        driver.findElement(RecipientName).click();
        Thread.sleep(10000);
        driver.findElement(RecipientName).sendKeys("ankit");
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.4);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditions));
        driver.findElement(TermsAndConditions).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(GiftFromSGCsBalanceButton));
        driver.findElement(GiftFromSGCsBalanceButton).click();
        Thread.sleep(10000);
        scroll("Up", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(ErrorMessageForField));
        return driver.findElement(ErrorMessageForField).isDisplayed();
    }

    public boolean SendGiftWithoutEmail() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.elementToBeClickable(EcoFriendlyGifting));
        driver.findElement(EcoFriendlyGifting).click();
        wait.until(ExpectedConditions.elementToBeClickable(PersonalEcoFriendlyGifts));
        driver.findElement(PersonalEcoFriendlyGifts).click();
        Thread.sleep(10000);
        driver.findElement(AllContacts).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionOthers));
        driver.findElement(ChooseOccasionOthers).click();
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionCongratulations));
        driver.findElement(ChooseOccasionCongratulations).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(RecipientName));
        driver.findElement(RecipientName).click();
        driver.findElement(RecipientName).click();
        Thread.sleep(10000);
        driver.findElement(RecipientName).sendKeys("ankit");
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(Message));
        driver.findElement(Message).click();
        Thread.sleep(10000);
        driver.findElement(Message).sendKeys("Test gift");
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditions));
        driver.findElement(TermsAndConditions).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(GiftFromSGCsBalanceButton));
        driver.findElement(GiftFromSGCsBalanceButton).click();
        Thread.sleep(10000);
        scroll("UP", 0.4);
        wait.until(ExpectedConditions.elementToBeClickable(ErrorMessageForField));
        return driver.findElement(ErrorMessageForField).isDisplayed();
    }

    public boolean SendGiftWithoutName() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.elementToBeClickable(EcoFriendlyGifting));
        driver.findElement(EcoFriendlyGifting).click();
        wait.until(ExpectedConditions.elementToBeClickable(PersonalEcoFriendlyGifts));
        driver.findElement(PersonalEcoFriendlyGifts).click();
        Thread.sleep(10000);
        driver.findElement(AllContacts).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionOthers));
        driver.findElement(ChooseOccasionOthers).click();
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionCongratulations));
        driver.findElement(ChooseOccasionCongratulations).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(RecipientEmail));
        driver.findElement(RecipientEmail).click();
        Thread.sleep(10000);
        driver.findElement(RecipientEmail).sendKeys("ankitSDET01@gmail.com");
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(Message));
        driver.findElement(Message).click();
        Thread.sleep(10000);
        driver.findElement(Message).sendKeys("Test gift");
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditions));
        driver.findElement(TermsAndConditions).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(GiftFromSGCsBalanceButton));
        driver.findElement(GiftFromSGCsBalanceButton).click();
        Thread.sleep(10000);
        scroll("Up", 0.5);
        wait.until(ExpectedConditions.elementToBeClickable(ErrorMessageForField));
        return driver.findElement(ErrorMessageForField).isDisplayed();
    }

    public void SendGiftFromPayNow() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.elementToBeClickable(EcoFriendlyGifting));
        driver.findElement(EcoFriendlyGifting).click();
        wait.until(ExpectedConditions.elementToBeClickable(PersonalEcoFriendlyGifts));
        driver.findElement(PersonalEcoFriendlyGifts).click();
        Thread.sleep(10000);
        driver.findElement(AllContacts).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionOthers));
        driver.findElement(ChooseOccasionOthers).click();
        wait.until(ExpectedConditions.elementToBeClickable(ChooseOccasionCongratulations));
        driver.findElement(ChooseOccasionCongratulations).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(RecipientEmail));
        driver.findElement(RecipientEmail).click();
        Thread.sleep(10000);
        driver.findElement(RecipientEmail).sendKeys("ankitSDET01@gmail.com");
        Thread.sleep(10000);
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(RecipientName));
        driver.findElement(RecipientName).click();
        driver.findElement(RecipientName).click();
        Thread.sleep(10000);
        driver.findElement(RecipientName).sendKeys("ankit");
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(Message));
        driver.findElement(Message).click();
        Thread.sleep(10000);
        driver.findElement(Message).sendKeys("Test gift");
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditions));
        driver.findElement(TermsAndConditions).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowButton));
        driver.findElement(PayNowButton).click();
        Thread.sleep(10000);
    }
    public void SendGiftFromSGCWithoutAnyData() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.elementToBeClickable(EcoFriendlyGifting));
        driver.findElement(EcoFriendlyGifting).click();
        wait.until(ExpectedConditions.elementToBeClickable(PersonalEcoFriendlyGifts));
        driver.findElement(PersonalEcoFriendlyGifts).click();
        Thread.sleep(10000);
        driver.findElement(AllContacts).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.7);
        wait.until(ExpectedConditions.elementToBeClickable(GiftFromSGCsBalanceButton));
        driver.findElement(GiftFromSGCsBalanceButton).click();
        Thread.sleep(10000);
    }
    public void SendGiftFromPayNowWithoutAnyData() throws InterruptedException {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.elementToBeClickable(EcoFriendlyGifting));
        driver.findElement(EcoFriendlyGifting).click();
        wait.until(ExpectedConditions.elementToBeClickable(PersonalEcoFriendlyGifts));
        driver.findElement(PersonalEcoFriendlyGifts).click();
        Thread.sleep(10000);
        driver.findElement(AllContacts).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.7);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowButton));
        driver.findElement(PayNowButton).click();
        Thread.sleep(10000);

    }
}




