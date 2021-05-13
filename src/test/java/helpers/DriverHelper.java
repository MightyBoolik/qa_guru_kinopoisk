package helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.DriverConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.WebConfigHelper.getUrl;
import static org.openqa.selenium.logging.LogType.BROWSER;

public class DriverHelper {
    private static DriverConfig getDriverConfig() {
        return ConfigFactory.newInstance().create(DriverConfig.class, System.getProperties());
    }

    public static void configureDriver() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.startMaximized = true;
        Configuration.baseUrl = getUrl();
        ;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (WebConfigHelper.isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            Configuration.remote = getWebRemoteDriver();
        }
    }

    public static String getWebRemoteDriver() {
        // https://%s:%s@selenoid.autotests.cloud/wd/hub/
        return String.format(getDriverConfig().url(),
                getDriverConfig().webRemoteDriverUser(),
                getDriverConfig().webRemoteDriverPassword());
    }
        public static String getSessionId () {
            return ((RemoteWebDriver) getWebDriver()).getSessionId().toString().replace("selenoid", "");
        }

        public static String getConsoleLogs () {
            return String.join("\n", Selenide.getWebDriverLogs(BROWSER));
        }

        public static String getVideoUrl () {
            return getDriverConfig().videoStorage();
        }
    }
