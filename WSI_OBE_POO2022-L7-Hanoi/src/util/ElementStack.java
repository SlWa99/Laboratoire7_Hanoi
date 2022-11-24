/**
 *  -----------------------------------------------------------------------------------
 * @Fichier      : ElementStack.java
 * @Labo         : Laboratoire 7 : Tours de Hanoï
 * @Auteurs      : Slimani Walid & Baume Oscar
 * @Date         : 09.11.2022
 *
 * @Description  : Ce fichier définit la classe ElementStack. Cette classe permet de
 *                 modéliser les éléments contenus dans la Stack
 * @Remarque     : / Aucune remarque
 * @Modification : / Aucune modification
 *  -----------------------------------------------------------------------------------
 **/

package util;

public class ElementStack<T> {
    // region ctor

    /**
     * Nom          : ElementStack
     * Description  : Permet de construire un element d'une stack
     * @param value : Valeur de l'élément de type <T>
     * @param next  : Element suivant d'un élément de la pile
     * @return      : L'objet ElementStack construit par le constructeur
     **/
    public ElementStack(T value, ElementStack<T> next) {
        this(value);
        this.next = next;
    }

    /**
     * Nom          : ElementStack
     * Description  : Permet de construire un element d'une stack qui ne possède pas d'élément suivant
     * @param value : Valeur de l'élément de type <T>
     * @return      : L'objet ElementStack construit par le constructeur
     **/
    public ElementStack(T value) {
        next = null;
        this.value = value;
    }
    // endregion

    // region paramètre
    private T value;    // Valeur de l'élément
    private ElementStack<T> next;   // Elément suivant de la Stack
    // endregion

    // region methodes

    /**
     * Nom         : getNext
     * Description : Retourne l'élement suivant qui est dans la Stack
     * @return     : L'élément suivant en question
     **/
    public ElementStack<T> getNext() {
        return next;
    }

    /**
     * Nom         : getValue
     * Description : Retourne la valeur de l'élément courant
     * @return     : La valeur de type <T> de l'élément courant
     **/
    public T getValue() {
        return value;
    }

    /**
     * Nom         : toString
     * Description : Retourne la valeur de l'élément courant
     * @return     : String représentant la valeur de l'élément courant
     **/
    public String toString() {
        return (String) value;
    }
    // endregion
}
