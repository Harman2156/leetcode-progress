class Solution {
    public static int leftbond(int[] nums , int tgt){
        int idx = -1;int lo = 0;int hi = nums.length-1;
        while(lo <= hi){
            int mid = lo + (hi- lo) / 2;
            if(nums[mid] == tgt){
                idx = mid;
                hi = mid - 1;
            }else if(nums[mid] < tgt){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
            return idx;
        }
    
    public static int rytbond(int[] nums , int tgt){
        int idx = -1;int lo = 0;int hi = nums.length-1;
        while(lo <= hi){
            int mid = lo + (hi- lo) / 2;
            if(nums[mid] == tgt){
                idx = mid;
                lo = mid + 1;
            }else if(nums[mid] < tgt){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }

            return idx;
        }
    public int[] searchRange(int[] nums, int target) {
    int arr[] = new int[2];
    int left  = leftbond(nums , target);
    int ryt = rytbond(nums , target);
    arr[0] = left;
    arr[1] = ryt;

    return arr;
    
    }
}
