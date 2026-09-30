public class XboxGameLauncher extends GameLauncher {

    @Override
    protected Game createGame() {
        return new XboxGame();
    }
}