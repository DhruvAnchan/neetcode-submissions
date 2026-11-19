class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> memo = new HashSet<>();
        int count = 1, maxCount = 1;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            memo.add(i);
            max = Math.max(max,i);
        }

        for(int i = 0; i<nums.length; i++){
            if(!memo.contains(nums[i]-1)){
                int num = nums[i];
                count = 1;
                while(num <= max){
                    if(memo.contains(++num)){
                        count++;
                    }else{
                        break;
                    }
                }
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}
