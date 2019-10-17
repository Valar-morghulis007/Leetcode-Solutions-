import java.util.Arrays;

public class Solution1 {
    private int[] dp;
    private int max_amount;
    public int coinChange(int[] coins, int amount) {
        max_amount=amount+1;
        dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int res=search(coins,amount);
        return res==max_amount?-1:res;
    }
    private int search(int[] coins,int amount){
        if(amount==0){
            return 0;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int res=max_amount;
        for(int coin :coins){
            if(amount-coin>=0){
                res=Math.min(res,1+search(coins,amount-coin));
            }
        }
        return dp[amount]=res;
    }

}
