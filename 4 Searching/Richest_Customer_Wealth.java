// https://leetcode.com/problems/richest-customer-wealth/

public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rowsum = rowsum + accounts[i][j];
            }
            if (rowsum > max) {
                max = rowsum;
            }
        }
        return max;
    }
}
