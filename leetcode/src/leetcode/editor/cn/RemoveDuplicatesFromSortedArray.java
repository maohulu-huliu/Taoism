package leetcode.editor.cn;

/**
 * @author yangxuan
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // TO TEST
//        int[] nums = {1, 1, 2};
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(solution.removeDuplicates(nums));
        System.out.println(solution.removeDuplicates(nums1));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int removeDuplicates(int[] nums) {
            // 双指针法
            int left = 0;
            for (int right = 1; right < nums.length; right++) {
                if (nums[left] != nums[right]) {
                    nums[++left] = nums[right];
                }
            }
            return ++left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
