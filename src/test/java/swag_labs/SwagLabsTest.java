package swag_labs;

import org.junit.jupiter.api.*;

import java.io.IOException;

import static swag_labs.pages.CartPage.*;
import static swag_labs.pages.LoginPage.*;
import static swag_labs.pages.OverviewPage.*;
import static swag_labs.pages.ProductsPage.*;
import static swag_labs.pages.YourInfoPage.*;
import static swag_labs.pages.CompletePage.*;
import static utils.Driver.openMaximizedWindow;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SwagLabsTest {

    @BeforeAll
    public void setUp() {
        openMaximizedWindow();
    }

    @BeforeEach
    @Order(1)
    @Test
    public void loginTest() throws IOException {
        openLoginPage();
        login();
        Assertions.assertEquals("PRODUCTS", getTitleText());
    }

    @Order(2)
    @Test
    public void buyItemTest() {
        addToCart();
        goToShoppingCart();
        clickOnCheckoutButton();
        provideInfoToFields("any", "any", "123456");
        clickOnFinishButton();

        Assertions.assertEquals("THANK YOU FOR YOUR ORDER",
                getCompleteOrderText());
    }

    @Order(3)
    @Test
    public void cancelOrderTest() {
        addToCart();
        goToShoppingCart();
        clickOnCheckoutButton();
        provideInfoToFields("any", "any", "123456");
        clickOnCancelButton();

        Assertions.assertEquals("PRODUCTS", getTitleText());
    }

    @Order(4)
    @Test
    public void deleteAllItemsFromCartTest() {
        addItemsToCart();
        goToShoppingCart();
        removeItemsFromCart();

        Assertions.assertEquals(0, getItemsAmountInCart());
    }

    @Order(5)
    @Test
    public void checkTotalTest() {
        addItemsToCart();
        goToShoppingCart();
        clickOnCheckoutButton();
        provideInfoToFields("any", "any", "123456");

        Assertions.assertEquals(findItemTotal(), countTotal());
    }

}
