package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class OnlineCinemaSearchTest extends TestBase {
    private String kinoButton = ".kinopoisk-header-featured-menu__item",
            searchButton = ".HeaderContent__search-button--2aqqT",
            searchField = ".SuggestSearch__input--75Gpy",
            searchResults = ".SuggestList__content--2B-cT .SuggestListItem__info--8BXcy";

    @Test
    @Owner("Булат Кучаев")
    @Tag("web")
    @DisplayName("Поиск фильма в онлайн-кинотеатре")
    void searchFilm() {
        open("");
        $(kinoButton).shouldHave(text("Онлайн-кинотеатр")).click();
        $(".HeaderContent__search-button--2aqqT").click();
        $(".Input__input--2p4oz").val("Сериалы");
        $(".SuggestList__content--2B-cT").shouldBe(visible);
    }
}
