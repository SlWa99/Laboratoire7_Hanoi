/**
 *  -----------------------------------------------------------------------------------
 * @Fichier      : TestHanoi.java
 * @Labo         : Laboratoire 7 : Tours de Hanoï
 * @Auteurs      : Slimani Walid & Baume Oscar
 * @Date         : 25.11.2022
 *
 * @Description  : Le but de ce programme est d'effectuer divers tests afin de contrôler
 *                 l'efficacité de notre classe Hanoï.
 * @Remarque     : Le nombre de minimum de coup nécessaire pour résoudre le casse-tête est
 *                 (2^nombre de disque) - 1 (Exemple : pour 3 disques il faut (2^3) - 1 = 7).
 * @Modification : / Aucune modification
 *  -----------------------------------------------------------------------------------
 **/

package test;
import hanoi.*;

public class TestHanoi {
    public static void main(String[] args) {
        // region Test de construction
        System.out.println("Construction(nbring) sans erreur : \n");
        Hanoi h1 = new Hanoi(3);

        System.out.println("Construction(nbring, displayer) sans erreur :\n");
        Hanoi h2 = new Hanoi(3, new HanoiDisplayer());

        try {
            System.out.println("Construction(nbring) avec erreur :");
            Hanoi h3 = new Hanoi(0);
        } catch (Exception e) {
            System.out.println(e + "\n");
        }

        try {
            System.out.println("Construction(nbring) avec erreur :");
            Hanoi h4 = new Hanoi(-3);
        } catch (Exception e) {
            System.out.println(e + "\n");
        }

        try {
            System.out.println("Construction(nbring, displayer) avec erreur :");
            Hanoi h5 = new Hanoi(3, null);
        } catch (Exception e) {
            System.out.println(e + "\n");
        }
        // endregion

        // region Test du nombre de déplacements de disques et du booléen finished
        Hanoi h = new Hanoi(3, new HanoiDisplayer());
        System.out.println("finished = " + h.finished());
        System.out.println("nbr de coups avant résolution = " + h.turn());
        try {
            h.solve();
        }
        catch (Exception e) {
            System.out.println(e + "\n");
        }
        System.out.println("finished = " + h.finished());
        System.out.println("nbr de coups après résolution = " + h.turn());
        System.out.println("Pour info, le nombre minimum de déplacement est 2^nDisk - 1 = 2^3 - 1 = 8 - 1 = 7");
        // endregion
    }
}
