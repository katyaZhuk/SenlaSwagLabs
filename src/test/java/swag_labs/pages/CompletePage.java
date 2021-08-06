package swag_labs.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CompletePage {

    private static final SelenideElement COMPLETE_ORDER_TITLE = $(".complete-header");

    public static String getCompleteOrderText() {
        return COMPLETE_ORDER_TITLE.getText();
    }

}
