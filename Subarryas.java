import javax.print.attribute.standard.MediaName;

public class Subarryas {
    public static void printSubArrays(int arr[]){
        int ts = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");  //subarrays
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("No. of total subarryas : " + ts);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,3,6,9,7};
        printSubArrays(arr);
    }
}
