class ClearDigits {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                if(!str.isEmpty()){
                    str.deleteCharAt(str.length()-1);
                }
            }else{
                str.append(s.charAt(i));
            }
            i++;
        }
        return str.toString();
    }
}