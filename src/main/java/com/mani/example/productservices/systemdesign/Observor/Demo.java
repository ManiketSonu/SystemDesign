package com.mani.example.productservices.systemdesign.Observor;

public class Demo {
    public static void main(String[] args) {
        int[] ratings1 = {1, 2};
        System.out.println("Minimum candies for ratings {1, 2}: " + minCandies(ratings1));

//        int[] ratings2 = {1, 5, 2, 1};
//        System.out.println("Minimum candies for ratings {1, 5, 2, 1}: " + minCandies(ratings2));

    }
    public static int minCandies(int[] ratings) {
        int n = ratings.length;

        // Edge case: if there is only one child
        if (n == 1) {
            return 1;
        }

        // Array to store the number of candies for each child
        int[] candies = new int[n];

        // Step 1: Initially, give 1 candy to each child
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Step 2: Left to right pass - Ensure children with higher ratings get more candies than their left neighbor
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to left pass - Ensure children with higher ratings get more candies than their right neighbor
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Calculate the total number of candies
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}
