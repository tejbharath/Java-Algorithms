package com.company;

public class KnapSackDP {
    // Can only pick up one weight at a time
    public int findMax(int[] weights, int[] values, int W){
        int[][] dp = new int[weights.length + 1][W+1];
        for(int i=0 ; i<weights.length+1; i++){
            for(int j=0; j<W+1; j++){
                if(i == 0){
                    dp[i][j] = 0;
                }
                else if(j < weights[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], values[i-1] + dp[i-1][j - weights[i-1]]); // dp[i] - unbounded - Can pick same weight unlimited times
                }
            }
        }
        return dp[weights.length][W];

    }

}
