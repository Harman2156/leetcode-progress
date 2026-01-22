class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        Stack<Integer> m = new Stack<>();
        
         for(int i = 0;i<arr.length;i++){
             while(!m.isEmpty() && m.peek() >= arr[i]){
                 m.pop();
             }
             if(m.isEmpty()){
                 lst.add(-1);
             }else{
                 lst.add(m.peek());
             }
             
             m.push(arr[i]);
         }
         
         
         return lst;
        
    }
}
