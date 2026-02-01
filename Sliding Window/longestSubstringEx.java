class longestSubstringEx {
    public int longestSubstring(String s, int k) {
        if(k > s.length()) return 0;
        int result = 0, n = s.length();
        for(int targetUnique = 1; targetUnique <= 26; targetUnique++){
            int freq[] = new int[26];
            int l = 0, r = 0;
            int uniqueCount = 0, countAtLeastK = 0;
            while(r < n){
                int idx = s.charAt(r) - 'a';
                if(freq[idx] == 0){
                    uniqueCount++;
                }
                freq[idx]++;
                if(freq[idx] == k){
                    countAtLeastK++;
                }
                r++;
                while(uniqueCount > targetUnique){
                    int leftIdx = s.charAt(l) - 'a';
                    if(freq[leftIdx] == k){
                        countAtLeastK--;
                    }
                    freq[leftIdx]--;
                    if(freq[leftIdx] == 0){
                        uniqueCount--;
                    }
                l++;
                }
                if(uniqueCount == targetUnique && uniqueCount == countAtLeastK){
                    result = Math.max(result, r - l);
                }
            }
        }
        return result;
    }
}