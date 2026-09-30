import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Choose platform: pc, playstation, xbox: "
        );

        String platform = scanner.nextLine();

        GamingPlatformFactory factory;

        try {

            factory =
                    PlatformFactoryProvider.getFactory(platform);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
            return;
        }

        GamingSession session =
                new GamingSession(factory);

        session.startSession();

        session.processPlayerAction();

        session.pauseGame();

        session.shutdownSession();
    }
}