/*Print keypad combinations:
 time = O(4^n)
 */

package recursion;

public class keypad_comb {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

    public static void combinations(String str, int ind, String comb) {
        if (ind == str.length()) {
            System.out.println(comb);
            return;
        }
        char current = str.charAt(ind);
        String mapping = keypad[current - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            combinations(str, ind + 1, comb + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "4";
        combinations(str, 0, "");
    }
}
