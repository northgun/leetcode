public class FindBadVersion {
    /**
     * @param n: An integers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
        int start = 1, end = n;
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            if (SVNRepo.isBadVersion(mid) == true) {
                end = mid;
            }else{
                start = mid;
            }
        }
        if (SVNRepo.isBadVersion(start) == true) {
            return start;
        }
        if (SVNRepo.isBadVersion(end) == true) {
            return end;
        }
        return -1;
    }
}
