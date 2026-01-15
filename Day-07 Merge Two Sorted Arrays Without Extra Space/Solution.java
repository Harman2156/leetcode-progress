import java.util.*;
public class arramrj{
    public static void main(String[] args){
        int a[] = {1, 5, 9, 10, 15, 20};
        int  b[] = {2, 3, 8, 13};

        int i = a.length - 1;
        int j = 0;
        while(i >= 0 && j < b.length){
            if(a[i] > b[j]){
                int tmp = a[i];
                a[i] = b[j];
                b[j] = tmp;
                i--;
            }else{
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for(int p = 0;p<a.length;p++){
            System.out.print(a[p] + " ");
        }
        System.out.println();
        for(int q = 0;q<b.length;q++){
            System.out.print(b[q] + " ");
        }
    }
}
