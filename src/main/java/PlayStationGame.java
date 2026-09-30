public class PlayStationGame implements Game {

    @Override
    public void loadResources() {
        System.out.println("Loading PlayStation game resources...");
    }

    @Override
    public void initialize() {
        System.out.println("Initializing PlayStation services...");
    }

    @Override
    public void start() {
        System.out.println("PlayStation game started.");
    }
}