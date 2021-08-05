package swag_labs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class YourInfoPage {

    private static final SelenideElement FIRST_NAME = $("#first-name");
    private static final SelenideElement LAST_NAME = $("#last-name");
    private static final SelenideElement ZIP_CODE = $("#postal-code");
    private static final SelenideElement CONTINUE_BUTTON = $("#continue");

    public static void provideInfoToFields(String firstName, String lastName,
                                           String zipCode) {
        FIRST_NAME.sendKeys(firstName);
        LAST_NAME.sendKeys(lastName);
        ZIP_CODE.sendKeys(zipCode);
        CONTINUE_BUTTON.click();
    }


}
