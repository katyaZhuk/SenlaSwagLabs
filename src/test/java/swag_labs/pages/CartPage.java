package swag_labs.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    public static final SelenideElement CHECKOUT_BUTTON = $("#checkout");

    static ElementsCollection removedItemsCollection = $$(By.xpath("//button[contains(text(), 'Remove')]"));

    public static void removeItemsFromCart() {
        for (SelenideElement elem : removedItemsCollection) {
            elem.click();
        }
    }

    public static ElementsCollection itemsInCart = $$(".cart_item");

}
