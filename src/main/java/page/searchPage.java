package page;

import org.openqa.selenium.By;
import static page.BasePage.find;

public class searchPage {
    By search = By.id("com.xueqiu.android:id/tv_search");
    By searchtext = By.id("com.xueqiu.android:id/search_input_text");

    String massage;

    public searchPage searchsth(String searchtext){
        find(this.search).click();
        find(this.searchtext).sendKeys(searchtext);
        return this;
    }

}
