class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> memo = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target-num;
            if(memo.containsKey(diff)){
                return new int[] {memo.get(diff),i};
            }
            memo.put(num,i);
        }
        return new int[]{};
    }
}
