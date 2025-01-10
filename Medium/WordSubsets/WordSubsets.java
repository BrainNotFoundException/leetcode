import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        List<String> out = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();

        for(String word : words2){
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (int i=0; i<word.length(); i++){
                Character ch = word.charAt(i);
                if(map2.containsKey(ch)){
                    map2.put(ch, map2.get(ch)+1);
                }else{
                    map2.put(ch, 1);
                }
            }

            for(Character car : map2.keySet()){
                if(map.containsKey(car)){
                    map.put(car, map2.get(car)>map.get(car)?map2.get(car):map.get(car));
                }else{
                    map.put(car, map2.get(car));
                }
            }
        }
        
        for (String word : words1){
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(int i=0; i<word.length(); i++){
                
                Character ch = word.charAt(i);
                if(map2.containsKey(ch)){
                    map2.put(ch, map2.get(ch)+1);
                }else{
                    map2.put(ch, 1);
                }
            }
            
            boolean found = true;
            for(Character car : map.keySet()){
                if(!map2.containsKey(car)){
                    found = false;
                    break;
                }else{
                    if(map2.get(car)<map.get(car)){
                        found = false;
                        break;
                    }
                }
            }

            if(found){
                out.add(word);
            }
        }

        return out;

    }
}