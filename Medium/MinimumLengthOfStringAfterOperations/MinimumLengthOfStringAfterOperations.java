class MinimumLengthOfStringAfterOperations {
    public int minimumLength(String s) {
        int charCount[] = new int[26];
        for(int i=0; i<s.length(); i++){
            charCount[s.charAt(i)-'a'] += 1;
        }

        int c=0;
        for(int i=0; i<26; i++){
            if(charCount[i]!=0){
                if(charCount[i]%2==0){
                    c+=2;
                }else{
                    c+=1;
                }
            }
        }

        return c;
    }
}