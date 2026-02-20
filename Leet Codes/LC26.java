//LC 26
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int p = 0; p < nums.length; p++){
            if(nums[p] != nums[k]){
                nums[++k] = nums[p];
            }
        }
        return k + 1;
    }
}