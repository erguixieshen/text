package page;

import org.openqa.selenium.By;
import driver.apidriver;

import org.openqa.selenium.remote.DesiredCapabilities;
public class apipage {
    public static apipage start(){
        apidriver.setUp();
        return new apipage();
    }

}
