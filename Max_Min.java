public class Max_Min {
    public static long[] min_max(long arr[]){
        long min = arr[0];
        long max = arr[0];

        for(int i=1; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new long[] {min, max};
    }
    public static void main(String[] args) {
        long arr[] = {2,5,6,7,9,3,8,4};

        System.out.println(min_max(arr));
    }
}
