package swag_labs.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class OverviewPage {

    public static final SelenideElement FINISH_BUTTON = $("#finish");
    public static final SelenideElement CANCEL_BUTTON = $("#cancel");
    public static SelenideElement itemTotal = $(".summary_subtotal_label");

    static ElementsCollection prisesCollection = $$(".inventory_item_price");

    public static double countTotal() {
        double result = 0;

        for (SelenideElement elem : prisesCollection) {
            double element = Double.parseDouble(elem.getText().substring(1));
            result += element;
        }

        return result;
    }

    public static double findItemTotal() {
        return Double.parseDouble(itemTotal.getText().split("\\$")[1]);
    }

}
