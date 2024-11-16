class Solution {
    public String compressedString(String word) {
        
        String comp = "";

        Character prevch=word.charAt(0);
        int i=0;
        int c_count = 0;
        while(i<word.length()){

            while (i<word.length() && word.charAt(i) == prevch && c_count<9){
                c_count+=1;
                i+=1;
            }
            comp = comp + Integer.toString(c_count) + prevch;
            c_count = 0;
            if (i<word.length()){
                prevch = word.charAt(i);
            }

        }

        return comp;

    }
}