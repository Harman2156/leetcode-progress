// User function Template for Java

class Solution {
    public static int Mindif(int k , int j , ArrayList<Integer> arr){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i = k;i<=j;i++){
        max = Math.max(max , arr.get(i));
        min = Math.min(min , arr.get(i));
    }
    return max - min;
    }
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        if(m  > arr.size()) return -1;
        Collections.sort(arr);
        int i = 0;
        int j = m - 1;
        int pkk  = Integer.MAX_VALUE;
        while(j < arr.size()){
        int res = Mindif(i , j , arr);
        pkk = Math.min(res , pkk);
        i++;
        j++;
        }
        
        
        return pkk;
    }
}
