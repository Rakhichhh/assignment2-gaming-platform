import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose platform: pc, playstation, xbox: ");
        String platform = scanner.nextLine().toLowerCase();

        GamingPlatformFactory factory;
        GameLauncher launcher;

        if (platform.equals("pc")) {

            factory = new PCPlatformFactory();
            launcher = new PCGameLauncher();

        } else if (platform.equals("playstation")) {

            factory = new PlayStationPlatformFactory();
            launcher = new PlayStationGameLauncher();

        } else if (platform.equals("xbox")) {

            factory = new XboxPlatformFactory();
            launcher = new XboxGameLauncher();

        } else {

            System.out.println("Unknown platform.");
            return;
        }

        System.out.println();
        System.out.println("=== FACTORY METHOD ===");
        launcher.launchGame();

        System.out.println();
        System.out.println("=== ABSTRACT FACTORY ===");

        GamingSession session = new GamingSession(factory);

        session.startSession();
        session.playGame();
        session.shutdownSession();
    }
}