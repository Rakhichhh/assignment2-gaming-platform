import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose platform: pc, playstation, xbox: ");
        String platform = scanner.nextLine().toLowerCase();

        Controller controller;
        Display display;
        AudioSystem audio;

        if (platform.equals("pc")) {

            controller = new PCController();
            display = new PCDisplay();
            audio = new PCAudioSystem();

        } else if (platform.equals("playstation")) {

            controller = new PlayStationController();
            display = new PlayStationDisplay();
            audio = new PlayStationAudioSystem();

        } else if (platform.equals("xbox")) {

            controller = new XboxController();
            display = new XboxDisplay();
            audio = new XboxAudioSystem();

        } else {

            System.out.println("Unknown platform.");
            return;
        }

        controller.connect();
        display.initialize();
        audio.initialize();

        String input = controller.readInput();

        display.render("Player action from " + input);
        audio.playSound("Game action sound");
    }
}