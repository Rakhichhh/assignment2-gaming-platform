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

    // Business Operation 1
    public void startSession() {

        System.out.println("\n=== STARTING GAMING SESSION ===");

        System.out.println("Platform family: " + controller.getFamily());
        System.out.println("Compatible products: " + isCompatible());

        controller.connect();
        display.initialize();
        audioSystem.initialize();

        display.render("Main Menu");
        audioSystem.playSound("Startup sound");

        System.out.println("Gaming session started.");
    }

    // Business Operation 2
    public void processPlayerAction() {

        System.out.println("\n=== PLAYER ACTION ===");

        String input = controller.readInput();

        System.out.println("Controller input received: " + input);

        display.render("Player performs action");
        audioSystem.playSound("Player action sound");
    }

    // Business Operation 3
    public void pauseGame() {

        System.out.println("\n=== PAUSE GAME ===");

        String input = controller.readInput();

        System.out.println("Pause command received from: " + input);

        display.render("Pause Menu");
        audioSystem.playSound("Pause menu sound");

        System.out.println("Game paused.");
    }

    public void shutdownSession() {

        System.out.println("\n=== SHUTDOWN ===");

        display.render("Saving game...");
        audioSystem.playSound("Shutdown sound");

        System.out.println("Game state saved.");
        System.out.println("Gaming session closed.");
    }
}