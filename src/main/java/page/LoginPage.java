package page;

import org.openqa.selenium.By;
import static page.BasePage.find;

public class LoginPage {
    By other = By.id("com.xueqiu.android:id/tv_login_by_phone_or_others");
    By passwordLogin = By.id("com.xueqiu.android:id/tv_login_with_account");
    By username = By.id("com.xueqiu.android:id/login_account");
    By password = By.id("com.xueqiu.android:id/login_password");
    By login = By.id("com.xueqiu.android:id/button_next");
    By queding = By.id("com.xueqiu.android:id/md_buttonDefaultPositive");
    By msg = By.id("com.xueqiu.android:id/md_content");

    String massage;

    public LoginPage passwordFail(String username,String password){
        find(other).click();
        find(passwordLogin).click();
        find(this.username).sendKeys(username);
        find(this.password).sendKeys(password);
        find(login).click();
        massage = find(msg).getText();
        find(queding).click();
        //find(By.id("com.xueqiu.android:id/iv_action_back")).click();

        return this;
    }
    public ProfilePage getProfile(){
        find(By.id("com.xueqiu.android:id/iv_action_back")).click();
        return new ProfilePage();
    }
    public String getMassage(){
        return massage;
    }
}
