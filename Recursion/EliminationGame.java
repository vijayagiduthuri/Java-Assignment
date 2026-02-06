public class EliminationGame {
    public int lastRemaining(int n) {
        return solve(n, true);
    }
    private static int solve(int n, boolean left){
        if(n == 1) return 1;
        if(left){
            return 2 * solve(n/2,false);
        }else{
            if(n % 2 == 0){
                return 2 * solve(n/2,true)-1;
            }else{
                return 2 * solve(n/2, true);
            }
        }
    }
}
