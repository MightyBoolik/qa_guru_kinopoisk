package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static helpers.WebConfigHelper.isVideoOn;
import static helpers.AttachmentHelper.*;
import static helpers.DriverHelper.*;

public class TestBase {
    @BeforeAll
    public static void configHelper() {
        configureDriver();
    }

    @AfterEach
    public void addAttachments() {
        String sessionId = getSessionId();
        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser console logs", getConsoleLogs());
        if (isVideoOn()) attachVideo(sessionId);
        closeWebDriver();
    }
}