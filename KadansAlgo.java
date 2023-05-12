public class KadansAlgo {
    public static int SumOfMaxSubArray(int arr[]){
        int sum = 0;
        int maxi = arr[0];

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            maxi = Math.max(sum, maxi);

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-1,-5,-3,-4,-8,-7,-9};
        SumOfMaxSubArray(arr);
        System.out.println("Max. sum of SubArray : " + SumOfMaxSubArray(arr));
    }
    
}
