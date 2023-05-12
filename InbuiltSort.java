import java.util.*;
public class InbuiltSort {
    public static void main(String[] args) {
        Integer arr[] = {5,3,4,2,6,1,7}; // this is a object of Integer class
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        // Arrays.sort(arr, Collections.reverseOrder());// this func. is work on object of any datatype not of primitive datatype
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
