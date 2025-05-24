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
        arrray[noOfValuePresent-1] = 0;

    }

}
