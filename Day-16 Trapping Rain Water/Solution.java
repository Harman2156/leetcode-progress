class Solution {
    public int trap(int[] height) {
      int lftmax = 0;
      int rytmax  = 0;
      int water = 0;
      int left  = 0;
      int ryt = height.length - 1;
      while(left < ryt){
        lftmax  = Math.max(height[left] , lftmax);
        rytmax = Math.max(height[ryt] , rytmax);
        if(lftmax <  rytmax){
            water = water + (lftmax - height[left]);
            left++;
        }else{
            water = water + (rytmax  - height[ryt]);
            ryt--;
        }
      }  


      return water;
    }
}
