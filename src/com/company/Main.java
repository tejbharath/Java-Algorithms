package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        KnapSack s = new KnapSack();
        System.out.println(s.findMax(new int[]{10, 20, 30}, new int[] {120, 100, 60}, 50));
    }
}
