class Solution {
    public int[] twoSum(int[] nums, int target) {
        int newNums[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int other=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==other){
                    newNums[0]=i;
                    newNums[1]=j;
                }
            }
        }
        return newNums;    
    }
}