package tests;


import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    /*
    1. Наличие элементов на главной странице
    2. Логин тест через яндекс/учетку сайта
    3. Поле ввода для поиска фильмов
    4. Тест кнопок "Буду смотреть" в календаре релизов
    5. Расширенный поиск
     */
    @Owner("Булат Кучаев")
    @Test
    @DisplayName("Проверка прогрузки элемента на главной странице")
    void visibilityOnPageTest() {
        open("https://www.kinopoisk.ru/");
        $(".desktop-layout-with-sidebar__content").shouldHave(text("Выбор редакции"));
    }
    @Test
    @DisplayName("Вход на сайт через учетную запись Yandex")
    void loginWithYandex(){
        open("https://www.kinopoisk.ru/");
        $(".desktop-layout-with-sidebar .header-v4__user-bar").shouldBe(visible).click();
        $(".passp-auth-content").shouldBe(visible);
    }

}
