package tests;

import config.DataConfig;
import org.aeonbits.owner.ConfigFactory;

public class UserData {
    private static DataConfig getUserData() {
        return ConfigFactory.newInstance().create(DataConfig.class, System.getProperties());
    }
    public static String getWebUrl() {
        return getUserData().webUrl();
    }
    public static String getTestUsername() {
        return getUserData().testUsername();
    }

    public static String getTestPassword() {
        return getUserData().testPassword();
    }
}
