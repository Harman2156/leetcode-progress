class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        
        int lo = 0;
        int mid = 0;
        int hi = arr.length - 1;
        
        while(mid <= hi){
            
            if(arr[mid] < a){
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                
                lo++;
                mid++;
            }
            else if(arr[mid] >= a && arr[mid] <= b){
                mid++;
            }
            else{ 
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                
                hi--;
            }
        }
    }
}
