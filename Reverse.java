public class Reverse {
    public static void ReverseArray(int arr[]){
        int first = 0, last = arr.length-1;

        while (first < last) {
            
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void printArray(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,6,8,9};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        ReverseArray(arr);
        printArray(arr);

    }
}
