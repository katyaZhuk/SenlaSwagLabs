package swag_labs.pages;

import com.codeborne.selenide.SelenideElement;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static utils.PropertiesHelper.*;

public class LoginPage {

    private final static SelenideElement USERNAME_FIELD = $("#user-name");
    private final static SelenideElement PASSWORD_FIELD = $("#password");
    private final static SelenideElement LOGIN_BUTTON = $("#login-button");

    public static void openLoginPage() throws IOException {
        open(getUrl());
    }

    public static void login() throws IOException {
        USERNAME_FIELD.sendKeys(getUsername());
        PASSWORD_FIELD.sendKeys(getPassword());
        LOGIN_BUTTON.click();
    }
}
