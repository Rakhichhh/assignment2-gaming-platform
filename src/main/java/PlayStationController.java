public class PlayStationController implements Controller {

    @Override
    public void connect() {
        System.out.println("PlayStation DualSense connected.");
    }

    @Override
    public String readInput() {
        return "PlayStation controller input";
    }
}