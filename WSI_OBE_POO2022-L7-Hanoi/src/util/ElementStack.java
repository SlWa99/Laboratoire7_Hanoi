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
<<<<<<< HEAD
    public T getValue(){
=======
    public int getValue(){
>>>>>>> a958fe035a25099b95c33fe8f4289070e50a7485
        return value;
    }

    public String toString(){
        return (String) value;
    }
    // endregion
}
