package hanoi;
import util.Stack;

public class Hanoi {
    public static void Main(String args[]){
        Hanoi h = new Hanoi(Integer.parseInt(args[1]));
        h.solve();
    }
    // region ctor
    public Hanoi(int nbRing){
        this.nbRing = nbRing;

        for(int i = 0; i < nbStack; ++i){
            stacks[i] = new Stack();
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
    private int turn;
    // endregion
    // region methods
    public void solve(){
        System.out.println(this);
        solve(nbRing,stacks[0],stacks[2],stacks[1]);
    }
    private void solve(int n, Stack from, Stack to, Stack other){
        if(n == 1){
            move(from,to);
            turn++;
            System.out.println(this);
            return;
        }
        solve(n-1,from,other,to);
        move(from,to);
        turn++;
        System.out.println(this);
        solve(n-1,other,to,from);
    }
    public void move(Stack from, Stack to){
        try{
            if(from.top() >= to.top()) throw new RuntimeException("Disque trop grand pour etre deplacer");
        } catch (RuntimeException e){

        }
        int val = from.pop();
        to.push(val);
    }
    public int[][] status(){
       int[][] out = new int[3][];
       for(int i = 0; i < nbStack; ++i){
           out[i] = stacks[i].toArray();
       }
       return out;
    }
    public boolean finished(){
        int[][] test = status();
        return test[nbStack-1].length == nbRing;
    }
    public int turn(){
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
