package swag_labs.pages;

import com.codeborne.selenide.SelenideElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    final static SelenideElement USERNAME = $("#user-name");
    final static SelenideElement PASSWORD = $("#password");
    final static SelenideElement LOGIN_BUTTON = $("#login-button");

    public static void openLoginPage() {
        open("https://www.saucedemo.com/");
    }

    public static void login() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/user.properties"));
        USERNAME.sendKeys(props.getProperty("user.username"));
        PASSWORD.sendKeys(props.getProperty("user.password"));
        LOGIN_BUTTON.click();
    }
}
