public class maxSubSum {
    // public static void main(String[] args) {
    // // int[] arr = { 1, -2, 3, 10, -4, 7, 2, -5 };
    // System.out.println(maxSubSum(new int[] { 1, -2, 3, 10, -4, 7, 2, -5 }));
    // }

    // CALL new int[] { 1, -2, 3, 10, -4, 7, 2, -5 }
    // CALL new int[] {1, 2, 3, 4, 5}
    // CALL new int[] {-1, -2, -3, -4, -5}
    // CALL new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}
    // CALL new int[] {0, 0, 0, 0, 0}
    // CALL new int[] {10, 20, 30, 40, 50}
    public int maxSubSum(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return max;
        // EDIT
    }
}