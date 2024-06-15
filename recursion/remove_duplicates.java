/*Remove duplicates from a string:
 time = O(n)
 */

package recursion;

public class remove_duplicates {

    public static boolean[] visited = new boolean[26];

    public static void duplicates(String str, int ind, String newString) {
        if (ind == str.length()) {
            System.out.println(newString);
            return;
        }

        char current = str.charAt(ind);

        if (visited[current - 'a']) {
            duplicates(str, ind + 1, newString);
        } else {
            newString += current;
            visited[current - 'a'] = true;
            duplicates(str, ind + 1, newString);
        }

    }

    public static void main(String[] args) {
        String str = "abcdaad";
        duplicates(str, 0, "");
    }
}
