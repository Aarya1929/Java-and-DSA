/*First and last occurence of a character in a string:
 time = O(n)
 */

package recursion;

public class firstandlast_occur {
    public static int first = -1;
    public static int last = -1;

    public static void occurence(String str, int ind, char element) {
        if (ind == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char current = str.charAt(ind);

        if (current == element) {
            if (first == -1) {
                first = ind;
            } else {
                last = ind;
            }
        }
        occurence(str, ind + 1, element);
    }

    public static void main(String[] args) {
        String str = "Hallelujiah";
        occurence(str, 0, 'l');
    }
}
