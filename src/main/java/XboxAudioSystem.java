public class XboxAudioSystem implements AudioSystem {

    @Override
    public void initialize() {
        System.out.println("Xbox audio initialized.");
    }

    @Override
    public void playSound(String sound) {
        System.out.println("Xbox audio plays: " + sound);
    }
}