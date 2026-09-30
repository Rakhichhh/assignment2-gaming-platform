public class GamingSession {

    private final Controller controller;
    private final Display display;
    private final AudioSystem audioSystem;

    public GamingSession(GamingPlatformFactory factory) {
        this.controller = factory.createController();
        this.display = factory.createDisplay();
        this.audioSystem = factory.createAudioSystem();
    }

    public boolean isCompatible() {
        return controller.getFamily().equals(display.getFamily())
                && controller.getFamily().equals(audioSystem.getFamily());
    }

    public void startSession() {
        System.out.println("Starting gaming session...");

        System.out.println("Platform family: " + controller.getFamily());
        System.out.println("Compatible products: " + isCompatible());

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