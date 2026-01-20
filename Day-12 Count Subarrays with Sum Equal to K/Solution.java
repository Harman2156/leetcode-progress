import java.util.HashMap;

public class pfxsm {
    public static void main(String[] args) {

        int[] arr = {2, -1, 4, 3, 6, 4, 5, 1};
        int tar = 6;

        int[] arry = new int[arr.length];
        arry[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arry[i] = arry[i - 1] + arr[i];
        }

        HashMap<Integer, Integer> mm = new HashMap<>();
        int ans = 0;

        for (int j = 0; j < arry.length; j++) {

            if (arry[j] == tar)
                ans++;

            int h = arry[j] - tar;

            if (mm.containsKey(h)) {
                ans += mm.get(h);
            }

            mm.put(arry[j], mm.getOrDefault(arry[j], 0) + 1);
        }

        System.out.println(ans);
    }
}
