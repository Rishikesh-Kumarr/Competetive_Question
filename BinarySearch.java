public class BinarySearch {
    public static int BinSearch(int arr[], int key){
        int start = 0, end = arr.length-1;

        while (start <= end) {
            int mid = (start+end)/2;

            // comparisons

            if (arr[mid] == key) { // found
                return mid;
            }
            if (arr[mid] < key) { // right
                start = mid+1;
            }
            else{  // left
                end = mid-1;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,12,14,16,20,25};
        int key = 12;

        System.out.println("index for key is : " + BinSearch(arr, key));
    }
}
