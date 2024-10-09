public class Queue {
  int[] arr;
  int size;
  int rare = -1;

  Queue(int n) {
      arr = new int[n];
      this.size = n;
  }

  Queue() {
      this(10); // default size if no size is provided
  }

  boolean empty() {
      return rare == -1;
  }

  void add(int data) {
      if (rare == size - 1) {
          System.out.println("Queue is full");
          return;
      }
      rare++;
      arr[rare] = data;
  }

  int remove() {
      if (empty()) {
          System.out.println("Queue is empty");
          return -1;
      }
      int front = arr[0];
      for (int i = 0; i < rare; i++) {
          arr[i] = arr[i + 1]; // Shift elements to the left
      }
      rare--;
      return front;
  }

  int peek() {
      if (empty()) {
          System.out.println("Queue is empty");
          return -1;
      }
      return arr[0];
  }

  public static void main(String[] args) {
      Queue customQueue = new Queue(5); // Example with size 5
      customQueue.add(1);
      customQueue.add(4);
      customQueue.add(7);
      customQueue.add(8);

      while (!customQueue.empty()) {
          System.out.println(customQueue.peek());
          customQueue.remove(); // Remove after peeking
      }
  }
}
