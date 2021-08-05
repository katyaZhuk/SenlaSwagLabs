package swag_labs;

import org.junit.jupiter.api.*;

import com.codeborne.selenide.*;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static swag_labs.pages.CartPage.*;
import static swag_labs.pages.LoginPage.*;
import static swag_labs.pages.OverviewPage.*;
import static swag_labs.pages.ProductsPage.*;
import static swag_labs.pages.YourInfoPage.*;
import static swag_labs.pages.CompletePage.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SwagLabsTest {

    @BeforeEach
    public void setUp() throws IOException {
        Configuration.startMaximized = true;

        openLoginPage();
        login();

    }

    @Test
    public void loginTest() {
        Assertions.assertEquals("PRODUCTS", TITLE.getText());
    }

    @Test
    public void buyItemTest() {
        ADD_TO_CART_BUTTON.click();
        SHOPPING_CART.click();

        CHECKOUT_BUTTON.click();

        provideInfoToFields("any", "any", "123456");

        FINISH_BUTTON.click();

        Assertions.assertEquals("THANK YOU FOR YOUR ORDER",
                COMPLETE_ORDER.getText());
    }


    @Test
    public void cancelOrderTest() {
        ADD_TO_CART_BUTTON.click();
        SHOPPING_CART.click();

        CHECKOUT_BUTTON.click();

        provideInfoToFields("any", "any", "123456");

        CANCEL_BUTTON.click();

        Assertions.assertEquals("PRODUCTS", TITLE.getText());
    }

    @Test
    public void deleteAllItemsFromCartTest() {
        addItemsToCart();

        SHOPPING_CART.click();

        removeItemsFromCart();

        Assertions.assertEquals(0, itemsInCart.size());
    }

    @Test
    public void checkTotalTest() {
        addItemsToCart();
        SHOPPING_CART.click();
        CHECKOUT_BUTTON.click();

        provideInfoToFields("any", "any", "123456");

        Assertions.assertEquals(findItemTotal(), countTotal());
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }

}
