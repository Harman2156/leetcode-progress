class Solution {
    public void nextPermutation(int[] arr) {

        int n = arr.length - 1;
        int gola = -1;

       
        for (int i = n; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                gola = i - 1;
                break;
            }
        }

       
        if (gola != -1) {
            int swap_idx = gola;

            for (int j = n; j >= gola + 1; j--) {
                if (arr[j] > arr[gola]) {
                    swap_idx = j;
                    break;
                }
            }

            
            int tmp = arr[swap_idx];
            arr[swap_idx] = arr[gola];
            arr[gola] = tmp;
        }

        
        int l = gola + 1, r = n;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
