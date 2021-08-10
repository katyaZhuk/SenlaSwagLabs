#language:ru
#encoding:UTF-8

@test @purchase
Функционал: Покупка товара

  Сценарий: Проверка, что выбранный товар будет куплен
    Допустим открыта страница "https://www.saucedemo.com/"
    И в поле "user-name" введено значение "standard_user"
    И в поле "password" введено значение "secret_sauce"
    И выполнено нажатие кнопки "Login"
    Тогда открытая страница называется "PRODUCTS"
    Допустим нажата кнопка "Add to cart"
    И нажата ссылка "shopping_cart_link"
    Тогда открытая страница называется "YOUR CART"
    Допустим нажата кнопка "Checkout"
    Тогда открытая страница называется "CHECKOUT: YOUR INFORMATION"
    Допустим в поле "firstName" введено значение "имя"
    И в поле "lastName" введено значение "фамилия"
    И в поле "postalCode" введено значение "123456"
    И выполнено нажатие кнопки "Continue"
    Тогда открытая страница называется "CHECKOUT: OVERVIEW"
    Допустим нажата кнопка "Finish"
    Тогда открытая страница называется "CHECKOUT: COMPLETE!"
    И открыта страница "https://www.saucedemo.com/checkout-complete.html"

