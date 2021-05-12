package config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {
    public static String getTestUsername() {
        return getAuthorizationConfig().testUsername();
    }
    public static String getTestPassword() {
        return getAuthorizationConfig().testPassword();
    }
    public static String getUrl() {
        return getWebConfig().url();
    }
    public static String getText() {
        return getSearchConfig().text();
    }

    public static String getWebRemoteDriver() {
        return String.format(System.getProperty("web.remote.driver"),
                getWebConfig().webRemoteDriverUser(),
                getWebConfig().webRemoteDriverPassword(),
                getWebConfig().webRemoteDriverUrl());
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
    private static WebConfig getWebConfig() {
        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }

    private static SearchConfig getSearchConfig() {
        return ConfigFactory.newInstance().create(SearchConfig.class, System.getProperties());
    }
}

