public class FindPeakElement {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid+1] && nums[mid] < nums[mid-1]) {
                end = mid;
            } else if (nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]) {
                start = mid;
            } else if (nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid;
            } else {
                end = mid;
            }
        }
        return -1;
        
    }
}
