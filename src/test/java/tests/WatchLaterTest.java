package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WatchLaterTest {
    @Owner("Булат Кучаев")
    @Test
    @DisplayName("Тест кнопки 'Буду смотреть' в календаре релизов")
    void watchLaterButton() {
        open("https://www.kinopoisk.ru/");
        $(".desktop-layout-with-sidebar__middle").shouldHave(text("Рядовой Чээрин")).click();


    }
}
