import java.util.ArrayList;

class CheckIfAParenthesesStringCanBeValid {
    public boolean canBeValid(String s, String locked) {
        
        if(s.length()%2==1)
            return false;

        ArrayList<Integer> openStack = new ArrayList<>();
        ArrayList<Integer> unlocked = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if(locked.charAt(i)=='0'){
                unlocked.add(i);
            }else{
                if(s.charAt(i)=='('){
                    openStack.add(i);
                }else{
                    if(!openStack.isEmpty()){
                        openStack.removeLast();
                    }else if(!unlocked.isEmpty()){
                        unlocked.removeLast();
                    }else{
                        return false;
                    }
                }
            }
        }

        while(!openStack.isEmpty() && !unlocked.isEmpty()){
            if(openStack.getLast()<unlocked.getLast()){
                openStack.removeLast();
                unlocked.removeLast();
            }else{
                return false;
            }
        }

        return openStack.isEmpty();

    }
}