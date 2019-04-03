import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.MainPage;
import page.ProfilePage;
import page.searchPage;
import  page.LoginPage;
import driver.driver;

import java.util.concurrent.TimeUnit;

public class xueqiu {
    static MainPage mainPage;
    By p= By.id("com.xueqiu.android:id/button_text");
    @BeforeAll
    static void beforeAll(){
        mainPage = MainPage.start();
    }
    @ParameterizedTest
    @CsvSource({
            "1",
    })

    public void xueqiu(){
        //driver.getCurrentDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.getCurrentDriver().findElementByXPath("//android.widget.TextView[@text='沪深' and @resource-id='com.xueqiu.android:id/button_text']").click();
        driver.getCurrentDriver().findElementByAccessibilityId("立即开户").click();
        //driver.getCurrentDriver().findElementByAccessibilityId("开始").click();
    }
}
