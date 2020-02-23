package test1;

class Solution1{
    public static int[] twoSum(int[] nums, int target) {
        int[] aryy = new int[0];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if ((nums[i] + nums[j]) == target) {

                    int aryy1[] = {i, j};
                    return aryy1;
                }
            }
        }
        return aryy;
    }
}
public class Solution {


    public static void main(String[] args) {

//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
        int[] nums = {3,2,3};
        int target = 6;
        int[] result = Solution1.twoSum(nums, target);
        int length=result.length;
        for (int i = 0; i < length; i++) {
            System.out.println(result[i]);
        }

    }


}
