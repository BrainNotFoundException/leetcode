class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        
        if (s.length() < k){
            return false;
        }
        if (s.length() == k){
            return true;
        }

        int occ[] = new int[26];
        for(int i=0; i<s.length(); i++){
            occ[s.charAt(i)-'a'] += 1;
        }

        int odd = 0;

        for(int val : occ){
            if(val%2!=0){
                odd++;
            }
        }

        return odd <= k;

    }
}