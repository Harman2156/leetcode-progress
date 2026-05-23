import java.util.*;

class Solution {

    public List<List<Integer>> fourSum(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {

            // skip duplicate i
            if(i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for(int j = i + 1; j < n; j++) {

                // skip duplicate j
                if(j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while(left < right) {

                    long sum = (long)arr[i] + arr[j] + arr[left] + arr[right];

                    if(sum < target) {
                        left++;
                    }
                    else if(sum > target) {
                        right--;
                    }
                    else {

                        ans.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));

                        left++;
                        right--;

                        // skip duplicate left
                        while(left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }

                        // skip duplicate right
                        while(left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }
                    }
                }
            }
        }

        return ans;
    }
}
