import View.ConsoleView;
import View.View;

public class FinalProject {
    public static void main(String[] args) {
        Programm.Presenter<View> prog = new Programm.Presenter<View>(new ConsoleView());
        prog.start();
    }
}