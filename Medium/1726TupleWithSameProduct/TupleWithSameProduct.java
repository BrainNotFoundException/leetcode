import java.util.HashMap;

class TupleWithSameProduct {
    public int tupleSameProduct(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int prod = nums[i] * nums[j];
                if(map.containsKey(prod)){
                    map.put(prod, map.get(prod)+1);
                }else{
                    map.put(prod, 1);
                }
            }
        }

        int num=0;
        System.out.println(map);
        for(int value : map.values()){
            num+=((value-1)*value)*4;
        }

        return num;
    }
}