package org.example;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Login {
    private static AndroidDriver driver;

    private WebDriverWait wait;


    public Login(AndroidDriver driver) {
        this.driver =driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(60));
    }

  private By skipbutton = By.xpath("//android.widget.Button[@content-desc=\"Skip\"]");

  private By emailbox = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");

  private By Password = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");

  private By loginButton = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");

  private By signup = By.xpath("//android.view.View[@content-desc=\"Sign up\"]");

  private By filedErrormessage = By.xpath("(//android.view.View[@content-desc=\"Field is empty\"])[1]");

  private By Errormessage = By.xpath("//android.view.View[@content-desc=\"Invalid username or password!\"]");

  private By ErrormessageEmail = By.xpath("//android.view.View[@content-desc=\"Enter a valid email id\"]");

  private By link = By.xpath("//android.widget.ScrollView/android.widget.ImageView[4]");

    private By profileDetails = By.xpath("//android.view.View[@content-desc=\"Profile Details\"]");
    private By profileDetails1 = By.xpath("//android.widget.ImageView[@content-desc=\"Profile Details\"]");
    private By Tittle = By.xpath("//android.widget.Button[@index=0]");
    private By FirtsName = By.xpath("//android.widget.ImageView[contains(@content-desc,\"Profile Details\")]\n" +
            "/android.widget.EditText[1]");
    private By MiddleName = By.xpath("//android.widget.ImageView[contains(@content-desc,\"Profile Details\")]\n" +
            "/android.widget.EditText[2]");
    private By AddressDetails = By.xpath("//android.widget.ImageView[@content-desc=\"Address Details\"]");
    private By City = By.xpath("//android.widget.ImageView[contains(@content-desc,\"Address\")]/android.view.View/android.widget.EditText[1]");
    private By State =By.xpath("//android.widget.ImageView[contains(@content-desc,\"Address\")]/android.view.View/android.widget.EditText[2]");
    private By Country =By.xpath("//android.widget.ImageView[contains(@content-desc,\"Address\")]/android.view.View/android.widget.EditText[3]");
    private By SaveBuutonForAddress = By.xpath("//android.widget.Button[@index=6]");

    private By UpdatePhoto = By.xpath("//android.widget.ImageView[@content-desc=\"Upload Photo\"]");
    private By ClickOnImageIcon=By.xpath("//android.widget.ScrollView/android.view.View[12]/android.view.View/android.view.View[2]/android.widget.ImageView[2]");
    private By Gallery = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.Button[2]");
    private By Image = By.xpath("//android.widget.LinearLayout[@content-desc=\"bg3 (4).png, 433 kB, Jun 21\"]/android.widget.RelativeLayout/android.widget.FrameLayout[2]");
    private By SaveImageButton = By.xpath("//android.widget.Button[@index=3]");

    private By Activities = By.xpath("//android.widget.ImageView[@content-desc=\"Activities\"]");
    private By SaveActivities = By.xpath("//android.widget.Button[@index=1]");
    private By Interests = By.xpath("//android.widget.ImageView[@content-desc=\"Interests\"]");
    private By SaveInterests = By.xpath("//android.widget.Button[@index=1]");
    private By ClusterHoldings = By.xpath("//android.widget.ImageView[@content-desc=\"Cluster Holdings\"]");
    private By Transaction = By.xpath("//android.widget.ImageView[@content-desc=\"Transactions\"]");
    private By Subscriptions =By.xpath("//android.widget.ImageView[@content-desc=\"Subscriptions\"]");
    private By Collectibles =By.xpath("//android.widget.ImageView[@content-desc=\"Collectibles\"]");
    private By DownloadGuardian =By.xpath("//android.widget.Button[@index=4]");
    private By ClickOnGoogleicon = By.xpath("(//android.widget.ImageView[@resource-id=\"oppo:id/resolver_item_icon\"])[1]");
    private By DownloadCodeRhyalMap =By.xpath("//android.widget.Button[@content-desc=\"Download\"]");
    private By DownloadGigrinMap =By.xpath("//android.widget.Button[@content-desc=\"Download\"]");
    private By DownloadOceanSanctuary =By.xpath("//android.widget.Button[@content-desc=\"Download\"]");
    private By EmailPreferences =By.xpath("//android.widget.ImageView[@content-desc=\"Email Preferences\"]");
    private By SubscriptionsOFEmail =By.xpath("//android.widget.Button[@index=5]");
    private By ForgetPassword =By.xpath("//android.widget.ImageView[@content-desc=\"Forgot Password\"]");
    private By updatePhoneNumber =By.xpath("//android.widget.ImageView[@content-desc=\"Update Phone Number\"]");
    private By CaliforniaResident =By.xpath("//android.widget.ImageView[@content-desc=\"California Resident\"]");
    private By Disclosures =By.xpath("//android.widget.ImageView[@content-desc=\"Disclosures\"]");
    private By InviteaFriend =By.xpath("//android.widget.ImageView[@content-desc=\"Invite a Friend\"]");
    private By Logout =By.xpath("//android.widget.ImageView[@content-desc=\"Logout\"]");
    private By DeleteProfile =By.xpath("//android.widget.ImageView[@content-desc=\"Delete Profile\"]");

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

    private By Actions = By.xpath("//android.widget.ImageView[@content-desc=\"Actions\"]");
    private By EcoFriendlyGifting =By.xpath("//android.view.View[@content-desc=\"Eco Friendly Gifting\"]");
    private By PersonalEcoFriendlyGifts = By.xpath("//android.view.View[@content-desc=\"Personal Eco-Friendly Gifts\"]");
    private By AllContacts =By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]");
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
    private By RecipientName =By.xpath("//android.widget.Button[@content-desc=\"Enter recipient details\"]/following-sibling::android.widget.EditText[1]");
    private By RecipientEmail =By.xpath("//android.widget.Button[@content-desc=\"Enter recipient details\"]/following-sibling::android.widget.EditText[2]");
    private By RecipientNumber =By.xpath("//android.widget.Button[@content-desc=\"Enter recipient details\"]/following-sibling::android.widget.EditText[3]");
    private By Message =By.xpath("//android.view.View[@content-desc=\"£\"]//preceding-sibling::android.widget.EditText[1]");
    private By EnterRecipientDetails = By.xpath("//android.widget.Button[@content-desc=\"Enter recipient details\"]");
    private By GBPCurrency = By.xpath("//android.view.View[@content-desc=\"£\"]");
    private By UsdCurrency = By.xpath("//android.view.View[@content-desc=\"$\"]");
    private By TermsAndConditions = By.xpath("//android.widget.CheckBox");
    private By PayNowButton = By.xpath("//android.widget.Button[@content-desc=\"Pay Now\"]");
    private By GiftFromSGCsBalanceButton = By.xpath("//android.widget.Button[@content-desc=\"Gift from your SGC balance?\"]");
    private By ErrorMessageForField = By.xpath("//android.view.View[@content-desc=\"Field is empty\"]");

    private By Actionss = By.xpath("//android.widget.ImageView[@content-desc=\"Actions\"]");
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
    private By sproutPlan = By.xpath("//android.widget.TextView[@text=\"Subscribe to Sprout\"]");
    private By safariPlan = By.xpath("//android.widget.TextView[@text=\"Subscribe to Safari\"]");
    private By OneTime = By.xpath("//android.view.View[@content-desc=\"One Time\"]");
    private By BackButtOnFromStripe = By.xpath("//android.widget.TextView[@text=\"Back\"]");
    private By StripePage = By.xpath("//android.view.View[@content-desc=\"Powered by Stripe\"]");
    private By EnterNumberOfClusters = By.xpath("//android.widget.EditText[@index=4]");
    private By TermsAndConditionsCheckBox = By.xpath("//android.widget.CheckBox");
    private By PayNowlButton = By.xpath("//android.widget.Button[@content-desc=\"Pay Now\"]");
    private By FindOutHow = By.xpath("//android.widget.Button[@content-desc=\"Find out How\"]");
    private By ClickOnGiftCard = By.xpath("//android.widget.ScrollView/android.view.View[4]/android.view.View/android.view.View/android.widget.ImageView[2]");
    private By ReadMore = By.xpath("//android.widget.Button[@content-desc=\"Read More\"]");
    private By SeedlingPlanAmount =By.xpath("//android.widget.TextView[@text=\"£40.00\"]");
    private By sproutPlanAmount =By.xpath("//android.widget.TextView[@text=\"£80.00\"]");
    private By safariPlanAmount =By.xpath("//android.widget.TextView[@text=\"£200.00\"]");
    private By OneTimeCheckOneNumber =By.xpath("//android.widget.TextView[@text=\"£160.00\"]");


    public void Loginapp() throws Exception {
    wait.until(ExpectedConditions.visibilityOfElementLocated(skipbutton));
    driver.findElement(skipbutton).click();
    wait.until(ExpectedConditions.elementToBeClickable(emailbox));
    driver.findElement(emailbox).click();
    driver.findElement(emailbox).sendKeys("dharma@frugaltesting.com");
    wait.until(ExpectedConditions.elementToBeClickable(Password));
    driver.findElement(Password).click();
    driver.findElement(Password).sendKeys("Frugal@123");
    wait.until(ExpectedConditions.elementToBeClickable(loginButton));
    driver.findElement(loginButton).click();
    Thread.sleep(10000);
        scroll("DOWN", 0.5);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        Thread.sleep(10000);
        scroll("DOWN", 0.5);
        wait.until(ExpectedConditions.elementToBeClickable(OneTime));
        driver.findElement(OneTime).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(EnterNumberOfClusters));
        driver.findElement(EnterNumberOfClusters).click();
        driver.findElement(EnterNumberOfClusters).clear();
        driver.findElement(EnterNumberOfClusters).sendKeys("2");
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditionsCheckBox));
        driver.findElement(TermsAndConditionsCheckBox).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(PayNowlButton));
        driver.findElement(PayNowlButton).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.3);
        wait.until(ExpectedConditions.elementToBeClickable(StripePage));
        driver.findElement(StripePage).isDisplayed();
        scroll("UP", 0.3);
