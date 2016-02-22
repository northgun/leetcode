public class FindMinimumInRotatedArray {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        int start = 0, end = num.length - 1;
        if (num[start] < num[end]){
            return num[start];
        }
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (num[start] < num[mid] && num[mid] > num[end]) {
                start = mid;
            } else if (num[start] > num[mid] && num[end] > num[mid]) {
                end = mid;
            }
        }
        if (num[start] <= num[end]) {
            return num[start];
        } else {
            return num[end];
        }
    }
}
