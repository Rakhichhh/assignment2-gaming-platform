public class PlayStationDisplay implements Display {

    @Override
    public void initialize() {
        System.out.println("PlayStation display initialized.");
    }

    @Override
    public void render(String scene) {
        System.out.println("PlayStation display renders: " + scene);
    }
}