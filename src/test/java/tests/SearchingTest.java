package tests;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchingTest extends TestBase {
    @Test
    void findFilmTest() {
        open("https://www.kinopoisk.ru/");
        $(By.name("kp_query")).val("Остров проклятых");
        $(".kinopoisk-header-search-form__suggest-container .kinopoisk-header-suggest-group").shouldHave(text("Shutter Island, 2009")).click();
        $("#__next").shouldHave(text("Остров проклятых"));
    }
}
