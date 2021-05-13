package tests;


import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static helpers.WebConfigHelper.getUrl;

public class SearchingTest extends TestBase {
    //MainPageTest url = new MainPageTest();
    private String  movieName = "Остров проклятых",
            engName = "Shutter Island, 2009",
            headerClass = ".kinopoisk-header-search-form__suggest-container .kinopoisk-header-suggest-group";

    @Test
    @DisplayName("Поиска фильма по названию")
    @Owner("Булат Кучаев")
    @Tag("web")
    void findFilm() {
        open(getUrl());
        $(By.name("kp_query")).val(movieName);
        $(headerClass).shouldHave(text(engName)).click();
        $("#__next").shouldHave(text(movieName));
    }
}
