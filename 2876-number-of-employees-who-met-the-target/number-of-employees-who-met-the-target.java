class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int max=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                max++;
            }
        }
        return max;
    }
}