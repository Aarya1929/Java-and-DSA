/*Check if array is sorted (strictly increasing):
 time = O(n)
*/

package recursion;

public class check_sorted {

    public static boolean isSorted(int arr[], int ind) {

        if (ind == arr.length - 1) {
            return true;
        }
        if (arr[ind] < arr[ind + 1]) {
            isSorted(arr, ind + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4 };

        if (isSorted(arr, 0)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
