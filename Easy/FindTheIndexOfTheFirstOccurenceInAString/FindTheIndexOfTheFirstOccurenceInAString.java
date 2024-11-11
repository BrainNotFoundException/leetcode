class Solution {
    public int strStr(String haystack, String needle) {
        
        int haylen = haystack.length();
        int nedlen = needle.length();
        if (nedlen > haylen){

            return -1;

        }

        for (int i=0; i<haylen-nedlen+1; i++){

            if (haystack.charAt(i) == needle.charAt(0)){
                
                int c=1;

                for (int j=i+1; j<i+nedlen; j++){

                    if (needle.charAt(c) != haystack.charAt(j)){
                        c = -1;
                        break;
                    }
                    c+=1;

                }

                if (c!=-1){
                    return i;
                }

            }
        
        }

        return -1;

    }
}