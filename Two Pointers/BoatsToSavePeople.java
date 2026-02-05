import java.util.*;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0, r = people.length-1, count = 0;
        Arrays.sort(people);
        while(l <= r){
            if(people[l]+people[r] <= limit){
                l++;
            }
            r--;
            count++;
        }
        return count;
    }
}
