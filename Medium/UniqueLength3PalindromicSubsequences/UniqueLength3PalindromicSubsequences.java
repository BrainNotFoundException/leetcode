import java.util.HashSet;

class UniqueLength3PalindromicSubsequences {
    public int countPalindromicSubsequence(String s) {
        
        int count=0;

        HashSet<Character> chars = new HashSet<>();
        
        for(int i=0; i<s.length(); i++){
            chars.add(s.charAt(i));
        }

        for(Character c : chars){
            
            int first = -1;
            int last = 0;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == c){
                    if(first==-1){
                        first=i;
                    }
                    last=i;
                }
            }

            HashSet<Character> elements = new HashSet<>();
            for(int i=first+1; i<last; i++){
                elements.add(s.charAt(i));
            }

            count+=elements.size();
        }

        return count;
        
    }
}