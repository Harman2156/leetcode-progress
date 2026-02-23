class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        HashMap<Integer , Integer> mm = new HashMap<>();
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(!mm.containsKey(arr[i])){
                mm.put(arr[i] , 1);
            }else{
                int fr = mm.get(arr[i]);
                mm.put(arr[i] , fr+1);
            }
        }
        int y = arr.length/k;
        for(int j : mm.keySet()){
          if(mm.get(j) > y){
              count++;
          }  
        }
        
        return count;
    }
}
