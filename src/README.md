# Cross-Platform Gaming System

Student: Myrzabekov Rakhat  
Group: SE-2518  
University: Astana IT University

## Project Description

This project demonstrates the use of the Factory Method and Abstract Factory design patterns in a cross-platform gaming system.

The system supports several gaming platforms. Each platform represents a product family containing compatible products.

Original product families:

- PC
- PlayStation
- Xbox

Extended product family:

- Nintendo

Each product family contains three product types:

- Controller
- Display
- AudioSystem

The purpose of the project is to reduce direct dependencies on concrete classes and make the system easier to extend with new gaming platforms.

## Factory Method

The Factory Method pattern is implemented using the GameLauncher hierarchy.

Product:

- Game

Concrete Products:

- PCGame
- PlayStationGame
- XboxGame

Creator:

- GameLauncher

Concrete Creators:

- PCGameLauncher
- PlayStationGameLauncher
- XboxGameLauncher

The GameLauncher class defines the factory method:

protected abstract Game createGame();

Each concrete launcher overrides this method and decides which concrete Game object should be created.

The GameLauncher also contains meaningful business logic in the launchGame() method.

The launchGame() method:

- creates a Game object;
- loads game resources;
- initializes the game;
- starts the game.

This is Factory Method because object creation is decided through inheritance and method overriding.

## Abstract Factory

The Abstract Factory pattern is implemented through the GamingPlatformFactory interface.

GamingPlatformFactory creates three related product types:

- Controller
- Display
- AudioSystem

Concrete factories:

- PCPlatformFactory
- PlayStationPlatformFactory
- XboxPlatformFactory
- NintendoPlatformFactory

Each concrete factory creates one complete and compatible product family.

For example:

PCPlatformFactory creates:

- PCController
- PCDisplay
- PCAudioSystem

PlayStationPlatformFactory creates:

- PlayStationController
- PlayStationDisplay
- PlayStationAudioSystem

XboxPlatformFactory creates:

- XboxController
- XboxDisplay
- XboxAudioSystem

NintendoPlatformFactory creates:

- NintendoController
- NintendoDisplay
- NintendoAudioSystem

## Product Families

### PC Family

- PCController
- PCDisplay
- PCAudioSystem

### PlayStation Family

- PlayStationController
- PlayStationDisplay
- PlayStationAudioSystem

### Xbox Family

- XboxController
- XboxDisplay
- XboxAudioSystem

### Nintendo Family

- NintendoController
- NintendoDisplay
- NintendoAudioSystem

## Compatibility

Products from one platform family should be used together.

Correct example:

PCController + PCDisplay + PCAudioSystem

Another correct example:

XboxController + XboxDisplay + XboxAudioSystem

An incorrect combination would be:

PCController + XboxDisplay + PlayStationAudioSystem

The architecture makes incorrect combinations difficult because GamingSession receives one GamingPlatformFactory and creates all required products through the same factory.

Example:

public GamingSession(GamingPlatformFactory factory) {
this.controller = factory.createController();
this.display = factory.createDisplay();
this.audioSystem = factory.createAudioSystem();
}

All products are therefore created from one compatible product family.

The system also provides the isCompatible() method to verify that all products belong to the same family.

## Runtime Factory Selection

The application can select a product family dynamically at runtime.

The PlatformFactoryProvider class is responsible for selecting the correct factory.

Supported values:

- pc
- playstation
- xbox
- nintendo

Example:

GamingPlatformFactory factory =
PlatformFactoryProvider.getFactory(platform);

After the factory is selected, the main business logic does not need to know which concrete family is being used.

GamingSession works only through abstractions.

## Business Logic

The main business class is GamingSession.

It contains several realistic business operations involving multiple products.

### startSession()

This operation:

- connects the controller;
- initializes the display;
- initializes the audio system;
- shows the main menu;
- plays the startup sound.

### processPlayerAction()

This operation:

- reads input from the controller;
- processes the player action;
- displays the result;
- plays an action sound.

### pauseGame()

This operation:

- receives the pause command;
- shows the pause menu;
- plays the pause sound.

### shutdownSession()

This operation:

- displays the saving process;
- plays the shutdown sound;
- saves the game state;
- closes the gaming session.

These operations demonstrate collaboration between Controller, Display, and AudioSystem.

## Adding a New Product Family

Nintendo was added as the fourth product family.

The following new classes were created:

- NintendoController
- NintendoDisplay
- NintendoAudioSystem
- NintendoPlatformFactory

The existing GamingSession business logic did not require modification.

Only the runtime factory selection was updated to register the Nintendo family.

This demonstrates that the system can be extended with minimal changes to existing business logic.

## UML Diagram

The UML class diagram includes:

- Product interfaces
- Concrete Products
- Creator
- Concrete Creators
- Abstract Factory
- Concrete Factories
- Client
- Runtime Factory Provider
- Main class
- Relationships between classes

The UML diagram also separates the Factory Method and Abstract Factory parts of the project.

## Automated Tests

The project uses JUnit 5 for automated testing.

The tests cover:

- PC product creation
- PlayStation product creation
- Xbox product creation
- Nintendo product creation
- Correct concrete product creation
- Product family compatibility
- Runtime factory selection
- Invalid platform selection
- Empty platform input
- Business behavior
- Nintendo family
- Client working through abstractions

The project contains more than the required minimum of 15 automated tests.

## Technologies

- Java 17
- Maven
- JUnit 5
- PlantUML
- Git
- GitHub
- IntelliJ IDEA

## Project Structure

src/
├── main/
│   └── java/
│       ├── Main.java
│       ├── PartAMain.java
│       ├── PlatformFactoryProvider.java
│       ├── GamingSession.java
│       │
│       ├── Controller.java
│       ├── Display.java
│       ├── AudioSystem.java
│       │
│       ├── PCController.java
│       ├── PCDisplay.java
│       ├── PCAudioSystem.java
│       │
│       ├── PlayStationController.java
│       ├── PlayStationDisplay.java
│       ├── PlayStationAudioSystem.java
│       │
│       ├── XboxController.java
│       ├── XboxDisplay.java
│       ├── XboxAudioSystem.java
│       │
│       ├── NintendoController.java
│       ├── NintendoDisplay.java
│       ├── NintendoAudioSystem.java
│       │
│       ├── GamingPlatformFactory.java
│       ├── PCPlatformFactory.java
│       ├── PlayStationPlatformFactory.java
│       ├── XboxPlatformFactory.java
│       ├── NintendoPlatformFactory.java
│       │
│       ├── Game.java
│       ├── PCGame.java
│       ├── PlayStationGame.java
│       ├── XboxGame.java
│       │
│       ├── GameLauncher.java
│       ├── PCGameLauncher.java
│       ├── PlayStationGameLauncher.java
│       └── XboxGameLauncher.java
│
└── test/
└── java/
└── GamingPlatformTest.java

## How to Run

Run Main.java.

The application will ask:

Choose platform: pc, playstation, xbox, nintendo:

Enter one of the supported platform names.

Examples:

pc

playstation

xbox

nintendo

The application will create the corresponding product family and start a gaming session.

Part A can be demonstrated separately by running:

PartAMain.java

This version shows the initial implementation without factories and demonstrates the problems of direct object creation.

## Git History

The project uses meaningful Git commits to demonstrate development history.

The development stages include:

1. Initial implementation without factories
2. Factory Method implementation
3. Abstract Factory implementation
4. Product family compatibility
5. Runtime factory selection
6. Business scenarios
7. Nintendo family extension
8. Automated tests
9. UML documentation

## Author

Myrzabekov Rakhat  
Group: SE-2518  
Astana IT University