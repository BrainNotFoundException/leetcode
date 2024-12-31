class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        for(int i=s.length()-1; i>-1; i--){
            if (s.charAt(i) == ' '){
                return length;
            }
            else{
                length+=1;
            }
        }

        return length;
    }
}