package util;

public class ElementIterator {
<<<<<<< HEAD
    // region ctor
    public ElementIterator(ElementStack it){
        this.it = it;
    }
    // endregion

    // region Paramètre
    private ElementStack it;
    // endregion

    // region Méthode
=======
    public ElementIterator(ElementStack it){
        this.it = it;
    }
    private ElementStack it;

>>>>>>> a958fe035a25099b95c33fe8f4289070e50a7485
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
<<<<<<< HEAD
    // endregion
=======


>>>>>>> a958fe035a25099b95c33fe8f4289070e50a7485
}
