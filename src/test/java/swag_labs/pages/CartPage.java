package swag_labs.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    private static final SelenideElement CHECKOUT_BUTTON = $("#checkout");

    private static final ElementsCollection REMOVED_ITEMS_COLLECTION =
            $$(By.xpath("//button[contains(text(), 'Remove')]"));
    private static final ElementsCollection ITEMS_IN_CART = $$(".cart_item");

    public static void clickOnCheckoutButton() {
        CHECKOUT_BUTTON.click();
    }

    public static void removeItemsFromCart() {
        for (SelenideElement elem : REMOVED_ITEMS_COLLECTION) {
            elem.click();
        }
    }

    public static int getItemsAmountInCart() {
        return ITEMS_IN_CART.size();
    }

}
