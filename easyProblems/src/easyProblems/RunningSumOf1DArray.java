package easyProblems;

public class RunningSumOf1DArray {
    /**
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     *
     * Return the running sum of nums.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     * Example 2:
     *
     * Input: nums = [1,1,1,1,1]
     * Output: [1,2,3,4,5]
     * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
     * Example 3:
     *
     * Input: nums = [3,1,2,10,1]
     * Output: [3,4,6,16,17]
     *
     *
     * Constraints:
     *
     * 1 <= nums.length <= 1000
     * -10^6 <= nums[i] <= 10^6
     *
     *
     *
     * **************************** Best Solution : Space Complexity (o(1))
     * 💾 Space Optimization? YES ✅
     * If you're allowed to modify the input array in-place, you can reduce space complexity to O(1) extra space:
     *
     * public int[] runningSum(int[] nums) {
     *     for (int i = 1; i < nums.length; i++) {
     *         nums[i] += nums[i - 1]; // Modify in-place
     *     }
     *     return nums;
     * }
     * Time: O(n)
     *
     * Space: O(1) (in-place modification)
     */
    public static void main(String[] args) {
//        int [] nums = {1,2,3,4};
        int [] nums = {18,6,13,11,15,16,1,20};
        runningSumOf1dArray(nums);
    }
    private static int[]  runningSumOf1dArray(int[] numArray){
        if(!validateInputArray(numArray)){
            return new int[0];
        }
        for(int i=1; i< numArray.length ; i++){
            numArray[i] += numArray[i-1] ;
        }
        print1dArray(numArray);
        return numArray;
    }
    private static boolean validateInputArray(int[] numArray){
        if(numArray.length < 1 || numArray.length > 1000 ){
            System.out.println("Validation Error:Invalid Array Size!");
            return false;
        }
        for(Integer i=0; i<numArray.length; i++){
            if((numArray[i] < -Math.pow(10, 6) || (numArray[i] > Math.pow(10, 6)))){
                System.out.println("Validation Error:Invalid Array item!");
                return false;
            }
        }
        return true;
    }
    private static void print1dArray(int [] numArray){
        for(int i : numArray)
        {
            System.out.println(i + " ");
        }
    }
}
