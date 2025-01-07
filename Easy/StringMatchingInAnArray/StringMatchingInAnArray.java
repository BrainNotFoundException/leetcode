import java.util.ArrayList;
import java.util.List;

class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> out = new ArrayList<>();

        for(int i=0; i<words.length; i++){

            for (int j=0; j<words.length; j++){
                Boolean found = false;

                if(i!=j){
                    if(words[i].length() <= words[j].length()){
                        for(int k=0; k<words[j].length()-words[i].length()+1; k++){
                            String comp = words[j].substring(k, words[i].length()+k);
                            if(comp.equals(words[i])){
                                out.add(words[i]);
                                found = true;
                                break;
                            }
                        }
                    }
                }
                
                if(found){
                    break;
                }
            }

        }
        return out;
    }
}