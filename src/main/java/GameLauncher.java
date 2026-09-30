public abstract class GameLauncher {

    protected abstract Game createGame();

    public void launchGame() {
        System.out.println("Preparing game launch...");

        Game game = createGame();

        game.loadResources();
        game.initialize();
        game.start();

        System.out.println("Game launch completed.");
    }
}