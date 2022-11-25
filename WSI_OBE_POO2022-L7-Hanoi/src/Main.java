/**
 *  -----------------------------------------------------------------------------------
 * @Fichier      : Main.java
 * @Labo         : Laboratoire 7 : Tours de Hanoï
 * @Auteurs      : Slimani Walid & Baume Oscar
 * @Date         : 09.11.2022
 *
 * @Description  : Le but de ce programme est de résoudre le problème des tours de Hanoï.
 *                 De plus, afin de visualiser la résolution du casse-tête une interface
 *                 graphique est présente.
 * @Remarque     : Le nombre de minimum de coup nécessaire pour résoudre le casse-tête est
 *                 (2^nombre de disque) - 1 (Exemple : pour 3 disques il faut (2^3) - 1 = 7).
 * @Modification : / Aucune modification
 *  -----------------------------------------------------------------------------------
**/

import hanoi.*;
import hanoi.gui.JHanoi;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            new JHanoi();
        }

        if (args.length == 1) {
            int nbrDisk = 0;

            try {
                nbrDisk = Integer.parseInt(args[0]);
            }

            catch (Exception e) {
                throw new RuntimeException("Entré non valable");
            }

            if (nbrDisk <= 0) {
                throw new RuntimeException("Le nombre de disques doit être supérieur à 0");
            }

            Hanoi h = new Hanoi(nbrDisk);
            h.solve();
        }
    }
}