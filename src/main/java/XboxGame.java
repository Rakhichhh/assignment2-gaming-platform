public class XboxGame implements Game {

    @Override
    public void loadResources() {
        System.out.println("Loading Xbox game resources...");
    }

    @Override
    public void initialize() {
        System.out.println("Initializing Xbox services...");
    }

    @Override
    public void start() {
        System.out.println("Xbox game started.");
    }
}