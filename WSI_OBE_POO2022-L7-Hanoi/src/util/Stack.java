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
        return head.getValue();
    }

    public String toString(){
        String rt = "[ ";
        ElementStack tmp = head;
        if(tmp != null){
            rt += "<" + tmp + "> ";
            while(tmp.hasNext()){
                tmp = tmp.next();
                rt += "<" + tmp + "> ";
            }
        } else throw new RuntimeException("Stack vide");
        return rt + "]";
    }
    // endregion
}
