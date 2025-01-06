package Listener;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class AllureScreenShot extends BaseTest implements ITestListener {

    public void onTestFailure(ITestResult result) {
        ScreenShotOnTestFailure(driver);
        saveTextLogOnTestFailure(result.getMethod().getConstructorOrMethod().getName());
    }

    public void onTestStart(ITestResult result) {
        FunctionName(result.getMethod().getConstructorOrMethod().getName());
    }


    @Attachment(value = "Page Screenshot", type = "image/png")
    public static byte[] ScreenShotOnTestFailure(AndroidDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "stacktrace", type = "text/plain")
    public static String saveTextLogOnTestFailure(String message) {
        System.out.println("Test Failed  : " + message);
        return message;
    }


    public void FunctionName(String FName) {
        System.out.println("---------------" + FName + "---------------");
    }
}
