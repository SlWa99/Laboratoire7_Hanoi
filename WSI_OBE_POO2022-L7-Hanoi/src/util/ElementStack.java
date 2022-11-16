package util;

public class ElementStack {
    // region ctor
    public ElementStack(int value,ElementStack next){
        this.next = next;
        this.value = value;
    }

    public ElementStack(int value){
        next = null;
        this.value = value;
    }
    // endregion
    // region param
    private int value;
    private ElementStack next;
    // endregion
    // region methods

    public ElementStack getNext(){
        return next;
    }
    public int getValue(){
        return value;
    }

    public String toString(){
        return ""+value;
    }
    // endregion
}
