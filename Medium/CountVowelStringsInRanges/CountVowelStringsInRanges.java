import java.util.Arrays;
import java.util.HashSet;

class CountVowelStringsInRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int[] arr = new int[queries.length];

        HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u')
        );

        int indexSum[] = new int[words.length];
        int sum=0;
        for(int i=0; i<words.length; i++){
            String word = words[i];

            if(vowels.contains(word.charAt(0)) && vowels.contains(word.charAt(word.length()-1))){
                sum++;
            }

            indexSum[i] = sum;
        
        }

        for(int i=0; i<queries.length; i++){
            
            int[] query = queries[i];
            if(query[0]==0){
                arr[i] = indexSum[query[1]];
            }else{
                arr[i] = indexSum[query[1]] - indexSum[query[0]-1];
            }
        
        }

        return arr;
    }
}