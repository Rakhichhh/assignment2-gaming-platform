public class PlayStationAudioSystem implements AudioSystem {

    @Override
    public void initialize() {
        System.out.println("PlayStation audio initialized.");
    }

    @Override
    public void playSound(String sound) {
        System.out.println("PlayStation audio plays: " + sound);
    }

    @Override
    public String getFamily() {
        return "PlayStation";
    }
}