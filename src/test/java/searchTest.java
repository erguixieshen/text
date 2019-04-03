import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.MainPage;
import page.ProfilePage;
import page.searchPage;
import  page.LoginPage;
import driver.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class searchTest {

    static MainPage mainPage;

    @BeforeAll
    static void beforeAll(){
        mainPage = MainPage.start();
    }
    @ParameterizedTest
    @CsvSource({
            "wb",
    })
    public void seachTest(String sth){
        //searchPage s = new searchPage();
        //s.searchsth(sth);

    }

}
