
---

## Approach

1. Start comparing the **last element of array `a`** with the **first element of array `b`**.
2. If `a[i] > b[j]`, swap them.
3. Move `i` backward and repeat.
4. Once swapping is done, **sort both arrays individually**.
5. This ensures:
   - Smaller elements stay in `a`
   - Larger elements stay in `b`

---

## Algorithm Steps

- Initialize:
  - `i = a.length - 1`
  - `j = 0`
- While `i >= 0` and `j < b.length`:
  - If `a[i] > b[j]`, swap
  - Else move `j` forward
- Sort both arrays

---

## Java Implementation

```java
import java.util.*;

public class arramrj {
    public static void main(String[] args) {
        int a[] = {1, 5, 9, 10, 15, 20};
        int b[] = {2, 3, 8, 13};

        int i = a.length - 1;
        int j = 0;

        while (i >= 0 && j < b.length) {
            if (a[i] > b[j]) {
                int tmp = a[i];
                a[i] = b[j];
                b[j] = tmp;
                i--;
            } else {
                j++;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
..._
## Time Complexity:
Swapping loop: O(min(n, m))

Sorting arrays: O(n log n + m log m)

## Space Complexity:
O(1)  (No extra space used)
