class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(arr);
       for(int i = 0;i<arr.length - 2;i++){
        if(i > 0 && arr[i] == arr[i - 1]) continue;
        int left = i + 1;
        int ryt =  arr.length - 1;
        while(left < ryt){
        int sum = arr[i] + arr[left] + arr[ryt];
        if(sum == 0){
            ans.add(Arrays.asList(arr[i] , arr[left] , arr[ryt]));
            while(left < ryt && arr[left] == arr[left + 1]) left++;
            while(ryt > left && arr[ryt] == arr[ryt - 1]) ryt--;
            left++;
            ryt--;
        }else if(sum < 0) {
            left++;
        }else{
            ryt--;
        }
       } 
    }
    return ans;
    }
}
