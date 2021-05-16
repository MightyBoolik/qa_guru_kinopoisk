package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

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
        $(".HeaderContent__search-button--2aqqT").click();
        $(".SuggestSearch__input--75Gpy").clear();
        $(".SuggestSearch__input--75Gpy").val("Мортал Комбат");
        $(".SuggestList__content--2B-cT").shouldHave(text("Смертельная битва")).click();
        $(By.name("Trailer")).click();
        sleep(3000);
    }
}
