/**
 *  -----------------------------------------------------------------------------------
 * @Fichier      : ElementIterator.java
 * @Labo         : Laboratoire 7 : Tours de Hanoï
 * @Auteurs      : Slimani Walid & Baume Oscar
 * @Date         : 09.11.2022
 *
 * @Description  : Ce fichier définit la classe ElementIterator. Cette classe permet de
 *                 parcourir la stack.
 * @Remarque     : / Aucune remarque
 * @Modification : / Aucune modification
 *  -----------------------------------------------------------------------------------
 **/

package util;

public class ElementIterator {
    // region ctor

    /**
     * Nom         : ElementIterator
     * Description : Permet de construire un itérateur permettant d'itérer sur une Stack contenant des
     *               StackElement. A la construction, l'itérateur pointe sur le StackElement qui est
     *               passé en paramètre du constructeur
     * @param it  : ElementStack sur lequel pointe l'itérateur
     * @return    : L'objet ElementIterator construit par le constructeur
     **/
    public ElementIterator(ElementStack it) {
        this.it = it;
    }
    // endregion

    // region Paramètre
    private ElementStack it;    // Element de la stack pointé par l'itérateur
    // endregion

    // region Méthode

    /**
     * Nom         : next
     * Description : Retourne l'élement suivant qui est dans la Stack
     * @return     : L'élément suivant en question
     **/
    public ElementStack next() {
        if (hasNext()) {
            it = it.getNext();
            return it;
        }
        return null;

    }

    /**
     * Nom         : hasNext
     * Description : Indique si l'élément courrant est suivi d'un autre élément
     * @return     : Vrai si l'élément courrant est suivi par un autre élément
     **/
    public boolean hasNext() {
        if(it == null) throw new RuntimeException("L'iterateur est null");
        return it.getNext() != null;
    }

    /**
     * Nom         : toString
     * Description : Indique la valeur de l'élément sur lequel pointe l'itérateur
     * Remarque    : /!\ cette fonction a été implémenté UNIQUEMENT pour pouvoir tester le bon fonctionnement
     *      *        de la classe Stack (voir le test "Test des itérateurs" dans la classe "TestStack") /!\
     * @return     : String contenant la valeur de l'ElementStack sur lequel pointe l'itérateur
     **/
    public String toString() {
        return (String) it.getValue();
    }
    // endregion
}
