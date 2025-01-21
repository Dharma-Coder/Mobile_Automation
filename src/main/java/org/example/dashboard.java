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
    private By WhatIsSacredGrovesVideo = By.xpath("//android.widget.ImageView[@content-desc=\"What is Sacred Groves\"]/android.view.View[2]");
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
    private By ReadMore = By.xpath("//android.widget.Button[@content-desc=\"Read More\"]");
    private By SeedlingPlanAmount = By.xpath("//android.widget.TextView[@text=\"£40.00\"]");
    private By sproutPlanAmount = By.xpath("//android.widget.TextView[@text=\"£80.00\"]");
    private By safariPlanAmount = By.xpath("//android.widget.TextView[@text=\"£200.00\"]");
    private By GBPCurrency = By.xpath("//android.view.View[@content-desc=\"GBP\"]");
    private By USCurrency = By.xpath("//android.view.View[@content-desc=\"USD\"]");
    private By OneTimeCheckOneNumber = By.xpath("//android.widget.TextView[@text=\"£160.00\"]");
    private By OneTimeCheckThreeNumber = By.xpath("//android.widget.TextView[@text=\"£160.00\"]");
    private By OneTimeCheckFourNumber = By.xpath("//android.widget.TextView[@text=\"£160.00\"]");
    private By OneTimeCheckTwoNumber = By.xpath("//android.widget.TextView[@text=\"£160.00\"]");
    private By CloseButton = By.xpath("//android.widget.Button[@text=\"Close\"]");
    private By ShowMoreBlogsButton = By.xpath("//android.widget.Button[@content-desc=\"show more\"]");

    private By Blog1 = By.xpath("//android.widget.ImageView[@content-desc=\"November 22, 2021\n" +
            "Forest Bathing at Coed Rhyal\"]");
    private By Blog2 = By.xpath("//android.widget.ImageView[@content-desc=\"May 26, 2021\n" +
            "In Peru, Ancients have an Answer to Climate Change\"]");
    private By Blog3 = By.xpath("//android.widget.ImageView[@content-desc=\"May 18, 2021\n" +
            "The Man who turned an Endangered Species into God\"]");
    private By Blog4 = By.xpath("//android.widget.ImageView[@content-desc=\"December 14, 2020\n" +
            "Meet Bangalore’s Lake Man\"]");
    private By GiftingPage = By.xpath("//android.view.View[@content-desc=\"Gifting\"]");
    private By SquadPage = By.xpath("//android.view.View[@content-desc=\"Squads\"]");
    private By ProfilePage = By.xpath("//android.view.View[@content-desc=\"Profile\"]");
    private By BlogsPage = By.xpath("//android.view.View[@content-desc=\"Blogs\"]");
    private By GigrinPage =By.xpath("//android.widget.TextView[@text=\"Gigrin Prysg\"]");
    private By CodeRhyalPage =By.xpath("//android.widget.TextView[@text=\"Coed Rhyal\"]");
    private By oceanSanctuaryPage =By.xpath("//android.widget.TextView[@text=\"Ocean Sanctuary\"]");
    private By GigrinPageImages =By.xpath("//android.widget.ScrollView/android.view.View[4]/android.view.View/android.widget.ImageView[1]");
    private By CodeRhyalImages =By.xpath("//android.widget.ScrollView/android.view.View[5]/android.view.View/android.view.View[1]");
    private By oceanSanctuaryImages =By.xpath("//android.widget.ScrollView/android.view.View[3]/android.view.View/android.widget.ImageView[1]");
    private By SwipeLeftButton =By.xpath("//android.widget.ImageView/android.widget.Button[1]");
    private By SwipeRightButton =By.xpath("//android.widget.ImageView/android.widget.Button[2]");
    private By AllContacts = By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
    private By ClickOnAnyGiftCard = By.xpath("//android.widget.ScrollView/android.view.View[3]/android.view.View/android.view.View/android.widget.ImageView[1]");
    private By Website = By.xpath("//android.widget.TextView[@text=\"We use Cookies on this website to enhance your user experience.\"]");
    private By ClickOnGoogleicon = By.xpath("(//android.widget.ImageView[@resource-id=\"oppo:id/resolver_item_icon\"])[1]");
    private By FaceBookPage = By.xpath("//android.widget.Image[@text=\"Facebook wordmark\"]");
    private By InstagramPage = By.xpath("//android.widget.Image[@text=\"Instagram\"]");
    private By GigrinPrysg   = By.xpath("//android.view.View[@content-desc=\"Gigrin Prysg, United Kingdom\n" +
            "2 Clusters\n" +
            "View Detail\"]");
    private By CodeRhyal =By.xpath("//android.view.View[@content-desc=\"Coed Rhyal, United Kingdom\n" +
            "1 Cluster\n" +
            "View Detail\"]");
    private By oceanSanctuary = By.xpath("//android.view.View[@content-desc=\"Ocean Sanctuary, Canada\n" +
            "1 Cluster\n" +
            "View Detail\"]");
    private By oceaanctuary = By.xpath("//android.view.View[contains(@content-desc,\"Ocean Sanctuary, Canada\")]\n");


    public boolean ClickOnSeedlingGBP() throws Exception {
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
        return true;
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

    public boolean ClickOnSproutPlanGBP() throws Exception {
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
        return true;
    }

    public boolean ClickOnSafariPlanGBP() throws Exception {
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
        return true;
    }

    public boolean ClickOnTimeGBPOneNumber() throws Exception {
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
        return true;
    }

    public boolean ClickOnTimeGBPTwoNumbers() throws Exception {
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
        return true;
    }

    public boolean ClickOnTimeGBPThreeNumbers() throws Exception {
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
        return true;
    }

    public boolean ClickOnTimeGBPFourNumbers() throws Exception {
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
        return true;
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

    public boolean ClickOnFindOutHow() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        wait.until(ExpectedConditions.elementToBeClickable(FindOutHow));
        driver.findElement(FindOutHow).click();
        Thread.sleep(10000);
        driver.findElement(AllContacts).click();
        wait.until(ExpectedConditions.elementToBeClickable(GiftingPage));
        return driver.findElement(GiftingPage).isDisplayed();
    }

    public boolean ClickOnExploreSquads() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        wait.until(ExpectedConditions.elementToBeClickable(ExploreSquad));
        driver.findElement(ExploreSquad).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(SquadPage));
        return driver.findElement(SquadPage).isDisplayed();
    }

    public boolean ClickOnGiftCardAny() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnAnyGiftCard));
        driver.findElement(ClickOnAnyGiftCard).click();
        wait.until(ExpectedConditions.elementToBeClickable(GiftingPage));
        return driver.findElement(GiftingPage).isDisplayed();
    }

    public void ClickOnBecomeAGuardian() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(BecomeAGuardian));
        driver.findElement(BecomeAGuardian).click();
        Thread.sleep(10000);
        if (driver.findElement(GBPCurrency).isDisplayed() && driver.findElement(USCurrency).isDisplayed()) {
        } else {
            System.out.println("Either GBPCurrency or GBPCurrency is not displayed.");
        }
    }

    public boolean ClickOnLearnMoreButton() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(LearnMore));
        driver.findElement(LearnMore).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(Website));
        return driver.findElement(Website).isDisplayed();
    }

    public boolean ClickOnStartCompletingProfile() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.4);
        wait.until(ExpectedConditions.elementToBeClickable(StartCompletingProfile));
        driver.findElement(StartCompletingProfile).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ProfilePage));
        return driver.findElement(ProfilePage).isDisplayed();
    }

    public boolean ClickOnViewCollectibles() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        wait.until(ExpectedConditions.elementToBeClickable(ViewCollectibles));
        driver.findElement(ViewCollectibles).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowButton));
        return driver.findElement(PayNowButton).isDisplayed();
    }

    public boolean ClickOnFaceBook() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.4);
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(FollowUS));
        driver.findElement(ViewCollectibles).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(FaceBook));
        driver.findElement(FaceBook).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        wait.until(ExpectedConditions.elementToBeClickable(CloseButton));
        driver.findElement(CloseButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(FaceBookPage));
        return driver.findElement(FaceBookPage).isDisplayed();
    }

    public boolean ClickOnInstagram() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.4);
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(FollowUS));
        driver.findElement(ViewCollectibles).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(Instagram));
        driver.findElement(Instagram).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"oppo:id/resolver_item_icon\"])[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(CloseButton));
        driver.findElement(CloseButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(InstagramPage));
        return driver.findElement(InstagramPage).isDisplayed();
    }

    public boolean ClickOnLinkDin() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.4);
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(FollowUS));
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(linkDin));
        driver.findElement(linkDin).click();
        return true;
    }

    public boolean ClickOnLearnMoreAboutUs() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.4);
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(LearnMoreAboutUs));
        driver.findElement(LearnMoreAboutUs).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(Website));
        return driver.findElement(Website).isDisplayed();
    }

    public boolean ClickOnBlog1() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        wait.until(ExpectedConditions.elementToBeClickable(Blog1));
        driver.findElement(Blog1).click();
        Thread.sleep(10000);
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"Forest Bathing at Coed Rhyal\"]")).isDisplayed();
    }

    public boolean ClickOnBlog2() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        Thread.sleep(10000);
        scroll("RIGHT", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(Blog2));
        driver.findElement(Blog2).click();
        Thread.sleep(10000);
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"In Peru, Ancients have an Answer to Climate Change\"]")).isDisplayed();
    }

    public boolean ClickOnBlog3() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        Thread.sleep(10000);
        scroll("RIGHT", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(Blog3));
        driver.findElement(Blog3).click();
        Thread.sleep(10000);
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"The Man who turned an Endangered Species into God\"]")).isDisplayed();
    }

    public boolean ClickOnBlog4() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        Thread.sleep(10000);
        scroll("RIGHT", 0.4);
        wait.until(ExpectedConditions.elementToBeClickable(Blog4));
        driver.findElement(Blog4).click();
        Thread.sleep(10000);
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"Meet Bangalore’s Lake Man\"]")).isDisplayed();
    }

    public boolean ClickOnShowMoreButton() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        Thread.sleep(10000);
        scroll("RIGHT", 0.5);
        wait.until(ExpectedConditions.elementToBeClickable(ShowMoreBlogsButton));
        driver.findElement(ShowMoreBlogsButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(BlogsPage));
        return driver.findElement(BlogsPage).isDisplayed();
    }

    public boolean ClickOnWhatIsSacredGrovesVideo() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        wait.until(ExpectedConditions.elementToBeClickable(WhatIsSacredGrovesVideo));
        driver.findElement(WhatIsSacredGrovesVideo).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"What is Sacred Groves\"]")).click();
        return true;
    }

    public boolean ClickOnBenefitsBecomingGuardianVideo() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(BenefitsBecomingGuardian));
        driver.findElement(BenefitsBecomingGuardian).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"The benefits of becoming a Guardian\"]")).click();
        return true;
    }

    public boolean ClickOnBecomingGuardianOnMobileAppVideo() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.6);
        wait.until(ExpectedConditions.elementToBeClickable(BecomingGuardianOnMobileApp));
        driver.findElement(BecomingGuardianOnMobileApp).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"How to become a Guardian by downloading our Mobile Application\"]")).click();
        return true;
    }

    public boolean ClickOnSubscribeClusterOnMobileAppVideo() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.6);
        wait.until(ExpectedConditions.elementToBeClickable(SubscribeClusterOnMobileApp));
        driver.findElement(SubscribeClusterOnMobileApp).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Subscribe to Sacred Groves Cluster on our Mobile app\"]")).click();
        return true;
    }

    public boolean ClickOnStepByStepReceivingAGiftOnMobileAppVideo() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("DOWN", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.6);
        Thread.sleep(10000);
        scroll("RIGHT", 0.6);
        wait.until(ExpectedConditions.elementToBeClickable(StepByStepReceivingAGiftOnMobileApp));
        driver.findElement(StepByStepReceivingAGiftOnMobileApp).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"A step by step guide to receiving a Sacred Groves Cluster as a gift by downloading our Mobile Application\"]")).click();
        return true;
    }

    public boolean SelectGigrinPrysg() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(GigrinPrysg));
        driver.findElement(GigrinPrysg).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.3);
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ReadMore));
        driver.findElement(ReadMore).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(GigrinPage));
        return driver.findElement(GigrinPage).isDisplayed();
    }
    public boolean SelectCodeRhyal() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(CodeRhyal));
        driver.findElement(CodeRhyal).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.4);
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ReadMore));
        driver.findElement(ReadMore).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(CodeRhyalPage));
        return driver.findElement(CodeRhyalPage).isDisplayed();
    }
    public boolean SelectOceanSanctuary() throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(oceanSanctuary));
        driver.findElement(oceanSanctuary).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.3);
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ReadMore));
        driver.findElement(ReadMore).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(oceanSanctuaryPage));
        return driver.findElement(oceanSanctuaryPage).isDisplayed();
    }
    public boolean ScrollGigrinPageImages () throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(GigrinPageImages));
        driver.findElement(GigrinPageImages).click();
        scroll("RIGHT", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(SwipeLeftButton));
        driver.findElement(SwipeLeftButton).click();
        Thread.sleep(1000);
        driver.findElement(SwipeLeftButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(SwipeRightButton));
        driver.findElement(SwipeRightButton).click();
        Thread.sleep(1000);
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"Woodland overview\"]")).isDisplayed();
    }
    public boolean ScrollCodeRhyalImages () throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(CodeRhyalImages));
        driver.findElement(CodeRhyalImages).click();
        scroll("RIGHT", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(SwipeLeftButton));
        driver.findElement(SwipeLeftButton).click();
        Thread.sleep(1000);
        driver.findElement(SwipeLeftButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(SwipeRightButton));
        driver.findElement(SwipeRightButton).click();
        Thread.sleep(1000);
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"Wildflowers\"]")).isDisplayed();
    }
    public boolean ScrollOceanSanctuaryImages () throws Exception {
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(oceanSanctuaryImages));
        driver.findElement(oceanSanctuaryImages).click();
        scroll("RIGHT", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(SwipeLeftButton));
        driver.findElement(SwipeLeftButton).click();
        Thread.sleep(1000);
        driver.findElement(SwipeLeftButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(SwipeRightButton));
        driver.findElement(SwipeRightButton).click();
        Thread.sleep(1000);
        return driver.findElement(By.xpath("//android.view.View[@content-desc=\"Zone 1 - Lakeside vegetation\"]")).isDisplayed();
    }
    public int readPendingClusterData() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ClusterData));
        String Val = driver.findElement(ClusterData).getText();
        int i = Integer.parseInt(Val);
        return i;
    }

}