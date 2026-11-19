class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> memo = new HashMap<Integer,Integer>();
        int[] result = {0,0};
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target-num;
            //System.out.println(num+" : "+i+":"+memo.get(diff)+": "+diff);
            if(memo.containsKey(diff)){
                if(i < memo.get(diff)){
                    result[0] = i;
                    result[1] = memo.get(diff);
                }else{
                    result[0] = memo.get(diff);
                    result[1] = i;
                }
                return result;
            }else{
                memo.put(num,i);
            }
            //System.out.println(memo);
        }
        return result;
    }
}
