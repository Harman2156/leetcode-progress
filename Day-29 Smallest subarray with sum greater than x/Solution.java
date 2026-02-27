class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {

        int n = arr.length;
        int ans = Integer.MAX_VALUE;

        int prfx[] = new int[n];
        prfx[0] = arr[0];

        for(int i = 1; i < n; i++){
            prfx[i] = prfx[i - 1] + arr[i];
        }

        for(int i = 0; i < n; i++){
        for(int j = i; j < n; j++){

            int sum;
            if(i == 0)
                sum = prfx[j];
            else
                sum = prfx[j] - prfx[i-1];

            if(sum > x){
                int len = j - i + 1;
                ans = Math.min(ans, len);
                }
            }
        }

        return (ans == Integer.MAX_VALUE) ? 0 : ans;
    }
}
