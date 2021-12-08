class Solution {
    public int fib(int n) {
        final int MOD = 1000000007;
        int p, q = 0, curr = 1;
        if(n < 2){
            return n;
        }
        //滚动数组法进行状态转移，动态规划
        for(int i=2;i<=n;i++){
            p = q;
            q = curr;
            curr = (p + q) % MOD;
        }
        return curr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int fib = solution.fib(3);
        System.out.println("fib = " + fib);
    }
}