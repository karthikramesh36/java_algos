package greedy.one;

/* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

public class MaximumSubArray {

    public MaximumSubArray() {
        super();
    }

    public static int solution(int[] nums) {
        int curSum = 0;
        int maxSum = 0;
        for( int i = 0 ; i < nums.length; i++){
            curSum = Math.max(0,curSum += nums[i]);
            maxSum = Math.max(curSum, maxSum);
        } 

        return maxSum;
    }
}