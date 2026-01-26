class Solution {
    public int[] productExceptSelf(int[] nums) {
      int pfx[] = new int[nums.length];
      int sfx[] = new int[nums.length];
      int ans[] = new int[nums.length];
        pfx[0] = 1;
      for(int i = 1;i<nums.length;i++){
        pfx[i] = pfx[i -1] * nums[i - 1];
      } 
      sfx[nums.length - 1] = 1;
      for(int i = nums.length - 2;i>= 0;i--){
        sfx[i] = sfx[i + 1] * nums[i + 1];
      }

      for(int i = 0;i<nums.length;i++){
        ans[i] = pfx[i] * sfx[i];
      } 


      return ans;
    }
}
