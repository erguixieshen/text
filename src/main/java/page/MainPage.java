package page;

import org.openqa.selenium.By;
import driver.driver;

import org.openqa.selenium.remote.DesiredCapabilities;
public class MainPage {
    By profile= By.id("com.xueqiu.android:id/user_profile_icon");
    public static MainPage start(){
        driver.start();
        return new MainPage();
    }
    public ProfilePage gotoProfile(){
        driver.getCurrentDriver().findElement(profile).click();
        return new ProfilePage();
    }
}
