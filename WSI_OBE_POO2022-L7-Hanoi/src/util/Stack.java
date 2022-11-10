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
        int value = head.getValue();
        head = head.next();
        return value;
    }

    public int top(){
        if(head == null) throw new RuntimeException("Stack vide");
        return head.getValue();
    }

    public String toString(){
        String rt = "[ ";
        ElementStack tmp = head;
        if(head != null){
            rt += "<" + tmp + "> ";
            while(tmp.hasNext()){
                tmp = tmp.next();
                rt += "<" + tmp + "> ";
            }
        }
        return rt + "]\n";
    }
    public int[] toArray(){
        int out[] = null;
        int pos=0;
        if(head != null){
            ElementStack tmp = head;
            pos++;
            while(tmp.hasNext()){
                tmp = tmp.next();
                pos++;
            }
            tmp = head;
            out = new int[pos];
            pos = 0;
            out[pos++] = tmp.getValue();
            while(tmp.hasNext()){
                tmp = tmp.next();
                out[pos++] = tmp.getValue();
            }
        }
        return out;
    }
    // endregion
}
