class MinimumNumberOfChangesToMakeBinaryStringBeautiful{
    public int minChanges(String s) {
        
        int len_s = s.length();

        if (len_s%2!=0){

            return 0;

        }

        int num = 0;

        for (int i = 0; i<len_s; i= i+2){

            String sub1 = s.substring(i,i+2);
            if (! sub1.substring(0,1).equals(sub1.substring(1))){
                num += 1;
            }

        }

        return num;


    }
}