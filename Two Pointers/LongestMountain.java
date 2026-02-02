public class LongestMountain {
    public int longestMountain(int[] arr) {
        if(arr.length < 3) return 0;
        int l, r, length = 0;
        int n= arr.length;
        for(int i = 1; i < n-1; i++){
            if((arr[i-1] < arr[i]) && (arr[i] > arr[i+1])){
                l = i;
                while(l > 0 && arr[l-1] < arr[l]){
                    l--;
                }
                r = i;
                while(r < n-1 && arr[r] > arr[r+1]){
                    r++;
                }
                length = Math.max(length, r - l + 1);
                i = r;
            }
        }
        return length;
    }
}
