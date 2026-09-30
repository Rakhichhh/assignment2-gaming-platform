public class GamingSession {

    private final Controller controller;
    private final Display display;
    private final AudioSystem audioSystem;

    public GamingSession(GamingPlatformFactory factory) {
        this.controller = factory.createController();
        this.display = factory.createDisplay();
        this.audioSystem = factory.createAudioSystem();
    }

    public void startSession() {
        System.out.println("Starting gaming session...");

        controller.connect();
        display.initialize();
        audioSystem.initialize();

        System.out.println("Gaming session started.");
    }

    public void playGame() {
        String input = controller.readInput();

        display.render("Player action: " + input);
        audioSystem.playSound("Action sound");
    }

    public void shutdownSession() {
        System.out.println("Saving game state...");
        System.out.println("Gaming session closed.");
    }
}