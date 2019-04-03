package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class apidriver {

    private static AndroidDriver driver;

    @Before
    public static void setUp() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage", "com.example.android.apis");
        desiredCapabilities.setCapability("appActivity", ".ApiDemos t345");
        //desiredCapabilities.setCapability("autoGrantPermissions", "true");
        desiredCapabilities.setCapability("chromedriverExecutableDir","D:/测吧工作/");

        URL remoteUrl = null;
        try {
            remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {

    }

    @After
    public void tearDown() {
        driver.quit();
    }
    public static AndroidDriver getCurrentDriver(){
        return driver;
    }
}

