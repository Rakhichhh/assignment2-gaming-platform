public class PlayStationGameLauncher extends GameLauncher {

    @Override
    protected Game createGame() {
        return new PlayStationGame();
    }
}