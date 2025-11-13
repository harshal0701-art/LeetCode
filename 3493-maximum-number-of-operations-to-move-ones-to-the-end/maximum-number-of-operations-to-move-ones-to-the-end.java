class Solution {
    public int maxOperations(String s) {
        
        int ans = 0; 
        int o = 0;
        int n = s.length();

        for(int i = 0; i < n; ++i) {
            o += s.charAt(i) - '0';
            if(i >0 && s.charAt(i) < s.charAt(i - 1)) {
                ans += o;
            }
        }
        return ans;
    }
}