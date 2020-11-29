package com.company;

public class KnapSack {

    public int findMax(int[] weights, int[] values, int W){
        return helper(weights, values, W, 0, 0, 0);
    }

    public int helper(int[] weights, int[] values, int W, int i, int currWeight, int currValue){
        //Base Case
        if(i >= weights.length){
            if(currWeight <= W) return currValue;
            else return  0;
        }
        if(currWeight > W) return 0;
        if(currWeight == W) return currValue;
        return Math.max(helper(weights, values, W, i+1, currWeight+weights[i], currValue+values[i]), helper(weights, values, W, i+1, currWeight, currValue));
    }
}
