import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFromDataStream {
    Queue<Integer> minHeap = new PriorityQueue<>();
    Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    boolean even = true;

    public void addNum(int num) {
        if (even) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        even = !even;
    }

    public double findMedian() {
        if (even) {
            return 1.0 * (minHeap.peek() + maxHeap.peek()) / 2;
        }
        return maxHeap.peek();
    }
}
