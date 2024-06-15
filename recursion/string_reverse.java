//Reverse string using recursion : time = O(n)

package recursion;

public class string_reverse {
    public static void reverse(String str, int ind) {
        if (ind == 0) {
            System.out.print(str.charAt(ind));
            return;
        }

        System.out.print(str.charAt(ind));
        reverse(str, ind - 1);
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);
        int ind = str.length() - 1;
        System.out.println("Reversed String: ");
        reverse(str, ind);
    }
}
