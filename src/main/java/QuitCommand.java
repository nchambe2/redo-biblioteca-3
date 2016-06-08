public class QuitCommand implements Command {
    @Override
    public void run() {
        System.exit(0);
    }

    @Override
    public String name() {
        return "Quit";
    }
}
