public class PCGameLauncher extends GameLauncher {

    @Override
    protected Game createGame() {
        return new PCGame();
    }
}