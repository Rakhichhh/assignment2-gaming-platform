public class PlatformFactoryProvider {

    public static GamingPlatformFactory getFactory(String platform) {

        if (platform.equalsIgnoreCase("pc")) {
            return new PCPlatformFactory();
        }

        if (platform.equalsIgnoreCase("playstation")) {
            return new PlayStationPlatformFactory();
        }

        if (platform.equalsIgnoreCase("xbox")) {
            return new XboxPlatformFactory();
        }

        throw new IllegalArgumentException("Unknown platform: " + platform);
    }
}