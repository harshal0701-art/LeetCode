class Solution {

    static final int M = 1_000_000_007;

    public int numSub(String s) {

        long ans = 0;
        long  count = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                count++;

                ans = (ans + count) % M;
            }
            else {
                count = 0;
            }
        }    

        return (int) ans;
    }
}