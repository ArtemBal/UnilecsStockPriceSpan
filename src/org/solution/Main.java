package org.solution;

public class Main {

    public static void main(String[] args) {
        System.out.println(arraySolution(3));
    }

    public static int arraySolution(int price) {
        int[] prices = new int[] {5, 2, 1, 2};
        int count = 1;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] <= price) count++;
            else break;
        }
        return count;
    }
}