package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MoreMaterialsTest extends TestBase {
    @Test
    @Owner("Булат Кучаев")
    @Tag("web")
    @DisplayName("Тест кнопки 'Больше материалов' и переключение нумерации страниц")
    void watchLaterButton() {
        open("");
        $(".main-page-media-block .ui-button").click();
        $(".paginator__page-relative").shouldBe(visible).click();
        $(".media-desktop-list-page-layout__body").shouldBe(visible);
    }
}
