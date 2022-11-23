package hanoi;
import util.Stack;

public class Hanoi {
    public static void Main(String args[]){
        Hanoi h = new Hanoi(Integer.parseInt(args[1]));
        h.solve();
    }
    // region ctor
<<<<<<< HEAD
    public Hanoi(int nbRing, HanoiDisplayer hanoiDisplayer){
=======

    public Hanoi(int nbRing,HanoiDisplayer hanoiDisplayer){
>>>>>>> a958fe035a25099b95c33fe8f4289070e50a7485
        this.nbRing = nbRing;
        this.hanoiDisplayer = hanoiDisplayer;

        for(int i = 0; i < nbStack; ++i){
<<<<<<< HEAD
            stacks[i] = new Stack<>();
=======
            stacks[i] = new Stack();
>>>>>>> a958fe035a25099b95c33fe8f4289070e50a7485
        }

        for(int val = nbRing; val > 0; val--){
            stacks[0].push(val);
        }
    }
<<<<<<< HEAD

=======
>>>>>>> a958fe035a25099b95c33fe8f4289070e50a7485
    public Hanoi(int nbRing){
        this.nbRing = nbRing;

        for(int i = 0; i < nbStack; ++i){
            stacks[i] = new Stack<>();
        }

        for(int val = nbRing; val > 0; val--){
            stacks[0].push(val);
        }
    }
    // endregion

    // region param
<<<<<<< HEAD
    private final int nbStack = 3;
    private Stack<Integer>[] stacks = new Stack[nbStack];
=======
    final int nbStack = 3;
    Stack stacks[] = new Stack[nbStack];
>>>>>>> a958fe035a25099b95c33fe8f4289070e50a7485
    private HanoiDisplayer hanoiDisplayer;
    private int nbRing;
    private int turn;
    // endregion

    // region methods
    public void solve(){
        if(hanoiDisplayer != null){hanoiDisplayer.display(this);}
        else{System.out.println(this);}
        solve(nbRing,stacks[0],stacks[2],stacks[1]);
    }
    private void solve(int n, Stack from, Stack to, Stack other){
        if(n == 1){
            move(from,to);
            turn++;
            if(hanoiDisplayer != null){hanoiDisplayer.display(this);}
            else{System.out.println(this);}
            return;
        }
        solve(n-1,from,other,to);
        move(from,to);
        turn++;
        if(hanoiDisplayer != null){hanoiDisplayer.display(this);}
        else{System.out.println(this);}
        solve(n-1,other,to,from);
    }
    private void move(Stack<Integer> from, Stack<Integer> to){
        try{
<<<<<<< HEAD
            if(from.top() >= to.top())
                throw new RuntimeException("Disque trop grand pour etre deplacer");
        }
        catch (RuntimeException e){
=======
            if(from.top() >= to.top()) throw new RuntimeException("Disque trop grand pour etre deplacer");
        } catch (RuntimeException e){

>>>>>>> a958fe035a25099b95c33fe8f4289070e50a7485
        }
        int val = from.pop();
        to.push(val);
    }
    private int[] status(){
       int[] out = new int[3];
       for(int i = 0; i < nbStack; ++i){
           out[i] = (Integer[]) stacks[i].toArray();
       }
       return out;
    }
    private boolean finished(){
        int[][] test = status();
        return test[nbStack-1].length == nbRing;
    }
    private int turn(){
        return turn;
    }
    public String toString(){
        final String name[] = new String[]{"One","Two","Three"};
        String out = "-- Turn : " + turn +"\n";
        for(int i = 0; i < nbStack; i++){
            out += String.format("%-6s %s",name[i]+":",stacks[i]);
        }
        return out;
    }
    // endregion
}
