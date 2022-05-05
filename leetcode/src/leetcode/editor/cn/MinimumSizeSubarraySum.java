package leetcode.editor.cn;

/**
 * @author yangxuan
 */
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // TO TEST
        solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            /**
             *
             * 转载连接
             * https://programmercarl.com/0209.%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84.html
             *
             * 在本题中实现滑动窗口，主要确定如下三点：
             *
             * 窗口内是什么？
             * 如何移动窗口的起始位置？
             * 如何移动窗口的结束位置？
             * 窗口就是 满足其和 ≥ s 的长度最小的 连续 子数组。
             *
             * 窗口的起始位置如何移动：如果当前窗口的值大于s了，窗口就要向前移动了（也就是该缩小了）。
             *
             * 窗口的结束位置如何移动：窗口的结束位置就是遍历数组的指针，窗口的起始位置设置为数组的起始位置就可以了。
             *
             * 解题的关键在于 窗口的起始位置如何移动，如图所示：
             */

            // 从数据索引 left = 0开始，找到第一个大于等于target的子数组，记录长度result
            // 左指针 left++ 右移，跳出while循环，right右指针继续移动，找到下一个大于等于target的子数组，比较此次找到的子数组长度与result的大小，取最小值
            // for循环结束，返回result
            int left = 0;
            int sum = 0;
            int result = Integer.MAX_VALUE; // 最小长度
            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum >= target) {
                    result = Math.min(result, right - left + 1);
                    sum -= nums[left++];
                }
            }
            return result == Integer.MAX_VALUE ? 0 : result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
