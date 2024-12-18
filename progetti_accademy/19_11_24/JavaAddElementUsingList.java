import java.util.ArrayList;
import java.util.Arrays;

public class JavaAddElementUsingList {
    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Array:" + Arrays.toString(arr));
        System.out.println(Arrays.toString(arr).contains("[1, 2, 3, 4, 5, 6]"));
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        arrayList.add(7);
        arr = arrayList.toArray(arr);
        System.out.println("Array dopo aggiunta: " + Arrays.toString(arr));
        System.out.println(Arrays.equals());
    }
}
