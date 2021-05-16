package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class OnlineCinemaSearchTest extends TestBase {
    @Test
    @DisplayName("Поиск фильма в онлайн-кинотеатре")
    @Owner("Булат Кучаев")
    @Tag("web")
    void searchFilm() {
        open("");
        $(".kinopoisk-header-featured-menu__item").shouldHave(text("Онлайн-кинотеатр")).click();


    }
}
