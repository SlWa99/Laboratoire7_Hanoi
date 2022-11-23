package util;

public class ElementIterator {
    // region ctor
    public ElementIterator(ElementStack it){
        this.it = it;
    }
    // endregion

    // region Paramètre
    private ElementStack it;
    // endregion

    // region Méthode
    public ElementStack next(){
        if(hasNext()){
            it = it.getNext();
            return it;
        }
        return null;
    }

    public boolean hasNext(){
        return it.getNext() != null;
    }
    // endregion
}