//        Thread.sleep(10000);
//        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
//        driver.findElement(BackButtOnFromStripe).click();


     /*    wait.until(ExpectedConditions.elementToBeClickable(ChoosePlan));
        driver.findElement(ChoosePlan).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(SeedlingPLan));
        driver.findElement(SeedlingPLan).isDisplayed();
        driver.findElement(SeedlingPlanAmount).isDisplayed();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
        Thread.sleep(10000);
        Thread.sleep(10000);
        scroll("RIGHT", 0.2);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ChoosePlan));
        driver.findElement(ChoosePlan).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(sproutPlan));
        driver.findElement(sproutPlan).isDisplayed();
        driver.findElement(sproutPlanAmount).isDisplayed();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();
        Thread.sleep(10000);
        Thread.sleep(10000);
        scroll("RIGHT", 0.3);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ChoosePlan));
        driver.findElement(ChoosePlan).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(safariPlan));
        driver.findElement(safariPlan).isDisplayed();
        driver.findElement(safariPlanAmount).isDisplayed();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(BackButtOnFromStripe));
        driver.findElement(BackButtOnFromStripe).click();

/*         driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
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
        scroll("DOWN",0.3);
        wait.until(ExpectedConditions.elementToBeClickable(RecipientEmail));
        driver.findElement(RecipientEmail).click();
        Thread.sleep(10000);
        driver.findElement(RecipientEmail).sendKeys("ankitSDET01@gmail.com");
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(RecipientName));
        driver.findElement(RecipientName).click();
        driver.findElement(RecipientName).click();
        Thread.sleep(10000);
        driver.findElement(RecipientName).sendKeys("ankit");
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN",0.3);
        wait.until(ExpectedConditions.elementToBeClickable(Message));
        driver.findElement(Message).click();
        Thread.sleep(10000);
        driver.findElement(Message).sendKeys("Test gift");
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN",0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditions));
        driver.findElement(TermsAndConditions).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(GiftFromSGCsBalanceButton));
//        driver.findElement(GiftFromSGCsBalanceButton).click();
        Thread.sleep(10000);
       // scroll("UP",0.6);
       // wait.until(ExpectedConditions.elementToBeClickable(ErrorMessageForField));
       // return driver.findElement(ErrorMessageForField).isDisplayed();

       /* driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
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
        scroll("DOWN",0.3);
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
        scroll("DOWN",0.3);
        wait.until(ExpectedConditions.elementToBeClickable(Message));
        driver.findElement(Message).click();
        Thread.sleep(10000);
        driver.findElement(Message).sendKeys("Test gift");
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        scroll("DOWN",0.2);
        wait.until(ExpectedConditions.elementToBeClickable(TermsAndConditions));
        driver.findElement(TermsAndConditions).click();
        Thread.sleep(10000);
        scroll("DOWN",0.2);
        wait.until(ExpectedConditions.elementToBeClickable(GiftFromSGCsBalanceButton));
        driver.findElement(GiftFromSGCsBalanceButton).click();
        Thread.sleep(10000);
        scroll("DOWN",0.3);
        wait.until(ExpectedConditions.elementToBeClickable(GiftFromSGCsBalanceButton));
        driver.findElement(ErrorMessageForField).isDisplayed();

      //  driver.navigate().back();



   /* wait.until(ExpectedConditions.elementToBeClickable(SignupOption));
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
        driver.findElement(PhoneNumberAlreadyExists).isDisplayed();
        Thread.sleep(10000);
        driver.findElement(EmailAlreadyExists).isDisplayed();




    //wait.until(ExpectedConditions.elementToBeClickable(profileDetails1));
    //driver.findElement(profileDetails1).click();
//    wait.until(ExpectedConditions.elementToBeClickable(FirtsName));
//    driver.findElement(FirtsName).click();
//    driver.findElement(FirtsName).clear();
//    Thread.sleep(1000);
//    driver.findElement(FirtsName).sendKeys(ClusterSentManually);
     /*  wait.until(ExpectedConditions.elementToBeClickable(AddressDetails));
        driver.findElement(AddressDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(City));
        driver.findElement(City).click();
        driver.findElement(City).clear();
        driver.findElement(City).sendKeys("Chicago");
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(State));
        driver.findElement(State).click();
        driver.findElement(State).clear();
        driver.findElement(State).sendKeys("IL");
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(Country));
        driver.findElement(Country).click();
        driver.findElement(Country).clear();
        driver.findElement(Country).sendKeys("USA");
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(SaveBuutonForAddress));
        driver.findElement(SaveBuutonForAddress).click();
        wait.until(ExpectedConditions.elementToBeClickable(UpdatePhoto));
        driver.findElement(UpdatePhoto).click();
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnImageIcon));
        driver.findElement(ClickOnImageIcon).click();
        wait.until(ExpectedConditions.elementToBeClickable(Gallery));
        driver.findElement(Gallery).click();
        wait.until(ExpectedConditions.elementToBeClickable(Image));
        driver.findElement(Image).click();
        scroll("DOWN",0.1);
        wait.until(ExpectedConditions.elementToBeClickable(SaveImageButton));
        driver.findElement(SaveImageButton).click();


        wait.until(ExpectedConditions.elementToBeClickable(Activities));
        driver.findElement(Activities).click();
        scroll("DOWN",0.35);
        Thread.sleep(1000);
        for (int i = 0; i <= 21; i++) {
            try {
                // Construct XPath for each index
                String xpath = "//android.view.View[@clickable=\"true\" and @index='" + i + "']";
                // Find the element
                WebElement element = driver.findElement(By.xpath(xpath));
                // Click the element
                element.click();
                // Add a small delay if necessary to ensure the click is registered
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Element not found or not clickable at index: " + i);
            }
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(SaveActivities));
        driver.findElement(SaveActivities).click();

        wait.until(ExpectedConditions.elementToBeClickable(Interests));
        driver.findElement(Interests).click();
        scroll("DOWN",0.35);
        Thread.sleep(1000);
        for (int i = 0; i <= 22; i++) {
            try {
                // Construct XPath for each index
                String xpath = "//android.view.View[@clickable=\"true\" and @index='" + i + "']";
                // Find the element
                WebElement element = driver.findElement(By.xpath(xpath));
                // Click the element
                element.click();
                // Add a small delay if necessary to ensure the click is registered
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Element not found or not clickable at index: " + i);
            }
        }
        Thread.sleep(1000);
        scroll("DOWN",0.35);
        wait.until(ExpectedConditions.elementToBeClickable(SaveInterests));
        driver.findElement(SaveInterests).click();

        scroll("DOWN",0.60);
        wait.until(ExpectedConditions.elementToBeClickable(DeleteProfile));
        driver.findElement(DeleteProfile).click();
*/

    }
   public boolean TryToLoginWithOutEmailID(){
    wait.until(ExpectedConditions.visibilityOfElementLocated(skipbutton));
    driver.findElement(skipbutton).click();
    wait.until(ExpectedConditions.elementToBeClickable(Password));
    driver.findElement(Password).click();
    driver.findElement(Password).sendKeys("Frugal@123");
    wait.until(ExpectedConditions.elementToBeClickable(loginButton));
    driver.findElement(loginButton).click();
    return driver.findElement(filedErrormessage).isDisplayed();

}
    public boolean TryToLoginWithOutPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skipbutton));
        driver.findElement(skipbutton).click();
        wait.until(ExpectedConditions.elementToBeClickable(emailbox));
        driver.findElement(emailbox).click();
        driver.findElement(emailbox).sendKeys("dharma@frugaltesting.com");
        wait.until(ExpectedConditions.elementToBeClickable(Password));
        driver.findElement(Password).click();
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
        return driver.findElement(filedErrormessage).isDisplayed();
    }
    public boolean LoginWithInvalidPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skipbutton));
        driver.findElement(skipbutton).click();
        wait.until(ExpectedConditions.elementToBeClickable(emailbox));
        driver.findElement(emailbox).click();
        driver.findElement(emailbox).sendKeys("dharma@frugaltesting.com");
        wait.until(ExpectedConditions.elementToBeClickable(Password));
        driver.findElement(Password).click();
        driver.findElement(Password).sendKeys("Frugal@1890423");
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Errormessage));
        return driver.findElement(Errormessage).isDisplayed();

    }
    public boolean LoginWithInvalidUserEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skipbutton));
        driver.findElement(skipbutton).click();
        wait.until(ExpectedConditions.elementToBeClickable(emailbox));
        driver.findElement(emailbox).click();
        driver.findElement(emailbox).sendKeys("restsring.com");
        wait.until(ExpectedConditions.elementToBeClickable(Password));
        driver.findElement(Password).click();
        driver.findElement(Password).sendKeys("Frugal@123");
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ErrormessageEmail));
        return driver.findElement(ErrormessageEmail).isDisplayed();

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
    public void Linkidn() throws Exception {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skipbutton));
        driver.findElement(skipbutton).click();
        wait.until(ExpectedConditions.elementToBeClickable(emailbox));
        driver.findElement(emailbox).click();
        driver.findElement(emailbox).sendKeys("dharma@frugaltesting.com");
        wait.until(ExpectedConditions.elementToBeClickable(Password));
        driver.findElement(Password).click();
        driver.findElement(Password).sendKeys("Frugal@123");
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
        Thread.sleep(1000);
        ScrollDownTill(link,link);
        wait.until(ExpectedConditions.elementToBeClickable(link));
        driver.findElement(link).click();
        WebElement textField = driver.findElement(Password);
        textField.sendKeys(Keys.BACK_SPACE);
    }
}

