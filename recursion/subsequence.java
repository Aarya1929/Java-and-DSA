/*Print all subsequences:
characters should follow same order
can or cannot be included in the subsequence
 time = O(2^n)
 */

package recursion;

public class subsequence {

    public static void print_Sub(String str, int ind, String newString) {

        if (ind == str.length()) {
            System.out.println(newString);
            return;
        }

        char current = str.charAt(ind);
        // come
        print_Sub(str, ind + 1, newString + current);

        // does not come
        print_Sub(str, ind + 1, newString);

    }

    public static void main(String[] args) {
        String str = "abc";
        print_Sub(str, 0, "");
    }
}
