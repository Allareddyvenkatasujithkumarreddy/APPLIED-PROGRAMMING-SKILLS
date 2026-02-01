class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; // position for next non-zero element

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
