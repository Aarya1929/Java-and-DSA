/*Move all x to the end of the string:
 time = O(n)
 */

package recursion;

public class move_x_to_end {

    public static void move(String str, int ind, int count, String newString) {
        if (ind == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char current = str.charAt(ind);
        if (current == 'x') {
            count++;
            move(str, ind + 1, count, newString);
        } else {
            newString += current;
            move(str, ind + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbxxcd";
        move(str, 0, 0, "");
    }
}
