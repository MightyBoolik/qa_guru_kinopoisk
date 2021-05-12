package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:remote.properties"
})
public interface WebConfig extends Config {
    @Config.Key("url")
    String url();

    @Config.Key("web.remote.driver.user")
    String webRemoteDriverUser();

    @Config.Key("web.remote.driver.password")
    String webRemoteDriverPassword();

}
