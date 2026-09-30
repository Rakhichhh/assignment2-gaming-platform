public class PCGame implements Game {

    @Override
    public void loadResources() {
        System.out.println("Loading PC game resources...");
    }

    @Override
    public void initialize() {
        System.out.println("Initializing PC graphics and controls...");
    }

    @Override
    public void start() {
        System.out.println("PC game started.");
    }
}