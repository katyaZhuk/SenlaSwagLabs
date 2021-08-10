#language:ru
#encoding:UTF-8

@test
Функционал: Проверка цены товара

  Структура сценария: Проверка цены товара <itemName>
    Допустим открыта страница "https://www.saucedemo.com/"
    И в поле "user-name" введено значение "standard_user"
    И в поле "password" введено значение "secret_sauce"
    И выполнено нажатие кнопки "Login"
    Тогда открытая страница называется "PRODUCTS"
    Допустим выполнено нажатие на ссылку "<itemName>"
    Тогда цена товара равна "<itemPrice>"

    Примеры:
      | itemName                          | itemPrice   |
      | Sauce Labs Backpack               | $29.99      |
      | Sauce Labs Bike Light             | $9.99       |
      | Sauce Labs Bolt T-Shirt           | $15.99      |
      | Sauce Labs Fleece Jacket          | $49.99      |
      | Sauce Labs Onesie                 | $7.99       |
      | Test.allTheThings() T-Shirt (Red) | $15.99      |
