public class Search4Range {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] nums, int target) {
        int firstPos = -1, lastPos = -1;
        int[] returnVal = {firstPos, lastPos};
        if(nums == null || nums.length == 0){
            return returnVal;
        }
        int start = 0, end = nums.length - 1;
        //Find the first match
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                end = mid;
            } else if (nums[mid] < target) {
                start = mid;  
            } else {
                end = mid;
            }
        }
        if (nums[end] == target){
            firstPos = end;
        }
        if (nums[start] == target){
            firstPos = start;
        }
        if (firstPos == -1) {
            returnVal[0] = -1;
            returnVal[1] = -1;
            return returnVal;
        }
        start = 0;
        end = nums.length - 1;
        //Find the first match
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                start = mid;
            } else if (nums[mid] < target) {
                start = mid;  
            } else {
                end = mid;
            }
        }
        if (nums[start] == target) {
            lastPos = start;
        }
        if (nums[end] == target) {
            lastPos = end;
        }
        returnVal[0] = firstPos;
        returnVal[1] = lastPos;
        return returnVal;
    }
}
