import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.MainPage;
import page.ProfilePage;
import page.searchPage;
import  page.LoginPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {

    static MainPage mainPage;
    static ProfilePage profilePage;

    @BeforeAll
    static void beforeAll(){
         mainPage = MainPage.start();
         profilePage = mainPage.gotoProfile();
    }
    @ParameterizedTest
    @CsvSource({
            "1555555555,2333333,手机号码填写错误",
            "15555555555,233333,手机号码填写错误"
    })
    public void loginTest(String username,String password,String expection){
        LoginPage loginPage = profilePage.goto密码登陆();
        loginPage.passwordFail(username,password);
        assertThat(loginPage.getMassage(),equalTo(expection));
        profilePage = loginPage.getProfile();
    }
}
