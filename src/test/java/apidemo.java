import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.*;
import driver.apidriver;

public class apidemo {
    static page.apipage apipage;
    @BeforeAll
    static void beforeAll(){
        apipage = apipage.start();
    }
    @ParameterizedTest
    @CsvSource({
            "1",
    })

    public void apidemo(){
        apidriver.getCurrentDriver().findElementByXPath("//*[@text='Views']").click();
        apidriver.getCurrentDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"android:id/text1\")).getChildByText("
                        + "new UiSelector().className(\"android:id/list\"), \"Views\")")).click();
    }
}
