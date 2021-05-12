package helpers;

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
        return getDriverConfig().testUsername();
    }
    public static String getTestPassword() {
        return getDriverConfig().testPassword();
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
    private static DriverConfig getDriverConfig() {
        return ConfigFactory.newInstance().create(
                DriverConfig.class, System.getProperties());
    }

    private static DriverConfig getWebConfig() {
        return ConfigFactory.newInstance().create(
                DriverConfig.class, System.getProperties());
    }
}
