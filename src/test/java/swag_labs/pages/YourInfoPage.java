package swag_labs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class YourInfoPage {

    private static final SelenideElement FIRST_NAME_FIELD = $("#first-name");
    private static final SelenideElement LAST_NAME_FIELD = $("#last-name");
    private static final SelenideElement ZIP_CODE_FIELD = $("#postal-code");
    private static final SelenideElement CONTINUE_BUTTON = $("#continue");

    public static void provideInfoToFields(String firstName, String lastName,
                                           String zipCode) {
        FIRST_NAME_FIELD.sendKeys(firstName);
        LAST_NAME_FIELD.sendKeys(lastName);
        ZIP_CODE_FIELD.sendKeys(zipCode);
        CONTINUE_BUTTON.click();
    }

}
