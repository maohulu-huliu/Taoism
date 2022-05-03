package leetcode.editor.cn;

/**
 * @author yangxuan
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Solution solution = new SquaresOfASortedArray().new Solution();
        // TO TEST
        int[] nums = {-4, -1, 0, 3, 10};
        int[] ints = solution.sortedSquares(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int right = nums.length - 1;
            int left = 0;
            int[] res = new int[nums.length];
            int index = res.length - 1;

            while (left <= right) {
                if (nums[left] * nums[left] > nums[right] * nums[right]) {
                    res[index--] = nums[left] * nums[left];
                    ++left;
                } else {
                    res[index--] = nums[right] * nums[right];
                    --right;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
