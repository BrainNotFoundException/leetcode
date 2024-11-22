import java.util.ArrayList;

class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {

        if (k == 0){

            for (int i = 0; i<code.length; i++){
                code[i] = 0;
            }
            return code;
        
        }

        ArrayList<Integer> arr = new ArrayList<>();

        if (k<0){
            
            for (int i=0; i<code.length; i++){

                int s=0;
                for (int j=1; j<Math.abs(k)+1; j++){
                    if (i-j<0){
                        s+=code[code.length + i-j];
                    } else {
                        s+=code[i-j];
                    }
                }

                arr.add(s);

            }

        }

        for (int i=0; i<code.length; i++){
            int s=0;
            for (int j=1; j<k+1; j++){
                if (i+j<code.length){
                    s+=code[i+j];
                }else{
                    s+=code[i+j-code.length];
                }
            }
            arr.add(s);
        }

        for (int i=0; i<code.length; i++){
            code[i] = arr.get(i);
        }

        return code;

    }
}