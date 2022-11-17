import hanoi.*;
import hanoi.gui.JHanoi;

public class Main {
    public static void main(String[] args) {

        HanoiDisplayer hanoiDisplayer = new HanoiDisplayer();
        Hanoi h = new Hanoi(10,hanoiDisplayer);
        new JHanoi();
    }
}