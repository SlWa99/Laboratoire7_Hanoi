import hanoi.*;
public class Main {
    public static void main(String[] args) {
        Hanoi h = new Hanoi(3);
        h.solve();
        System.out.println(h.finished());
    }
}