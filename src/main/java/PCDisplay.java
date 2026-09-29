public class PCDisplay implements Display {

    @Override
    public void initialize() {
        System.out.println("PC display initialized.");
    }

    @Override
    public void render(String scene) {
        System.out.println("PC display renders: " + scene);
    }
}