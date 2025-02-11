class RemoveAllOccurencesOfASubstring {
    public String removeOccurrences(String s, String part) {
        if(part.length()>s.length()){
            return s;
        }

        StringBuilder str = new StringBuilder();
        int i=0, j=0;
        while(j<s.length()){
            str.append(s.charAt(j));
            i++;
            if(str.length()<part.length()){
                j++;
                continue;
            }
            if(str.substring(i-part.length()).equals(part)){
                str.delete(i-part.length(), i);
                i=str.length();
            }
            j++;
        }

        return str.toString();

    }
}