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

public class dashboard {
    private static AndroidDriver driver;

    private WebDriverWait wait;

    public dashboard(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    private By Actions = By.xpath("//android.widget.ImageView[@content-desc=\"Actions\"]");
    private By BecomeAGuardian = By.xpath("//android.widget.Button[@content-desc=\"Become a Guardian\"]");
    private By LearnMore = By.xpath("//android.widget.Button[@content-desc=\"Learn More\"]");
    private By ExploreSquad = By.xpath("//android.widget.Button[@content-desc=\"Explore Squads\"]");
    private By StartCompletingProfile = By.xpath("//android.widget.Button[@content-desc=\"Start completing\"]");
    private By ViewCollectibles = By.xpath("//android.widget.Button[@content-desc=\"View Collectibles\"]");
    private By FollowUS = By.xpath("//android.widget.Button[@content-desc=\"Follow us\"]");
    private By LearnMoreAboutUs = By.xpath("//android.widget.Button[@content-desc=\"Learn more about us\"]");
    private By FaceBook = By.xpath("//android.widget.ScrollView/android.widget.ImageView[1]");
    private By linkDin = By.xpath("//android.widget.ScrollView/android.widget.ImageView[3]");
    private By Instagram = By.xpath("//android.widget.ScrollView/android.widget.ImageView[2]");
    private By WhBatIsSacredGrovesVideo = By.xpath("//android.widget.ImageView[@content-desc=\"What is Sacred Groves\"]/android.view.View[2]");
    private By BenefitsBecomingGuardian = By.xpath("//android.widget.ImageView[@content-desc=\"The benefits of becoming a Guardian\"]/android.view.View[2]");
    private By BecomingGuardianOnMobileApp = By.xpath("//android.widget.ImageView[@content-desc=\"How to become a Guardian by downloading our Mobile Application\"]/android.view.View[2]");
    private By SubscribeClusterOnMobileApp = By.xpath("//android.widget.ImageView[@content-desc=\"Subscribe to Sacred Groves Cluster on our Mobile app\"]/android.view.View[2]");
    private By StepByStepReceivingAGiftOnMobileApp = By.xpath("//android.widget.ImageView[@content-desc=\"A step by step guide to receiving a Sacred Groves Cluster as a gift by downloading our Mobile Application\"]/android.view.View[2]");
    private By WelcomeBackMessage = By.xpath("//android.view.View[@content-desc=\"Welcome Back\"]");
    private By ClusterData = By.xpath("//android.view.View[@index=6]");
    private By ChoosePlan = By.xpath("//android.widget.Button[@content-desc=\"Choose Plan\"]");
    private By SeedlingPLan = By.xpath("//android.widget.TextView[@text=\"Subscribe to Seedling\"]");
    private By sproutPlan = By.xpath("//android.widget.TextView[@text=\"Subscribe to sprout\"]");
    private By safariPlan = By.xpath("//android.widget.TextView[@text=\"Subscribe to safari\"]");
    private By OneTime = By.xpath("//android.view.View[@content-desc=\"One Time\"]");
    private By BackButtOnFromStripe = By.xpath("//android.widget.TextView[@text=\"Back\"]");
    private By StripePage = By.xpath("//android.view.View[@content-desc=\"Powered by Stripe\"]");
    private By EnterNumberOfClusters = By.xpath("//android.widget.EditText[@index=4]");
    private By TermsAndConditionsCheckBox = By.xpath("//android.widget.CheckBox");
    private By PayNowButton = By.xpath("//android.widget.Button[@content-desc=\"Pay Now\"]");
    private By FindOutHow = By.xpath("//android.widget.Button[@content-desc=\"Find out How\"]");
    private By ClickOnGiftCard = By.xpath("//android.widget.ScrollView/android.view.View[4]/android.view.View/android.view.View/android.widget.ImageView[2]");
    private By ReadMore = By.xpath("//android.widget.Button[@content-desc=\"Read More\"]");
    private By SeedlingPlanAmount =By.xpath("//android.widget.TextView[@text=\"£40.00\"]");
    private By sproutPlanAmount =By.xpath("//android.widget.TextView[@text=\"£80.00\"]");
    private By safariPlanAmount =By.xpath("//android.widget.TextView[@text=\"£200.00\"]");
    private By GBPCurrency =By.xpath("//android.view.View[@content-desc=\"GBP\"]");
    private By USCurrency =By.xpath("//android.view.View[@content-desc=\"USD\"]");
    private By OneTimeCheckOneNumber =By.xpath("//android.widget.TextView[@text=\"£160.00\"]");
    private By OneTimeCheckThreeNumber =By.xpath("//android.widget.TextView[@text=\"£160.00\"]");
    private By OneTimeCheckFourNumber =By.xpath("//android.widget.TextView[@text=\"£160.00\"]");
    private By OneTimeCheckTwoNumber =By.xpath("//android.widget.TextView[@text=\"£160.00\"]");

    public void ClickOnSeedlingGBP() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(ChoosePlan));
        driver.findElement(ChoosePlan).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(SeedlingPLan));
        if (driver.findElement(SeedlingPLan).isDisplayed() && driver.findElement(SeedlingPlanAmount).isDisplayed()) {
        } else {
            System.out.println("Either SeedlingPLan or SeedlingPlanAmount is not displayed.");
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
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
    public void ClickOnSproutPlanGBP() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(ChoosePlan));
        driver.findElement(ChoosePlan).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(sproutPlan));
        if (driver.findElement(sproutPlan).isDisplayed() && driver.findElement(sproutPlanAmount).isDisplayed()) {
        } else {
            System.out.println("Either sproutPlan or sproutPlanAmount is not displayed.");
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
    }
    public void ClickOnSafariPlanGBP() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(ChoosePlan));
        driver.findElement(ChoosePlan).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(sproutPlan));
        if (driver.findElement(safariPlan).isDisplayed() && driver.findElement(safariPlanAmount).isDisplayed()) {
        } else {
            System.out.println("Either safariPlan or safariPlanAmount is not displayed.");
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
    }
    public void ClickOnTimeGBPOneNumber() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(OneTime));
        driver.findElement(OneTime).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(EnterNumberOfClusters));
        driver.findElement(EnterNumberOfClusters).click();
        driver.findElement(EnterNumberOfClusters).sendKeys("2");
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditionsCheckBox));
        driver.findElement(TermsAndConditionsCheckBox).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowButton));
        driver.findElement(PayNowButton).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(OneTimeCheckOneNumber));
        if (driver.findElement(OneTimeCheckOneNumber).isDisplayed()) {
        } else {
            System.out.println("Either OneTimeOneNumberGBPCurrency is not displayed.");
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
    }
    public void ClickOnTimeGBPTwoNumbers() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(OneTime));
        driver.findElement(OneTime).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(EnterNumberOfClusters));
        driver.findElement(EnterNumberOfClusters).click();
        driver.findElement(EnterNumberOfClusters).clear();
        driver.findElement(EnterNumberOfClusters).sendKeys("43");
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditionsCheckBox));
        driver.findElement(TermsAndConditionsCheckBox).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowButton));
        driver.findElement(PayNowButton).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(OneTimeCheckTwoNumber));
        if (driver.findElement(OneTimeCheckTwoNumber).isDisplayed()) {
        } else {
            System.out.println("Either OneTimeTwoNumberGBPCurrency is not displayed.");
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
    }
    public void ClickOnTimeGBPThreeNumbers() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(OneTime));
        driver.findElement(OneTime).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(EnterNumberOfClusters));
        driver.findElement(EnterNumberOfClusters).click();
        driver.findElement(EnterNumberOfClusters).clear();
        driver.findElement(EnterNumberOfClusters).sendKeys("43");
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditionsCheckBox));
        driver.findElement(TermsAndConditionsCheckBox).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowButton));
        driver.findElement(PayNowButton).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(OneTimeCheckThreeNumber));
        if (driver.findElement(OneTimeCheckThreeNumber).isDisplayed()) {
        } else {
            System.out.println("Either OneTimeTwoNumberGBPCurrency is not displayed.");
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
    }
    public void ClickOnTimeGBPFourNumbers() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(OneTime));
        driver.findElement(OneTime).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(EnterNumberOfClusters));
        driver.findElement(EnterNumberOfClusters).click();
        driver.findElement(EnterNumberOfClusters).clear();
        driver.findElement(EnterNumberOfClusters).sendKeys("43");
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditionsCheckBox));
        driver.findElement(TermsAndConditionsCheckBox).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowButton));
        driver.findElement(PayNowButton).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(OneTimeCheckFourNumber));
        if (driver.findElement(OneTimeCheckFourNumber).isDisplayed()) {
        } else {
            System.out.println("Either OneTimeFourNumberGBPCurrency is not displayed.");
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
    }
    public void ClickOnTimeUS() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(OneTime));
        driver.findElement(OneTime).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(EnterNumberOfClusters));
        driver.findElement(EnterNumberOfClusters).click();
        driver.findElement(EnterNumberOfClusters).sendKeys("2");
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditionsCheckBox));
        driver.findElement(TermsAndConditionsCheckBox).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowButton));
        driver.findElement(PayNowButton).click();
        Thread.sleep(10000);
        if (driver.findElement(StripePage).isDisplayed()) {
            System.out.println("Stripe Page displayed successfully - Test Pass");
        } else {
            System.out.println("Stripe Page not displayed - Test Fail");
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
    }
}
