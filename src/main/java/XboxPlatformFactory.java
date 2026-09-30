public class XboxPlatformFactory implements GamingPlatformFactory {

    @Override
    public Controller createController() {
        return new XboxController();
    }

    @Override
    public Display createDisplay() {
        return new XboxDisplay();
    }

    @Override
    public AudioSystem createAudioSystem() {
        return new XboxAudioSystem();
    }
}