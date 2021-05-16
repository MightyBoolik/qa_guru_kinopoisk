package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:user.properties"
})
public interface DataConfig extends Config {
    @Key("web.url")
    String webUrl();

    @Key("yandex.login")
    String testUsername();

    @Key("yandex.password")
    String testPassword();
}