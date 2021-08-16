package swag_labs.steps;

import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Steps {

    @Допустим("^открыта страница \"([^\"]*)\"$")
    public void openPage(String pageURL) {
        open(pageURL);
        getWebDriver().manage().window().maximize();
        String currentPageURL = getWebDriver().getCurrentUrl();
        Assertions.assertEquals(pageURL, currentPageURL);
    }

    @Допустим("^в поле \"([^\"]*)\" введено значение \"([^\"]*)\"$")
    public void enterValue(String input, String text) {
        $(byName(input)).setValue(text);
    }

    @Допустим("^нажата кнопка \"([^\"]*)\"$")
    public void clickOnButton(String button) {
        $(By.xpath("//button[contains(text(),'" + button + "')]")).click();
    }

    @Допустим("^выполнено нажатие кнопки \"([^\"]*)\"$")
    public void clickOnSubmit(String input) {
        $(byValue(input)).click();
    }

    @Тогда("^открытая страница называется \"([^\"]*)\"$")
    public void checkTitleName(String title) {
        String actualTitleName = $(".title").getText();
        Assertions.assertEquals(title, actualTitleName);
    }

    @Тогда("^открыт сайт \"([^\"]*)\"$")
    public void openLink(String link) {
        String currentPageURL = getWebDriver().getCurrentUrl();
        Assertions.assertEquals(link, currentPageURL);
    }

    @Тогда("^нажата ссылка \"([^\"]*)\"$")
    public void clickOnLink(String link) {
        $("." + link + "").click();
    }

    @Допустим("^выполнено нажатие на ссылку \"([^\"]*)\"$")
    public void clickOnItemName(String link) {
        $(By.xpath("//div[contains(text(),'" + link + "')]")).click();
    }

    @Тогда("^цена товара равна \"([^\"]*)\"$")
    public void checkPrice(String itemPrice) {
        String actualPrice = $(".inventory_details_price").getText();
        Assertions.assertEquals(actualPrice, itemPrice);
    }

}
