class MinimizeXOR {
    public int minimizeXor(int num1, int num2) {
        int bitCount1 = Integer.bitCount(num1);
        int bitCount2 = Integer.bitCount(num2);
        if(bitCount1==bitCount2){
            return num1;
        }

        int num = num1;
        int bit=0;

        while(Integer.bitCount(num) < bitCount2){
            num = num | (1<<bit);
            bit++;
        }

        while(Integer.bitCount(num) > bitCount2){
            num = num & ~(1<<bit);
            bit++;
        }

        return num;
    }
}