import java.util.Set;
import java.util.TreeSet;

public class ThreeDigitsEvenNumbersLength {
    Set<Integer>set = new TreeSet<>();
    public int totalNumbers(int[] digits) {
        boolean used[] = new boolean[digits.length];
        backtrack(digits,used,0,0);
        return set.size();
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
