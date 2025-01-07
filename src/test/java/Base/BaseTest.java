package Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.URL;

public class BaseTest {
    public static AndroidDriver driver;
    public URL url;

    private static AppiumDriverLocalService server;

    @BeforeSuite
    public void setUpAppiumServer(){
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withArgument(() -> "--log-level", "warn");
        server =  AppiumDriverLocalService.buildService(builder);
        server.start();
    }

    @AfterSuite
    public void TearDownAppiumServer(){
        server.stop();
    }


    public void setUp() {

        try {
            url = new URL("http://127.0.0.1:4723");

            UiAutomator2Options options = new UiAutomator2Options()
                    .setUdid("22407d4")
                    .setAppPackage("com.outshade.sacredgroves")
                    .setAppActivity("com.outshade.sacredgroves.MainActivity");
            driver = new AndroidDriver(url, options);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
