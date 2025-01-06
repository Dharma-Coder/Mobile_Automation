package org.example;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Profile {
    private static AndroidDriver driver;

    private WebDriverWait wait;


    public Profile(AndroidDriver driver) {
        this.driver =driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    private By HamburgerMenu = By.xpath("//android.widget.ScrollView/android.view.View[1]");
    private By profileDetails = By.xpath("//android.view.View[@content-desc=\"Profile Details\"]");
    private By profileDetails1 = By.xpath("//android.widget.ImageView[@content-desc=\"Profile Details\"]");
    private By Tittle = By.xpath("//android.widget.Button[@index=0]");
    private By FirtsName = By.xpath("//android.widget.ImageView[contains(@content-desc,\"Profile Details\")]\n" +
            "/android.widget.EditText[1]");
    private By MiddleName = By.xpath("//android.widget.ImageView[contains(@content-desc,\"Profile Details\")]\n" +
            "/android.widget.EditText[2]");
    private By LastName = By.xpath("//android.widget.ImageView[contains(@content-desc,\"Profile Details\")]\n" +
            "/android.widget.EditText[3]");
    private By FieldEmpty = By.xpath("//android.view.View[@content-desc=\"Field is empty\"]");
    private By SaveBuutonForName= By.xpath("//android.widget.Button[@index=4]");
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
    private By Interest =By.xpath("//android.widget.ImageView[@content-desc=\"Interests\"]");
    private By SaveInterest=By.xpath("//android.widget.Button[@content-desc=\"Save\"]");
    private By ClusterHoldings = By.xpath("//android.widget.ImageView[@content-desc=\"Cluster Holdings\"]");
    private By Transaction = By.xpath("//android.widget.ImageView[@content-desc=\"Transactions\"]");
    private By Subscriptions =By.xpath("//android.widget.ImageView[@content-desc=\"Subscriptions\"]");
    private By SubscriptionsOFEmail =By.xpath("//android.widget.Button[@index=5]");
    private By Collectibles =By.xpath("//android.widget.ImageView[@content-desc=\"Collectibles\"]");
    private By DownloadGuardian =By.xpath("//android.widget.Button[@index=3]");
    private By ClickOnGoogleicon = By.xpath("(//android.widget.ImageView[@resource-id=\"oppo:id/resolver_item_icon\"])[1]");
    private By DownloadButton = By.xpath("//android.widget.Button[@resource-id=\"com.android.chrome:id/positive_button\"]");
    
    private By DownloadCodeRhyalMap =By.xpath("//android.widget.Button[@content-desc=\"Download\"]");
    private By DownloadGigrinMap =By.xpath("//android.widget.Button[@content-desc=\"Download\"]");
    private By DownloadOceanSanctuary =By.xpath("//android.widget.Button[@content-desc=\"Download\"]");
    private By EmailPreferences =By.xpath("//android.widget.ImageView[@content-desc=\"Email Preferences\"]");
    private By ForgetPassword =By.xpath("//android.widget.ImageView[@content-desc=\"Forgot Password\"]");
    private By updatePhoneNumber =By.xpath("//android.widget.ImageView[@content-desc=\"Update Phone Number\"]");
    private By ContinueButton =By.xpath("//android.widget.Button[@content-desc=\"Continue\"]");
    private By CaliforniaResident =By.xpath("//android.widget.ImageView[@content-desc=\"California Resident\"]");
    private By Disclosures =By.xpath("//android.widget.ImageView[@content-desc=\"Disclosures\"]");
    private By InviteaFriend =By.xpath("//android.widget.ImageView[@content-desc=\"Invite a Friend\"]");
    private By Logout =By.xpath("//android.widget.ImageView[@content-desc=\"Logout\"]");
    private By DeleteProfile =By.xpath("//android.widget.ImageView[@content-desc=\"Delete Profile\"]");


    public boolean SaveName() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
      wait.until(ExpectedConditions.elementToBeClickable(profileDetails1));
      driver.findElement(profileDetails1).click();
      wait.until(ExpectedConditions.elementToBeClickable(FirtsName));
      driver.findElement(FirtsName).click();
      driver.findElement(FirtsName).clear();
      Thread.sleep(1000);
      driver.findElement(FirtsName).sendKeys("Dharma");
      driver.navigate().back();
      wait.until(ExpectedConditions.elementToBeClickable(LastName));
      driver.findElement(LastName).click();
      driver.findElement(LastName).clear();
      driver.findElement(LastName).sendKeys("IL");
      driver.navigate().back();
      driver.findElement(SaveBuutonForName).click();

        return true;
    }
 public boolean SaveAddressDetails () throws Exception {
     driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
     Thread.sleep(1000);
     ScrollDownTill(profileDetails,profileDetails);
     wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
     driver.findElement(profileDetails).click();
     wait.until(ExpectedConditions.elementToBeClickable(AddressDetails));
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
     return true;
 }
    public boolean UpdateTheImage() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
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
    public boolean SaveTheActivities() throws Exception {
        // Navigate to the required screen
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails); // Assuming this scrolls to the profileDetails element
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(Activities));
        driver.findElement(Activities).click();
        scroll("DOWN", 0.3);
        Thread.sleep(1000);
        for (int i = 0; i <= 21; i++) {
            try {
                String xpath = "//android.view.View[@clickable=\"true\" and @index='" + i + "']";
                WebElement element = driver.findElement(By.xpath(xpath));
                element.click();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Element not found or not clickable at index: " + i);
            }
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(SaveActivities));
        driver.findElement(SaveActivities).click();
        return true;
    }
    public boolean SaveTheInterest() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails); // Assuming this scrolls to the profileDetails element
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(Interest));
        driver.findElement(Interest).click();
        scroll("DOWN", 0.35);
        Thread.sleep(1000);
        // Iterate through the elements
        for (int i = 0; i <= 12; i++) {
            try {
                // Construct XPath for each index
                String xpath = "//android.view.View[@clickable=\"true\" and @index='" + i + "']";
                // Find the element
                WebElement element = driver.findElement(By.xpath(xpath));
                // Click the element
                element.click();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Element not found or not clickable at index: " + i);
            }
        }
        scroll("DOWN", 0.2);
        Thread.sleep(2000);

        for (int i = 13; i <= 16; i++) {
            try {
                String xpath = "//android.view.View[@clickable=\"true\" and @index='" + i + "']";
                WebElement element = driver.findElement(By.xpath(xpath));
                element.click();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Element not clickable or not found at index: " + i);
            }
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(SaveActivities));
        driver.findElement(SaveActivities).click();
        return true;
    }

    public boolean ClusterHoldings() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN",0.25);
        wait.until(ExpectedConditions.elementToBeClickable(ClusterHoldings));
        driver.findElement(ClusterHoldings).click();
        return true;
    }
    public boolean Transaction() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.25);
        wait.until(ExpectedConditions.elementToBeClickable(Transaction));
        driver.findElement(Transaction).click();
        return true;
    }
    public boolean Subscriptions() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.35);
        wait.until(ExpectedConditions.elementToBeClickable(Subscriptions));
        driver.findElement(Subscriptions).click();
        return true;
    }
    public boolean Collectibles() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.35);
        wait.until(ExpectedConditions.elementToBeClickable(Collectibles));
        driver.findElement(Collectibles).click();
        return true;
    }
    public boolean EmailPreferences() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN",0.35);
        wait.until(ExpectedConditions.elementToBeClickable(EmailPreferences));
        driver.findElement(EmailPreferences).click();
        return true;

    }
    public boolean ForgetPassword() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.35);
        wait.until(ExpectedConditions.elementToBeClickable(ForgetPassword));
        driver.findElement(ForgetPassword).click();
        return true;
    }
    public boolean updatePhoneNumber() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.35);
        wait.until(ExpectedConditions.elementToBeClickable(updatePhoneNumber));
        driver.findElement(updatePhoneNumber).click();
        return true;
    }
    public boolean CaliforniaResident() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.55);
        wait.until(ExpectedConditions.elementToBeClickable(CaliforniaResident));
        driver.findElement(CaliforniaResident).click();
        return true;
    }
    public boolean Disclosures() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN",0.55);
        wait.until(ExpectedConditions.elementToBeClickable(Disclosures));
        driver.findElement(Disclosures).click();
        return true;
    }
    public boolean InviteAFriend() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.55);
        wait.until(ExpectedConditions.elementToBeClickable(InviteaFriend));
        driver.findElement(InviteaFriend).click();
        return true;
    }
    public boolean Logout() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.55);
        wait.until(ExpectedConditions.elementToBeClickable(Logout));
        driver.findElement(Logout).click();
        return true;
    }
    public boolean DeleteProfile() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.55);
        wait.until(ExpectedConditions.elementToBeClickable(DeleteProfile));
        driver.findElement(DeleteProfile).click();
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        return true;
    }
    public boolean SaveWithoutFirstName () throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails1));
        driver.findElement(profileDetails1).click();
        wait.until(ExpectedConditions.elementToBeClickable(FirtsName));
        driver.findElement(FirtsName).click();
        driver.findElement(FirtsName).clear();
        Thread.sleep(1000);
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(LastName));
        driver.findElement(LastName).click();
        driver.findElement(LastName).clear();
        driver.findElement(LastName).sendKeys("IL");
        driver.navigate().back();
        driver.findElement(SaveBuutonForName).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FieldEmpty));
        return driver.findElement(FieldEmpty).isDisplayed();

    }
    public boolean SaveLastNameEmpty() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails1));
        driver.findElement(profileDetails1).click();
        wait.until(ExpectedConditions.elementToBeClickable(FirtsName));
        driver.findElement(FirtsName).click();
        driver.findElement(FirtsName).clear();
        Thread.sleep(1000);
        driver.findElement(FirtsName).sendKeys("Dharma");
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(LastName));
        driver.findElement(LastName).click();
        driver.findElement(LastName).clear();
        driver.navigate().back();
        driver.findElement(SaveBuutonForName).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FieldEmpty));
        return driver.findElement(FieldEmpty).isDisplayed();

    }
    public boolean SaveFirstAndLastNameEmpty() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails1));
        driver.findElement(profileDetails1).click();
        wait.until(ExpectedConditions.elementToBeClickable(FirtsName));
        driver.findElement(FirtsName).click();
        driver.findElement(FirtsName).clear();
        Thread.sleep(1000);
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(LastName));
        driver.findElement(LastName).click();
        driver.findElement(LastName).clear();
        driver.navigate().back();
        driver.findElement(SaveBuutonForName).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.View[@content-desc='Field is empty'])[1]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.View[@content-desc='Field is empty'])[2]")));
        boolean isFirstNameEmptyDisplayed = driver.findElement(By.xpath("(//android.view.View[@content-desc='Field is empty'])[1]")).isDisplayed();
        boolean isLastNameEmptyDisplayed = driver.findElement(By.xpath("(//android.view.View[@content-desc='Field is empty'])[2]")).isDisplayed();
        return isFirstNameEmptyDisplayed && isLastNameEmptyDisplayed;

    }
    public boolean SaveAddressWithoutCityDetails () throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(AddressDetails));
        driver.findElement(AddressDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(City));
        driver.findElement(City).click();
        driver.findElement(City).clear();
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(FieldEmpty));
        return driver.findElement(FieldEmpty).isDisplayed();
    }
    public boolean SaveAddressWithoutStateDetails () throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails,profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(AddressDetails));
        driver.findElement(AddressDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(City));
        driver.findElement(City).click();
        driver.findElement(City).clear();
        driver.findElement(City).sendKeys("Chicago");
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(State));
        driver.findElement(State).click();
        driver.findElement(State).clear();
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(Country));
        driver.findElement(Country).click();
        driver.findElement(Country).clear();
        driver.findElement(Country).sendKeys("USA");
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(SaveBuutonForAddress));
        driver.findElement(SaveBuutonForAddress).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FieldEmpty));
        return driver.findElement(FieldEmpty).isDisplayed();
    }
    public boolean SaveAddressWithoutCountryDetails () throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(AddressDetails));
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
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(SaveBuutonForAddress));
        driver.findElement(SaveBuutonForAddress).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FieldEmpty));
        return driver.findElement(FieldEmpty).isDisplayed();
    }
    public boolean SaveAddressWithoutDetails () throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(AddressDetails));
        driver.findElement(AddressDetails).click();
        wait.until(ExpectedConditions.elementToBeClickable(City));
        driver.findElement(City).click();
        driver.findElement(City).clear();
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(State));
        driver.findElement(State).click();
        driver.findElement(State).clear();
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(Country));
        driver.findElement(Country).click();
        driver.findElement(Country).clear();
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(SaveBuutonForAddress));
        driver.findElement(SaveBuutonForAddress).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.View[@content-desc='Field is empty'])[1]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.View[@content-desc='Field is empty'])[2]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.View[@content-desc='Field is empty'])[3]")));
        boolean isCityEmptyDisplayed = driver.findElement(By.xpath("(//android.view.View[@content-desc='Field is empty'])[1]")).isDisplayed();
        boolean isStateEmptyDisplayed = driver.findElement(By.xpath("(//android.view.View[@content-desc='Field is empty'])[2]")).isDisplayed();
        boolean isCountryEmptyDisplayed = driver.findElement(By.xpath("(//android.view.View[@content-desc='Field is empty'])[3]")).isDisplayed();
        return isCityEmptyDisplayed && isStateEmptyDisplayed && isCountryEmptyDisplayed;
    }
    public boolean ClickContinueButtonWithoutPhoneNumber() throws Exception {
        driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.35);
        wait.until(ExpectedConditions.elementToBeClickable(updatePhoneNumber));
        driver.findElement(updatePhoneNumber).click();
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        driver.findElement(ContinueButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FieldEmpty));
        return driver.findElement(FieldEmpty).isDisplayed();
    }
    public boolean ClickContinueButtonWithoutForgetPassword() throws Exception {
        driver.findElement(By.xpath("//android. widget.ScrollView/android.view.View[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Profile\"]")).click();
        Thread.sleep(1000);
        ScrollDownTill(profileDetails, profileDetails);
        wait.until(ExpectedConditions.elementToBeClickable(profileDetails));
        driver.findElement(profileDetails).click();
        scroll("DOWN", 0.35);
        wait.until(ExpectedConditions.elementToBeClickable(ForgetPassword));
        driver.findElement(ForgetPassword).click();
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        driver.findElement(ContinueButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(FieldEmpty));
        return driver.findElement(FieldEmpty).isDisplayed();
    }
}
