package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static helpers.WebConfigHelper.getUrl;

public class MoreMaterialsTest extends TestBase {
    //MainPageTest url = new MainPageTest();
    @Test
    @DisplayName("Тест кнопки 'Больше материалов' и переключение нумерации страниц")
    @Owner("Булат Кучаев")
    @Tag("web")
    void watchLaterButton() {
        open(getUrl());
        $(".main-page-media-block__main .ui-button").click();
        $(".paginator__page-relative").shouldBe(visible).click();
        $(".media-desktop-list-page-layout__body").shouldBe(visible);

    }
}
