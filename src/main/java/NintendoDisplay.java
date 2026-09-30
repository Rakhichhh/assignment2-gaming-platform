public class NintendoDisplay implements Display {

    @Override
    public void initialize() {
        System.out.println("Nintendo display initialized.");
    }

    @Override
    public void render(String scene) {
        System.out.println("Nintendo display renders: " + scene);
    }

    @Override
    public String getFamily() {
        return "Nintendo";
    }
}