public class PlayStationPlatformFactory implements GamingPlatformFactory {

    @Override
    public Controller createController() {
        return new PlayStationController();
    }

    @Override
    public Display createDisplay() {
        return new PlayStationDisplay();
    }

    @Override
    public AudioSystem createAudioSystem() {
        return new PlayStationAudioSystem();
    }
}