package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:remote.properties"
})
public interface DriverConfig extends Config {
    @Config.Key("web.remote.url")
    String webRemoteUrl();

    @Config.Key("web.remote.driver.user")
    String webRemoteDriverUser();

    @Config.Key("web.remote.driver.password")
    String webRemoteDriverPassword();

    @Key("video.storage")
    String videoStorage();

}
