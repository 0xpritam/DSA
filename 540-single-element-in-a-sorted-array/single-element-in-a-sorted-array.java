class Solution {
    public int singleNonDuplicate(int[] nums) {
        int end = nums.length - 1;
             if(end == 0) return nums[0];

        for(int i = 0; i <= end; i++){

            if(i == 0){

             if(nums[0] != nums[i+1]){
               return nums[0];
             }
            } else if(nums[end] != nums[end - 1]){
                return nums[end];
            }else{
                if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                    return nums[i];
                }
            }
        }

        return -1;
    }
}