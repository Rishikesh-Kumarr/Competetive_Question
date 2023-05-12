public class SubArray2 {
    public static void MaxSumOfSubArrays(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        // calculate the prefix
        for(int i=1; i<prefix.length; i++){ // start
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){   // end
            for(int j=i; j<arr.length; j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max. Sum = " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,4};
        MaxSumOfSubArrays(arr);
    }
}
