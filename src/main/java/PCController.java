public class PCController implements Controller {

    @Override
    public void connect() {
        System.out.println("PC controller connected.");
    }

    @Override
    public String readInput() {
        return "PC keyboard/mouse input";
    }
}