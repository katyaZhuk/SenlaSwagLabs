package swag_labs.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProductsPage {

    private static final SelenideElement PAGE_TITLE = $(".title");
    private static final SelenideElement ADD_TO_CART_BUTTON = $("#add-to-cart-sauce-labs-backpack");
    private static final SelenideElement SHOPPING_CART_BUTTON = $(".shopping_cart_link");

    private static final ElementsCollection ADDED_ELEMENTS_COLLECTION =
            $$(By.xpath("//button[contains(text(), 'Add to cart')]"));

    public static String getTitleText() {
        return PAGE_TITLE.getText();
    }

    public static void goToShoppingCart() {
        SHOPPING_CART_BUTTON.click();
    }

    public static void addToCart() {
        ADD_TO_CART_BUTTON.click();
    }

    public static void addItemsToCart() {
        ADDED_ELEMENTS_COLLECTION.forEach(SelenideElement::click);
    }

}
