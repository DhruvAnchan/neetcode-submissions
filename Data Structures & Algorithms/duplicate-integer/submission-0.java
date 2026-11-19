class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> memo = new HashSet<>();
        for(int num: nums){
            if(!memo.add(num)){
                return true;
            }
        }
        return false;
    }

}