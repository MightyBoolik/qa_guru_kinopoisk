package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static helpers.AttachmentHelper.*;
import static helpers.DriverHelper.*;
import static tests.UserData.getWebUrl;

public class TestBase {
    @BeforeAll
    public static void configHelper() {
        Configuration.baseUrl = getWebUrl();
        configureDriver();
    }

    @AfterEach
    public void addAttachments() {
        String sessionId = getSessionId();
        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser console logs", getConsoleLogs());
        closeWebDriver();
        if (isVideoOn()) attachVideo(sessionId);
    }
}