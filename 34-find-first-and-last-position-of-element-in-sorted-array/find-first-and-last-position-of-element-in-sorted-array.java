class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=-1;
        int l=-1;
        boolean bool=true;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i] && f==-1 ){
                f=f+i+1;
                l=l+i+1;
            }else if(target==nums[i]){
                int diff=i-l;
                l=l+diff;
            }
        }
        return new int[]{f,l};
    }
}