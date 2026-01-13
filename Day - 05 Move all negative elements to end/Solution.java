class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        // store positive elements
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // store negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // copy back
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
