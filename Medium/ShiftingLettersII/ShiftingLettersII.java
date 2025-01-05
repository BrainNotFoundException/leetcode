class ShiftingLettersII {
    public String shiftingLetters(String s, int[][] shifts) {

        String rets = "";
        int[] shiftingArray = new int[s.length()];

        for(int[] sh : shifts){

            int shift = sh[2] == 1 ? 1 : -1;
            shiftingArray[sh[0]] += shift;
            if (sh[1]+1 < s.length()){
                shiftingArray[sh[1] + 1] -= shift;
            }

        }

        int shift = 0;

        for (int i=0; i<s.length(); i++){

            shift = (shift+shiftingArray[i])%26;
            if (shift<0){
                shift+=26;
            }
            char ch = (char) ('a' + (char)((int)s.charAt(i) - (int)'a' + shift)%26);
            rets = rets + ch;

        }

        return rets;
        
    }
}