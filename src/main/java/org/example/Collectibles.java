package org.example;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Collectibles {
    private static AndroidDriver driver;

    private WebDriverWait wait;

    public Collectibles(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    private By DownloadButton = By.xpath("//android.widget.Button[@content-desc=\"Download\"]");
    private By ClickOnGoogleicon = By.xpath("(//android.widget.ImageView[@resource-id=\"oppo:id/resolver_item_icon\"])[1]");
    private By DownloadOption =By.xpath("//android.widget.Button[@resource-id=\"com.android.chrome:id/positive_button\"]");
//android.widget.Button[@resource-id="com.android.chrome:id/negative_button"]
    private By Actions = By.xpath("//android.widget.ImageView[@content-desc=\"Actions\"]");
    private By Collectibles = By.xpath("//android.view.View[@content-desc=\"Collectibles\"]");
    private By HamburgerMenu = By.xpath("//android.widget.ScrollView/android.view.View[1]");
    private By StickersDownloadButton =By.xpath("(//android.widget.Button[@content-desc=\"Download\"])[2]");


    public boolean DownloadGuardianCertificate() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        scroll("DOWN", 0.2);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
        driver.findElement(DownloadButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
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
    public void scrollTill(String direction, By elementToFind, By endElement, Boolean positionTheElement) throws Exception {
        boolean foundElem = false;
        long startTime = System.currentTimeMillis();
        long timeout = 60000; // 1 minute in milliseconds

        while (true) {
            if (driver.findElements(elementToFind).size() == 1 ) {
                WebElement element = driver.findElement(elementToFind);
                Point elementLocation = element.getLocation();
                Dimension screenSize = driver.manage().window().getSize();
                if (direction.equals("RIGHT") && elementLocation.getX() > screenSize.getWidth() * 0.5 && positionTheElement) {
                    scroll(direction, 0.25);
                    foundElem = true;
                    Thread.sleep(2000);
                    break;
                } else if (direction.equals("LEFT") && elementLocation.getX() < screenSize.getWidth() * 0.5 && positionTheElement) {
                    scroll(direction, 0.25);
                    foundElem = true;
                    Thread.sleep(2000);
                    break;
                } else if (direction.equals("DOWN") && elementLocation.getY() > screenSize.getHeight() * 0.5 && positionTheElement) {
                    scroll(direction, 0.27);
                    foundElem = true;
                    Thread.sleep(2000);
                    break;
                } else if (direction.equals("UP") && elementLocation.getY() < screenSize.getHeight() * 0.5 && positionTheElement) {
                    scroll(direction, 0.4);
                    foundElem = true;
                    Thread.sleep(2000);
                    break;
                } else {
                    foundElem = true;
                    Thread.sleep(2000);
                    break;
                }
            }
            scroll(direction, 0.25);
            Thread.sleep(1000);
            if (endElement != elementToFind && driver.findElements(endElement).size() == 1) {
                break;
            }
            if (isTimeoutExceeded(startTime, timeout)) {
                break;
            }
        }
        if (!foundElem) {
            throw new Exception("Element not found: " + elementToFind.toString());
        }
    }

    public boolean isTimeoutExceeded(long startTime, long timeout) {
        return System.currentTimeMillis() - startTime > timeout;
    }

    public boolean DownloadMapCodeRhyal() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
        driver.findElement(DownloadButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }
    public boolean DownloadMapGigrin() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("RIGHT", 0.3);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
        driver.findElement(DownloadButton).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }
    public boolean DownloadMapOceanSanctuary() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("RIGHT", 0.3);
        Thread.sleep(10000);
        scroll("RIGHT", 0.3);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
        driver.findElement(DownloadButton).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }
    public boolean DownloadCalendar() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.2);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
        driver.findElement(DownloadButton).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }
    public boolean DownloadBackGroundImage1() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
        driver.findElement(DownloadButton).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }
    public boolean DownloadBackGroundImage2() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("RIGHT", 0.3);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
        driver.findElement(DownloadButton).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }
    public boolean DownloadBackGroundImage3() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("RIGHT", 0.3);
        Thread.sleep(10000);
        scroll("RIGHT", 0.3);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
        driver.findElement(DownloadButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }

    public boolean DownloadStickers1() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(StickersDownloadButton));
        driver.findElement(StickersDownloadButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }
    public boolean DownloadStickers2() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("RIGHT", 0.35);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(StickersDownloadButton));
        driver.findElement(StickersDownloadButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }
    public boolean DownloadStickers3() throws Exception {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(HamburgerMenu));
        driver.findElement(HamburgerMenu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Actions));
        driver.findElement(Actions).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Collectibles));
        driver.findElement(Collectibles).click();
        Thread.sleep(1000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("DOWN", 0.35);
        Thread.sleep(10000);
        scroll("RIGHT", 0.35);
        Thread.sleep(10000);
        scroll("RIGHT", 0.35);
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(StickersDownloadButton));
        driver.findElement(StickersDownloadButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(ClickOnGoogleicon));
        driver.findElement(ClickOnGoogleicon).click();
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(DownloadOption));
        driver.findElement(DownloadOption).click();
        return true;
    }
}
