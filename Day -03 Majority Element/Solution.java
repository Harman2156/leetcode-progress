class Solution {
    public int majorityElement(int[] arr) {
        int vot = 1;
        int maj = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(vot == 0){
                vot++;
                maj = arr[i];
            }else if(maj ==  arr[i]){
                vot++;
            }else{
                vot--;
            }
        }

        return maj;
    }
}
