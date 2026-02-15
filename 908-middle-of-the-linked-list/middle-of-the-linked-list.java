class Solution {

    // ===== PROBLEM 1: Sorted Squares of Sorted Array =====
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1, pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }
        return result;
    }

    // ===== PROBLEM 2: Middle of the Linked List =====
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
