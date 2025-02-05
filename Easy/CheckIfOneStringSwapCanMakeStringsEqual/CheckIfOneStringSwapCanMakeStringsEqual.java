class CheckIfOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.length() != s2.length()){
            return false;
        }
        int c=0;
        int first=0, second=0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(c>2){
                    return false;
                }
                if(c==1){
                    first=i;
                }else if(c==2){
                    second=i;
                }
            }
        }
        if(c==0){
            return true;
        }
        if(c==1){
            return false;
        }
        return s1.charAt(first)==s2.charAt(second) && s1.charAt(second)==s2.charAt(first);
    }
}