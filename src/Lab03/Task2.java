package Lab03;

//Task 02: Decryption Process
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        //For this task you'll need to create new arrays
        //we recommend you to use Integer type.
        //example:  Integer[] array = new Integer[5]
        //TO DO
        int row = matrix.length;
        int col = matrix[0].length;
        Integer[] sumArr = new Integer[col - 1];
        int iSum = col - 2;   // index for the new Array(backward), containing the differences
        int i = col - 1, tempSum = 0;
        while(i >= 0) {   // backward
            int sum = 0;
            for(int j = 0; j < row; ++j) {
                sum += matrix[j][i];
            }

            if(i != col -1) {
                sumArr[iSum --] = (tempSum - sum);  // adding backward
            }
            tempSum = sum;
            i--;
        }
        return sumArr;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}