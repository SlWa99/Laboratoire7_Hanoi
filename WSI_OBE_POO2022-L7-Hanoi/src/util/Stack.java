package util;

public class Stack {
    // region ctor
    public Stack(int... values){
        for(int val : values){
            push(val);
        }
    }
    // endregion

    // region param
    private ElementStack head;
    // endregion

    // region method
    public void push(int value){
        if(head == null){
            head = new ElementStack(value);
        } else {
            head = new ElementStack(value,head);
        }
    }

    public int pop(){
        ElementIterator it = new ElementIterator(head);
        int value = head.getValue();
        head = it.next();
        return value;
    }

    public int top(){
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
    public int[] toArray(){
        int out[] = null;
        int pos=0;
        if(head != null){
            ElementIterator it = new ElementIterator(head);
            pos++;
            while(it.hasNext()){
                it.next();
                pos++;
            }
            it = new ElementIterator(head);
            out = new int[pos];
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
