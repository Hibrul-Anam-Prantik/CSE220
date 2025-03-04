package Lab03;

// Task 04: Matrix Compression
class Task4{

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        int row = matrix.length, col = matrix[0].length;
        Integer[][] newMatrix = new Integer[row / 2][col / 2];
        int newI = 0;
        for(int i = 0; i < row; i += 2) {
            int newJ = 0;
            for(int j = 0; j < col; j += 2) {
                int sum = 0;
                int a1 = matrix[i][j], a2 = matrix[i][j+1];
                int b1 = matrix[i+1][j], b2 = matrix[i+1][j+1];
                sum += (a1+a2+b1+b2);
                newMatrix[newI][newJ++] = sum;
            }
            newI ++;
        }
        return newMatrix;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}