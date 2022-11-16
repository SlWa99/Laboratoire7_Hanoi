import hanoi.*;
public class Main {
    public static void main(String[] args) {
        Hanoi h = new Hanoi(5);
        h.solve();
        System.out.println(h.finished());
    }
}