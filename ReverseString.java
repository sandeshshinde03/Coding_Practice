public class ReverseString {
    public void reverseString(char[] s) {
        int l = s.length;
        for (int i = 0; i < l / 2; i++) {
            char temp = s[i];
            s[i] = s[l - 1 - i];
            s[l - i - 1] = temp;
        }
    }

    public void reverseStr(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        String str = "Hello";
        char[] s = str.toCharArray();
        System.out.print("Original String is: ");
        for (char c : s) {
            System.out.print(c + " ");
        }
        obj.reverseString(s);
        //obj.reverseStr(s);
        System.out.println();
        System.out.println("\nReversed String is: " + new String(s));
        System.out.println(s);
        System.out.println(java.util.Arrays.toString(s));
    }
}
