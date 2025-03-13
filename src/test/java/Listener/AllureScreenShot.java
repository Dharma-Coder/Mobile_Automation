package Listener;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureScreenShot extends BaseTest implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        if (driver != null) {
            // Capture screenshot on test failure
            ScreenShotOnTestFailure((AndroidDriver) driver);
        } else {
            System.out.println("Driver is null. Unable to capture screenshot.");
        }

        // Save text log
        saveTextLogOnTestFailure(result.getMethod().getConstructorOrMethod().getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        FunctionName(result.getMethod().getConstructorOrMethod().getName());
    }

    // Attach screenshot to Allure report
    @Attachment(value = "Page Screenshot", type = "image/png")
    public static byte[] ScreenShotOnTestFailure(AndroidDriver driver) {
        try {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
            return new byte[0];
        }
    }

    // Attach failure log to Allure report
    @Attachment(value = "Failure Log", type = "text/plain")
    public static String saveTextLogOnTestFailure(String message) {
        System.out.println("Test Failed: " + message);
        return "Test Failed: " + message;
    }

    // Log the test name for tracking
    public void FunctionName(String FName) {
        System.out.println("--------------- Test Started: " + FName + " ---------------");
    }
}
