import java.util.Set;
import java.util.TreeSet;

public class ThreeDigitEvenNumbers {
    Set<Integer>set = new TreeSet<>();
    public int[] findEvenNumbers(int[] digits) {
        boolean used[] = new boolean[digits.length];
        backtrack(digits,used,0,0);
        int idx = 0;
        int res[] = new int[set.size()];
        for(int num : set){
            res[idx++] = num;
        }
        return res;
    }
    private void backtrack(int digits[], boolean used[], int pos, int num){
        if(pos == 3){
            if(num % 2 == 0 && num >= 100){
                set.add(num);
            }
            return;
        }
        for(int i = 0; i < digits.length; i++){
            if(used[i]){
                continue;
            }
            if(pos == 0 && digits[i] == 0){
                continue;
            }
            if(pos ==2 && digits[i] % 2 != 0){
                continue;
            }
            used[i] = true;
            backtrack(digits,used,pos+1,num*10+digits[i]);
            used[i] = false;
        }
    }
}