public class LargestNumber {
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;  // -infinity
        int smallest = Integer.MAX_VALUE;   // infinity
        for(int i=0; i<num.length; i++){
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest num. : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {8,7,3,1,2,4,5,9,6,11};
        System.out.println("Largest value : " + getLargest(num));
    }
}
