class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length], suffix = new int[nums.length], res = new int[nums.length];
        int len = nums.length, preProd = 1, suffProd = 1;
        for(int i = 0; i < len; i++){
            preProd = preProd * nums[i];
            suffProd = suffProd * nums[len-i-1];
            prefix[i] = preProd;
            suffix[len-i-1] = suffProd;
        }

        for(int i = 0; i < len; i++){
            int left = (i>0)?prefix[i-1]:1;
            int right = (i<len-1)?suffix[i+1]:1;
            res[i] = left*right;
        }

        return res;
    }
}  
