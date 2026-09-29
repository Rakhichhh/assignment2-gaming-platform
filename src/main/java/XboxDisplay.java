public class XboxDisplay implements Display {

    @Override
    public void initialize() {
        System.out.println("Xbox display initialized.");
    }

    @Override
    public void render(String scene) {
        System.out.println("Xbox display renders: " + scene);
    }
}