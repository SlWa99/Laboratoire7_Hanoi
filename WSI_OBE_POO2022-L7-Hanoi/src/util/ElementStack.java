package util;

public class ElementStack<T> {
    // region ctor
    public ElementStack(T value,ElementStack next){
        this.next = next;
        this.value = value;
    }

    public ElementStack(T value){
        next = null;
        this.value = value;
    }
    // endregion

    // region param
    private T value;
    private ElementStack next;
    // endregion

    // region methods

    public ElementStack getNext(){
        return next;
    }

    public T getValue(){
        return value;
    }

    public String toString(){
        return (String) value;
    }
    // endregion
}
