package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
    @Config.Sources({
            "system:properties",
            "classpath:credentials.properties"
    })

    public interface AuthorizationConfig extends Config {
        @Key("yandex.login")
        String testUsername();

        @Key("yandex.password")
        String testPassword();
    }

