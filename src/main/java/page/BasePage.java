package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import driver.driver;
public class BasePage {
    static WebElement find(By locator){
        return driver.getCurrentDriver().findElement(locator);
    }
    static  By locate(String locator){
        if(locator.matches("/.*")){
            return By.xpath(locator);
        }else{
            return By.id(locator);
        }
    }
    static By text(String content){
        return By.xpath("//*[@text='"+content+"']");
    }
}
