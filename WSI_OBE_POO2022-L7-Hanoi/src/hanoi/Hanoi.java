package hanoi;
import util.Stack;

public class Hanoi {
    // region ctor
    public Hanoi(int nbRing){
        this.nbRing = nbRing;

        for(Stack s : stacks){
            s = new Stack();
        }

        for(int val = nbRing; val > 0; val--){
            stacks[0].push(val);
        }
    }
    // endregion
    // region param
    final int nbStack = 3;
    Stack stacks[] = new Stack[nbStack];
    private int nbRing;
    // endregion
    // region methods

    // endregion


}
