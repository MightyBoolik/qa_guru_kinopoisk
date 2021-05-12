package helpers;

import config.AuthorizationConfig;
import config.DriverConfig;
import org.aeonbits.owner.ConfigFactory;

public class WebConfigHelper {
    public static String getWebRemoteDriver() {
        // https://%s:%s@selenoid.autotests.cloud/wd/hub/
        return String.format(System.getProperty("web.remote.driver"),
                getWebConfig().webRemoteDriverUser(),
                getWebConfig().webRemoteDriverPassword());
    }
    public static String getTestUsername() {
        return getAuthorizationConfig().testUsername();
    }
    public static String getTestPassword() {
        return getAuthorizationConfig().testPassword();
    }
    public static String getUrl() {
        return getWebConfig().url();
    }

    public static boolean isRemoteWebDriver() {
        return System.getProperty("web.remote.driver") != null;
    }

    public static String getWebVideoStorage() {
        return System.getProperty("video.storage");
    }

    public static boolean isVideoOn() {
        return getWebVideoStorage() != null;
    }
    private static AuthorizationConfig getAuthorizationConfig() {
        return ConfigFactory.newInstance().create(
                AuthorizationConfig.class, System.getProperties());
    }

    private static DriverConfig getWebConfig() {
        return ConfigFactory.newInstance().create(
                DriverConfig.class, System.getProperties());
    }
}
