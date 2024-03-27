import java.util.PriorityQueue;

public class KthLargestElement {

    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        return pq.poll();
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 78, 90, 45, 23, 67};
        int k = 3;

        int kthLargestElement = findKthLargest(arr, k);
        System.out.println("The " + k + "th largest element in the array is: " + kthLargestElement);
    }
}