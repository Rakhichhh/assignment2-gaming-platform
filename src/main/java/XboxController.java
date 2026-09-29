public class XboxController implements Controller {

    @Override
    public void connect() {
        System.out.println("Xbox controller connected.");
    }

    @Override
    public String readInput() {
        return "Xbox controller input";
    }
}