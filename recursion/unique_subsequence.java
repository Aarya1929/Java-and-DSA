/*Print all unique subsequences:
 */

package recursion;

import java.util.HashSet;

public class unique_subsequence {
    public static void subsequence(String str, int ind, String newString, HashSet<String> set) {
        if (ind == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char current = str.charAt(ind);
        // come
        subsequence(str, ind + 1, newString + current, set);

        // does not come
        subsequence(str, ind + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, "", set);
    }
}
