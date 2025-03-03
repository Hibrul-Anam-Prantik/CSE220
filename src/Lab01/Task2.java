package Lab01;

//Task 02: Container with Most Water
class Task2{
    public static void mostWater( Integer[] height ){
        int maxA = 0, left = 0, right = height.length - 1;

        while(left < right) {
            int A;    // Current Area
            if(height[left] < height[right]) {
                A = height[left] * (right - left);  // length = right - left
                left ++;
            } else {
                A = height[right] * (right - left);
                right --;
            }
            if(A > maxA) {
                maxA = A;
            }
        }
        System.out.println(maxA);
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	    System.out.print("\nYour Output:\n");
        mostWater( array );
    }
}
