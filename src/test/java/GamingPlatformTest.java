import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GamingPlatformTest {

    @Test
    void pcFactoryShouldCreatePCProducts() {
        GamingPlatformFactory factory = new PCPlatformFactory();

        assertInstanceOf(PCController.class, factory.createController());
        assertInstanceOf(PCDisplay.class, factory.createDisplay());
        assertInstanceOf(PCAudioSystem.class, factory.createAudioSystem());
    }

    @Test
    void playStationFactoryShouldCreatePlayStationProducts() {
        GamingPlatformFactory factory = new PlayStationPlatformFactory();

        assertInstanceOf(
                PlayStationController.class,
                factory.createController()
        );

        assertInstanceOf(
                PlayStationDisplay.class,
                factory.createDisplay()
        );

        assertInstanceOf(
                PlayStationAudioSystem.class,
                factory.createAudioSystem()
        );
    }

    @Test
    void xboxFactoryShouldCreateXboxProducts() {
        GamingPlatformFactory factory = new XboxPlatformFactory();

        assertInstanceOf(
                XboxController.class,
                factory.createController()
        );

        assertInstanceOf(
                XboxDisplay.class,
                factory.createDisplay()
        );

        assertInstanceOf(
                XboxAudioSystem.class,
                factory.createAudioSystem()
        );
    }

    @Test
    void nintendoFactoryShouldCreateNintendoProducts() {
        GamingPlatformFactory factory = new NintendoPlatformFactory();

        assertInstanceOf(
                NintendoController.class,
                factory.createController()
        );

        assertInstanceOf(
                NintendoDisplay.class,
                factory.createDisplay()
        );

        assertInstanceOf(
                NintendoAudioSystem.class,
                factory.createAudioSystem()
        );
    }

    @Test
    void pcProductsShouldBeCompatible() {
        GamingSession session =
                new GamingSession(new PCPlatformFactory());

        assertTrue(session.isCompatible());
    }

    @Test
    void playStationProductsShouldBeCompatible() {
        GamingSession session =
                new GamingSession(
                        new PlayStationPlatformFactory()
                );

        assertTrue(session.isCompatible());
    }

    @Test
    void xboxProductsShouldBeCompatible() {
        GamingSession session =
                new GamingSession(
                        new XboxPlatformFactory()
                );

        assertTrue(session.isCompatible());
    }

    @Test
    void nintendoProductsShouldBeCompatible() {
        GamingSession session =
                new GamingSession(
                        new NintendoPlatformFactory()
                );

        assertTrue(session.isCompatible());
    }

    @Test
    void providerShouldReturnPCFactory() {
        GamingPlatformFactory factory =
                PlatformFactoryProvider.getFactory("pc");

        assertInstanceOf(
                PCPlatformFactory.class,
                factory
        );
    }

    @Test
    void providerShouldReturnPlayStationFactory() {
        GamingPlatformFactory factory =
                PlatformFactoryProvider.getFactory("playstation");

        assertInstanceOf(
                PlayStationPlatformFactory.class,
                factory
        );
    }

    @Test
    void providerShouldReturnXboxFactory() {
        GamingPlatformFactory factory =
                PlatformFactoryProvider.getFactory("xbox");

        assertInstanceOf(
                XboxPlatformFactory.class,
                factory
        );
    }

    @Test
    void providerShouldReturnNintendoFactory() {
        GamingPlatformFactory factory =
                PlatformFactoryProvider.getFactory("nintendo");

        assertInstanceOf(
                NintendoPlatformFactory.class,
                factory
        );
    }

    @Test
    void invalidPlatformShouldThrowException() {

        assertThrows(
                IllegalArgumentException.class,
                () -> PlatformFactoryProvider.getFactory("mobile")
        );
    }

    @Test
    void emptyPlatformShouldThrowException() {

        assertThrows(
                IllegalArgumentException.class,
                () -> PlatformFactoryProvider.getFactory("")
        );
    }

    @Test
    void controllerShouldReturnInput() {

        Controller controller =
                new PCController();

        String input =
                controller.readInput();

        assertNotNull(input);
        assertFalse(input.isEmpty());
    }

    @Test
    void pcControllerShouldBelongToPCFamily() {

        Controller controller =
                new PCController();

        assertEquals(
                "PC",
                controller.getFamily()
        );
    }

    @Test
    void xboxDisplayShouldBelongToXboxFamily() {

        Display display =
                new XboxDisplay();

        assertEquals(
                "Xbox",
                display.getFamily()
        );
    }

    @Test
    void nintendoAudioShouldBelongToNintendoFamily() {

        AudioSystem audio =
                new NintendoAudioSystem();

        assertEquals(
                "Nintendo",
                audio.getFamily()
        );
    }

    @Test
    void gamingSessionShouldWorkThroughAbstractFactory() {

        GamingPlatformFactory factory =
                new PlayStationPlatformFactory();

        GamingSession session =
                new GamingSession(factory);

        assertTrue(session.isCompatible());
    }

    @Test
    void uppercasePlatformNameShouldWork() {

        GamingPlatformFactory factory =
                PlatformFactoryProvider.getFactory("XBOX");

        assertInstanceOf(
                XboxPlatformFactory.class,
                factory
        );
    }
}