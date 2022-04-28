package com.deosite.tests.i18n;

import com.deosite.tests.model.account.NewAddressForm;
import com.deosite.tests.model.login.LoginForm;
import com.deosite.tests.model.login.DifferentLoginForm;
import com.deosite.tests.model.order.Personal;
import com.deosite.tests.model.order.Company;
import com.deosite.tests.model.order.WithoutEmailAddress;
import com.deosite.tests.model.register.RegisterForm;

import java.util.ListResourceBundle;

public class Bundle_ro_RO extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                // Labels
                {"capacity (l) label", "pojemność (l)"},
                {"capacity (ml) label", "pojemność (ml)"},

                // Products
                {"mug", "Masă"},
                {"configurable product", "Față"},

                // Number of products in the cart
                {"greater", "Coşul tău (2)"},
                {"smaller", "Coşul tău (1)"},

                // Categories

                //Headers
                {"account header", "Cont"},
                {"Ogród header", "Grădină & exterior "},
                {"Jadalnia header", "Esszimmer "},
                {"Kuchnia header", "Küche "},
                {"Łazienka i garderoba header", "Articole de curățenie "},
                {"Dekoracje header", "Decorațiuni "},
                {"Świat dziecka header", "Lumea copiilor "},
                {"Nowości header", "Noutăți "},
                {"Wyprzedaż header", "Reduceri "},
                {"Promocje header", "Promocje - Kupuj Taniej!"},
                {"Marki header", "Mărci"},



                // Alerts
                {"added to cart", "Produsul a fost adăugat la coș"},
                {"address saved", "Adresa salvată"},
                {"address deleted", "Address deleted"},

                // Messages
                {"success order message", "Dziękujemy, Twoje zamówienie zostało złożone!"},
                {"additional success info", "Zamówienie jest kompletowane, o wysyłce poinformujemy drogą mailową."},
                {"the cart is empty message", "Nu aveți produse în coș."},
                {"login button text", "Autentificare"},
                // Objects
                {"person", new Personal(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789"

                )},
                {"personFromPortugal", new Personal(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789"
                )},
                {"personFromIreland", new Personal(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789"
                )},
                {"company", new Company(
                        "test@test.pl",
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789",
                        "Testowa sp. z o.o",
                        "1234567891"

                )},
                {"withoutEmailAddress", new WithoutEmailAddress(
                        "Test",
                        "Test-Test",
                        "Testowa 1",
                        "Testowo",
                        "11-111",
                        "123456789"
                )},
                {"login", new LoginForm(
                        "tester-email-tester@yandex.com",
                        "Test12345!"
                )},
                {"login to order_1", new LoginForm(
                        "abisimeon22@yandex.com",
                        "Test12345!"
                )},
                {"login to order_2", new LoginForm(
                        "abisimeon222@yandex.com",
                        "Test12345!"
                )},
                {"login to order_3", new LoginForm(
                        "abisimeon223@yandex.com",
                        "Test12345!"
                )},
                {"login to see order", new LoginForm(
                        "tekasimeon00@gmail.com",
                        "Test12345!"
                )},
                {"differentEmail", new DifferentLoginForm(
                        "tester-tester-terster@yandex.com",
                        "Test12345!"
                )
                },
                {"newAddress", new NewAddressForm(
                        "Salomea",
                        "Kowalska",
                        "Testowa 1",
                        "Testowo",
                        "00-000",
                        "0000000000"
                )},
                {"register", new RegisterForm(
                        "Test12345!",
                        "Test",
                        "Test-Test"
                )}
        };
    }
}
