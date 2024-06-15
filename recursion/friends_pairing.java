/*Find no. of ways in which u can invite guests to a party, single or in pairs */

package recursion;

public class friends_pairing {
    public static int pairFriends(int n) {
        if (n <= 1) {
            return 1;
        }

        return pairFriends(n - 1) + (n - 1) * pairFriends(n - 2);
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.println(pairFriends(n));
    }

}
