public class NintendoAudioSystem implements AudioSystem {

    @Override
    public void initialize() {
        System.out.println("Nintendo audio system initialized.");
    }

    @Override
    public void playSound(String sound) {
        System.out.println("Nintendo audio plays: " + sound);
    }

    @Override
    public String getFamily() {
        return "Nintendo";
    }
}