class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;

        while (xor != 0) {
            //xor = xor & (xor - 1);
            int x = xor & 1;
            if(x==1){
                count++;
            }
            xor=xor>>>1;
            
        }

        return count;
    }
}