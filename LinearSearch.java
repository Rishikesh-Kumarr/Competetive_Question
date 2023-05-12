public class LinearSearch{
    public static int LinearS(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {8,5,6,3,2,1,7,9,11,17};
        int key = 91;

        int index = LinearS(arr, key);
        if (index == -1) {
            System.out.println("Key not Found");
        }
        else{
            System.out.println("Key is at index : " + index);
        }
    }
}