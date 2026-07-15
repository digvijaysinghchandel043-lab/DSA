class Solution {
    public int removeDuplicates(int[] nums) {
        int[] nums1 =new int[nums.length];
        int skip=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                skip++;
                nums[skip] = nums[i];
            }
        }
        return skip+1;
    }
}
