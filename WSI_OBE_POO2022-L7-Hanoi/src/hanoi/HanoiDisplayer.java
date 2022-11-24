/**
 *  -----------------------------------------------------------------------------------
 * @Fichier      : HanoiDisplayer.java
 * @Labo         : Laboratoire 7 : Tours de Hanoï
 * @Auteurs      : Slimani Walid & Baume Oscar
 * @Date         : 09.11.2022
 *
 * @Description  : Ce fichier définit la classe HanoiDisplayer qui s'occupe d'afficher
 *                 l'état de la tour de Hanoï lors de la résolution de cette dernière.
 * @Remarque     : / Aucune remarque
 * @Modification : / Aucune modification
 *  -----------------------------------------------------------------------------------
 **/

package hanoi;

public class HanoiDisplayer {
    // region Méthode

    /**
     * Nom         : display
     * Description : Affiche l'état actuel de la tour de Hanoi
     * @param h    : La tour de Hanoï à afficher
     * @return     : void
     **/
    public void display(Hanoi h) {
        System.out.println(h);
    }
    // endregion
}
