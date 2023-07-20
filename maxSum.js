//Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
function maxSum(arr) {
    let max = arr[0];
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
        if (max < sum) {
            max = sum;
        }
        if (sum < 0) {
            sum = 0;
        }
    }
    return max;
}