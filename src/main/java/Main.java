import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose platform: pc, playstation, xbox: ");
        String platform = scanner.nextLine().toLowerCase();

        GameLauncher launcher;

        if (platform.equals("pc")) {
            launcher = new PCGameLauncher();

        } else if (platform.equals("playstation")) {
            launcher = new PlayStationGameLauncher();

        } else if (platform.equals("xbox")) {
            launcher = new XboxGameLauncher();

        } else {
            System.out.println("Unknown platform.");
            return;
        }

        launcher.launchGame();
    }
}