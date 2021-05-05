package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class WatchLaterTest {
    @Owner("Булат Кучаев")
    @Test
    @DisplayName("Тест кнопки 'Буду смотреть' в календаре релизов")
    void watchLaterButtonTest() {
        open("https://www.kinopoisk.ru/");
        $(".desktop-layout-with-sidebar__middle").shouldHave(text("Рядовой Чээрин")).click();



    }
}
