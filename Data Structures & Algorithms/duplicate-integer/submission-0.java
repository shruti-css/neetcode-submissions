class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean res=false;
        int n= nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    res=true;
                }
            }
        }
        return res;
    }
}