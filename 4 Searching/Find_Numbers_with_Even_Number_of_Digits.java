// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

public class Find_Numbers_with_Even_Number_of_Digits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int arr : nums) {
            //For negative numbers
            if (arr < 0) {
                arr = arr * -1;
            }
            int digitCount = 0;
            while (arr != 0) {
                arr = arr / 10;
                digitCount = digitCount + 1;
            }
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
