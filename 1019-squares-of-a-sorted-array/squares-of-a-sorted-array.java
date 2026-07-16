class Solution {
    public int[] sortedSquares(int[] nums) {
        int squu[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sq=nums[i];
            int squ=sq*sq;
            squu[i]=squ;
        }
        Arrays.sort(squu);
        return squu;
    }
}