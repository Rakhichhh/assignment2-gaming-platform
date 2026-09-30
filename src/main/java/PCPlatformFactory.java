public class PCPlatformFactory implements GamingPlatformFactory {

    @Override
    public Controller createController() {
        return new PCController();
    }

    @Override
    public Display createDisplay() {
        return new PCDisplay();
    }

    @Override
    public AudioSystem createAudioSystem() {
        return new PCAudioSystem();
    }
}