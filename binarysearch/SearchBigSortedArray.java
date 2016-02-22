public class SearchBigSortedArray {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return : An integer which is the index of the target number
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        if (reader.get(0) == target){
            return 0;
        }
        int start = 0;
        int end = 1;
        
        while (reader.get(end) != -1 && target > reader.get(end)) {
            start = end;
            end = start * 2;
        }
        
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(reader.get(mid) == -1) {
                end = mid;
            } else if (reader.get(mid) == target) {
                end = mid;
            }else if (target < reader.get(mid)){
                end = mid;
            }else{
                start = mid;
            }
        }
        if (reader.get(start) == target) {
            return start;
        }
        if (reader.get(end) == target){
            return  end;
        }
        return -1;
    }
}
