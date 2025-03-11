class VowelsOfAllSubstrings {
    public long countVowels(String word) {
        int n=word.length();
        long c=0;
        for(int i=0; i<n; i++){
            char ch = word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c+=(long)(i+1)*(n-i);
            }
        }
        return c;
    }
}