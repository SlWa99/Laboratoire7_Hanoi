package util;

public class ElementIterator {
    public ElementIterator(ElementStack it){
        this.it = it;
    }
    private ElementStack it;

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


}
