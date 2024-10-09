public class QuickSort {

  // Function to perform quicksort
  public static void quickSort(int[] arr, int low, int high) {
      if (low < high) {
          // Partition the array around a pivot
          int pivotIndex = partition(arr, low, high);
          
          // Recursively sort the elements before and after partition
          quickSort(arr, low, pivotIndex - 1);
          quickSort(arr, pivotIndex + 1, high);
      }
  }

  // Partition function
  public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];  // give any position to pivot arr[mid], arr[slow]

    // Right now we dont if any element is smaller than pivot
    int s = low - 1;

    // high becuase last element is already pivot no need to check
    // if pivot was in mid then we could have used two pointer i and j
    // if pivot was in start than opposite loop i = high, i--

    for (int i = low; i < high; i++) {
          if (arr[i] < pivot) { // if any element smaller than pivot in array
        // make a place for new element
              s++;
        // Swap the postion of older elemnt for smaller element
          int temp = arr[s];
          arr[s] = arr[i];
          arr[i] = temp;   
        }
      //  Debuging for =  {10, 80, 30, 90, 40, 50, 70};

        // 0th check 10 < 70 swaping arr[i] and arr[s] 
        // both 10 so will be on same place and s = 0
        // {10,80,30,90,40,50,70}

        // 1st check 80 > 70 so no swap s = 0;
        // {10,80,30,90,40,50,70}

        // 2nd check 30 < 70 is smaller swap arr[i] = 30 with s = 1
        // so 30 will be place at 1st index , index of s , swap 30 and 80
        // {10,30,90,80,40,50,70}

        // 3rd check 90 > 70 no swap
        // {10,30,80,90,40,50,70}
        
        // 4th check 40 < 70 swap arr[i] = 40 with s = 2
        // so 40 will be placed at 2nd index. swap 80 and 40  
        // {10,30,40,90,80,50,70}
        
        // 5th check 50 < 70  swap arr[i] = 50 with s = 3
        // so 50 will be placed at 3rd and  swap 90 and 50
        // {10,30,40,50,80,90,70}
    }

    // now swap the pivot position to place him at the correct position
    s++; // make place for pivot and remaining position will be of pivot
    int temp = arr[s];
    arr[s] = pivot;
    pivot = temp;

    // s = 4 so pivot will be at 4th 
    // {10,30,40,50,70,80,90}

    // return the index of pivot
    return s;
  }

  public static void main(String[] args) {
      int[] arr = {10, 80, 30, 90, 40, 50, 70};
      int n = arr.length;

      quickSort(arr, 0, n - 1);

      System.out.println("Sorted array:");
      for (int i : arr) {
          System.out.print(i + " ");
      }
  }
}
