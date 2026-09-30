public class NintendoController implements Controller {

    @Override
    public void connect() {
        System.out.println("Nintendo controller connected.");
    }

    @Override
    public String readInput() {
        return "Nintendo controller input";
    }

    @Override
    public String getFamily() {
        return "Nintendo";
    }
}