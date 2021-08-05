package swag_labs.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductsPage {

    public static final SelenideElement TITLE = $(".title");
    public static final SelenideElement ADD_TO_CART_BUTTON = $("#add-to-cart-sauce-labs-backpack");
    public static final SelenideElement SHOPPING_CART = $(".shopping_cart_link");

    static ElementsCollection addedItemsCollection = $$(By.xpath("//button[contains(text(), 'Add to cart')]"));

    public static void addItemsToCart() {
        for (SelenideElement elem : addedItemsCollection) {
            elem.click();
        }
    }

}
