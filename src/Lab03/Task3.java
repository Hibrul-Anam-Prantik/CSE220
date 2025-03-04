package Lab03;

// Task 03: Row Rotation Policy of BRACU Classroom
class Task3{

    //Complete this method so that it gives the Expected Output
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){

        int row = matrix.length, col = matrix[0].length;
        String[][] tempMatrix = new String[row][col];
        // shift the values and arrange the seats
        for(int i = 0; i < col; ++i) {
            for(int j = 0; j < row; ++j ) {
                int k = (j + examWeek - 1) % row;
                // Inserting the arranged values to the tempMatrix
                tempMatrix[k][i] = matrix[j][i];
            }
        }
        // updating the matrix according to the tempMatrix
        matrix = tempMatrix;
        // printing the seat plan
        Integer rowNum = 0;
        for(int i = 0; i < row; ++i) {
            System.out.print("|");
            for(int j = 0; j < col; ++j) {
                String str = matrix[i][j];
                if(str.length() == 1) {
                    System.out.print(" " + matrix[i][j] + "  |");
                } else {
                    System.out.print(" " + matrix[i][j] + " |");
                }
                if(matrix[i][j].equals("AA")) {
                    rowNum = i + 1;  // adding 1 to avoid the 0-index term
                }
            }
            System.out.println();
        }
        return rowNum;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}