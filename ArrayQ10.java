//Remove duplicates element from a sorted array
import java.util.*;

public class ArrayQ10 {
    public static int removeDuplicate(int[] arr) {
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 13, 45, 12, 34, 34, 34, 105 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int length=removeDuplicate(arr);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, length)));
    }
}
