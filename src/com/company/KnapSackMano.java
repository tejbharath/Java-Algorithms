package com.company;

public class KnapSackMano {

        /**
         * Unbounded 0/1 Knapsack problem using 2D array
         * Time: O(n)
         * Space: mn where m is the total capacity plus one, and n is number of weights plus one
         */
        public static int unboundedKnapsack(int W, int wt[], int val[]) {
            int[][] dp = new int[wt.length+1][W+1];
            for(int i=1; i<wt.length+1; i++) {
                for(int j=1; j <= W; j++) {
                    if(wt[i-1] > j) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], val[i-1] + dp[i][j-wt[i-1]]);
                    }
                }
            }
            return dp[wt.length][W];
        }

        /**
         * Optimized: Unbounded 0/1 Knapsack problem using 1D array
         * Approach: Use 1D array, use a single row to replace elements for every weight
         * Time: 0(n)
         * Space: W+1 => O(n)
         */
        public static int optimizedUnboundedKnapsack(int W, int wt[], int val[]) {
            int[] dp = new int[W+1];
            dp[0] = 0;
            for(int i=1; i<=wt.length; i++) {
                for(int j=0; j<=W; j++) {
                    if(wt[i-1] <= j) {
                        dp[j] = Math.max(dp[j], val[i-1] + dp[j-wt[i-1]]);
                    }
                }
            }
            return dp[W];
        }

        /**
         * Bounded 0/1 Knapsack problem using 2D array
         * Time: O(n)
         * Space:mn where m is the total capacity plus one, and n is number of weights plus one
         */
        public static int boundedKnapsack(int W, int wt[], int val[]) {
            int[][] dp = new int[wt.length+1][W+1];
            for(int i=1; i<wt.length+1; i++) {
                for(int j=1; j <= W; j++) {
                    if(wt[i-1] > j) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], val[i-1] + dp[i-1][j-wt[i-1]]);
                    }
                }
            }
            return dp[wt.length][W];

        }

        public static void main(String[] args) {
            int val[] = new int[]{2, 5, 7, 10};
            int wt[] = new int[]{1, 2, 3, 4};
            int  W = 7;
            System.out.println(unboundedKnapsack(W, wt, val));
//		System.out.println(optimizedUnboundedKnapsack(W, wt, val));
//		System.out.println(boundedKnapsack(W, wt, val));
        }

}
