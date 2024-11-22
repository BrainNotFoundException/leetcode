import java.util.HashMap;

class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<s1.length(); i++){
            
            Character ch = s1.charAt(i);
            
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }

        }

        HashMap<Character, Integer> map_copy = new HashMap<>();
        map_copy.putAll(map);
        boolean found = false;

        for (int i=0; i<s2.length(); i++){

            String s;
            if (i+s1.length()<=s2.length()){
                s = s2.substring(i, i+s1.length());
            }else{
                break;
            }

            for (int j=0; j<s1.length(); j++){

                Character ch = s.charAt(j);
                if (map_copy.containsKey(ch)){
                    
                    int val = map_copy.get(ch)-1;
                    if (val==0){
                        map_copy.remove(ch);
                    }else{
                        map_copy.put(ch, val);
                    }

                }else{

                    break;

                }

            }

            if (map_copy.isEmpty()){
                found = true;
                break;
            }else{
                map_copy = new HashMap<>();
                map_copy.putAll(map);
            }

        }

        return found;

    }
}