import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose platform: pc, playstation, xbox: ");
        String platform = scanner.nextLine().toLowerCase();

        GamingPlatformFactory factory;

        if (platform.equals("pc")) {
            factory = new PCPlatformFactory();

        } else if (platform.equals("playstation")) {
            factory = new PlayStationPlatformFactory();

        } else if (platform.equals("xbox")) {
            factory = new XboxPlatformFactory();

        } else {
            System.out.println("Unknown platform.");
            return;
        }

        GamingSession session = new GamingSession(factory);

        session.startSession();
        session.playGame();
        session.shutdownSession();
    }
}