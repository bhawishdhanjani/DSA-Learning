import org.xml.sax.helpers.ParserAdapter;

public class StaticArrayTest {
//    insertEnd
//    removeEnd
//    insertMiddle
//    removeMiddle
    public void insertEnd(int[] array, int value , int noOfValuePresent){
        if(noOfValuePresent<array.length) {
            array[noOfValuePresent] = value;
        }
    }
    public void removeEnd(int[] array, int noOfValuePresent){
        if(noOfValuePresent>0){
            array[noOfValuePresent-1] = 0;
        }
    }
    public void insertMiddle(int[] arrray,int value,int index, int noOfValuePresent){
        for(int i = noOfValuePresent-1 ; i >= index ; i-- ){
            arrray[i+1] = arrray[i];
        }
        arrray[index] = value;
    }
    public void removeMiddle(int[] arrray,int index, int noOfValuePresent){
        for(int i = index ; i < noOfValuePresent-1 ; i++){
            arrray[i] = arrray[i+1];
        }
//        arrray[noOfValuePresent-1] = 0;

    }
//    Leet Code Problem Solution
//    https://leetcode.com/problems/remove-duplicates-from-sorted-array

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0 ) return 0;
        int k = 1;
        for(int i = 1; i<length ; i++){
            if(nums[i]!=nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
//    https://leetcode.com/problems/remove-element/description/
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for(int i = 0 ; i <= k ; i++) {
            if (nums[i] == val) {
                int temp = nums[k-1];
                nums[k-1] = nums[i];
                nums[i] = temp;
                k--;
            }
        }
        return k;
    }

}
