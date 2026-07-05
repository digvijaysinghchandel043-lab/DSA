class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=nums.length;
        int max=0;
        int temp=0;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                temp++;
                if(temp>max){
                    max= temp;
                }

            
            }
            else if(nums[i]==0){
                    temp=0;
                }
        }
        return max;
    }
}