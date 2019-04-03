package page;

import org.openqa.selenium.By;
import driver.driver;


public class ProfilePage {
    By login = By.id("com.xueqiu.android:id/tv_login");

    public void gotoWeixinLogin( ){

    }
    public void got验证码登陆(){

    }
    public LoginPage goto密码登陆(){
        driver.getCurrentDriver().findElement(login).click();
        return new LoginPage();

    }

}
