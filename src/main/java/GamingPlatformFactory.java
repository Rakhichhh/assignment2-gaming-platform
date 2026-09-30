public interface GamingPlatformFactory {

    Controller createController();

    Display createDisplay();

    AudioSystem createAudioSystem();
}