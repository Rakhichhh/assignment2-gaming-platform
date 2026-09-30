public class PCAudioSystem implements AudioSystem {

    @Override
    public void initialize() {
        System.out.println("PC audio system initialized.");
    }

    @Override
    public void playSound(String sound) {
        System.out.println("PC audio plays: " + sound);
    }

    @Override
    public String getFamily() {
        return "PC";
    }
}