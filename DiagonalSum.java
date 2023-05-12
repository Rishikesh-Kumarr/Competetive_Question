public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        // primary 
        // O(n^2)
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         }
        //         else if (i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        

        //  Time complexity = O(n)
        for(int i=0; i<matrix.length; i++){
            // primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,1,1,1},
                         {1,1,1,1},
                         {1,1,1,1},
                         {1,1,1,1}};
        System.out.println("Digonal Sum : " + diagonalSum(matrix));    
    }
}
