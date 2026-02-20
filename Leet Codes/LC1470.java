//LC 1470
class Solution {
    public int[] shuffle(int[] nums, int n) {

    int index = 0;
    int[] newArray=new int[2*n];
    for(int i=0;i<n;i++){
        newArray[index++]=nums[i];
        newArray[index++]=nums[i+n];
    }
    return newArray;
    }
}