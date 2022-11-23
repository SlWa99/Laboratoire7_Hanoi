package util;

public class Stack<T> {
    // region ctor
    public Stack(T... values){
        for(T val : values){
            push(val);
        }
    }
    // endregion

    // region param
    private ElementStack<T> head;
    // endregion

    // region method
    public void push(T value){
        if(head == null){
            head = new ElementStack<>(value);
        } else {
            head = new ElementStack<>(value,head);
        }
    }

    public T pop(){
        ElementIterator it = new ElementIterator(head);
        T value = head.getValue();
        head = it.next();
        return value;
    }

    public T top(){
        if(head == null) throw new RuntimeException("Stack vide");
        return head.getValue();
    }

    public String toString(){
        String rt = "[ ";
        ElementIterator it = new ElementIterator(head);

        if(head != null){
            rt += "<" + head + "> ";
            while(it.hasNext()){
                rt += "<" + it.next().getValue() + "> ";
            }
        }
        return rt + "]\n";
    }

    public Object[] toArray(){
        Object out[] = new Object[0];
        int pos=0;
        if(head != null){
            ElementIterator it = new ElementIterator(head);
            pos++;
            while(it.hasNext()){
                it.next();
                pos++;
            }
            it = new ElementIterator(head);
            out = new Object[pos];
            pos = 0;
            out[pos++] = head.getValue();
            while(it.hasNext()){
                out[pos++] = it.next().getValue();
            }
        }
        return out;
    }
    // endregion
}
