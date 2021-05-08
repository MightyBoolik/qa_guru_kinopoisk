package tests;


import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest extends TestBase {
    /*
    1. Наличие элементов на главной странице
    2. Логин тест через яндекс/учетку сайта
    3. Поле ввода для поиска фильмов
    4. Тест кнопок "Буду смотреть" в календаре релизов
    5. Расширенный поиск
     */
    @Owner("Булат Кучаев")
    @Test
    @DisplayName("Проверка загрузки элемента на главной странице")
    void visibilityOnPage() {
        open("https://www.kinopoisk.ru/");
        $(".desktop-layout-with-sidebar__content").shouldHave(text("Выбор редакции"));


    }

    @Test
    @DisplayName("Вход на сайт через учетную запись Yandex")
    void loginWithYandex() {
        open("https://www.kinopoisk.ru/");
        $(".desktop-layout-with-sidebar .header-v4__user-bar").shouldBe(visible).click();
        $("#passp-field-login").val("Onikrof").pressEnter();
        $("#passp-field-passwd").val("43315231");

    }

}
