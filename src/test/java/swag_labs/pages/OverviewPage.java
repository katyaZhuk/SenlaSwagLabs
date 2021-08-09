package swag_labs.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class OverviewPage {

    private static final SelenideElement FINISH_BUTTON = $("#finish");
    private static final SelenideElement CANCEL_BUTTON = $("#cancel");
    private static final SelenideElement ITEM_TOTAL = $(".summary_subtotal_label");

    private static final ElementsCollection PRICES_COLLECTION = $$(".inventory_item_price");

    public static void clickOnFinishButton() {
        FINISH_BUTTON.click();
    }

    public static void clickOnCancelButton() {
        CANCEL_BUTTON.click();
    }

    public static double countTotal() {
        return PRICES_COLLECTION.stream()
                .mapToDouble(elem -> Double.parseDouble(elem.getText().substring(1)))
                .sum();
    }

    public static double findItemTotal() {
        return Double.parseDouble(ITEM_TOTAL.getText().split("\\$")[1]);
    }

}
