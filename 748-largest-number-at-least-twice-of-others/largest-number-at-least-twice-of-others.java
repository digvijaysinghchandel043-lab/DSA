class Solution {
    public int dominantIndex(int[] nums) {
        int len=nums.length;
        int max=0;
        int temp=0;
        for(int i=0;i<len;i++){
            if(nums[i]>max){
                max=nums[i];
                temp=i;
            }
        }
        int count=1;
              for (int i = 0; i < len; i++) {
            if (i != temp && max < 2 * nums[i]) {
                return -1;
            }
        }
        return temp;
    }
}