
// Time complexity = O(n2)

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){  // if you want to use <= then you write arr.length-1
                if (arr[minPos] > arr[j]) {  // for decreasing & increasing order to change sign of </>
                    minPos = j;
                }
            }
            // swap with smallest elemeents
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,3,4,2,1};
        selectionSort(arr);
        printArr(arr);
    }
}
