package Lab08;

public class Task04 {
    public static void main(String[] args) {
        int[] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;
        MaxHeap heap = new MaxHeap(nums.length);
        for(int x : nums) {
            heap.insert(x);
        }
        int[] newNums = new int[k];
        for(int i = 0; i < k; ++i) {
            newNums[i] = heap.extractMax();
        }
        System.out.print("[");
        for(int i = 0; i < k; ++i) {
            if(i == k - 1) System.out.println(newNums[i] + "]");
            else System.out.print(newNums[i] + ", ");
        }
    }
}
