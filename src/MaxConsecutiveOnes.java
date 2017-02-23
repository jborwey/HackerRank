/**
 * Created by jb039k on 1/16/2017.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int result = 0;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(count, result);
            }
            else count = 0;
        }

        return result;
    }

}