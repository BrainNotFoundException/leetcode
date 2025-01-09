class CountingWordsWithAGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        
        int count = 0;

        for(String word : words){
            if (word.length() < pref.length()){
                continue;
            }
            if (word.startsWith(pref)){
                count ++;
            }
        }
        
        return count;
        
    }
}