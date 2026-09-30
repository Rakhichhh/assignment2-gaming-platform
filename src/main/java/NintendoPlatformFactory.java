public class NintendoPlatformFactory implements GamingPlatformFactory {

    @Override
    public Controller createController() {
        return new NintendoController();
    }

    @Override
    public Display createDisplay() {
        return new NintendoDisplay();
    }

    @Override
    public AudioSystem createAudioSystem() {
        return new NintendoAudioSystem();
    }
}