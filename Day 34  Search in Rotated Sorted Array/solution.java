class Solution {
    public int search(int[] arr, int ta) {
        int lo = 0; int hi = arr.length-1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == ta){
                return mid;
            }
            if(arr[lo] <= arr[mid] ){
                if(arr[lo] <= ta && ta <= arr[mid]){
                    
                    hi = mid -1;
                }else{
                    lo = mid + 1;
                }
            }else{
                    if(arr[mid] <=  ta && arr[hi] >= ta){
                        lo  = mid + 1;
                    }else{
                        hi  = mid - 1 ;
                    }
            }

            
        }
        return -1;
    }
}
