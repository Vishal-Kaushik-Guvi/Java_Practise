public class LinkedListWorking {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    } 

    ListNode head;

    public void addFrist(int val) {
        ListNode newListNode = new ListNode(val);
        if (head == null) {
            head = newListNode;
            return;
        }
        newListNode.next = head;
        head = newListNode;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode store = new ListNode(l1.val + l2.val);
        while(temp1 != null && temp2 != null){
            store.val = temp1.val + temp2.val;
            temp1 = temp1.next;
            temp2 = temp2.next;
            store = store.next;
        }
        return store;
     }

    public void addLast(int val) {
        ListNode newListNode = new ListNode(val);
        if (head == null) {
            head = newListNode;
            return;
        }
        ListNode currListNode = head;
        while (currListNode.next != null) {
            currListNode = currListNode.next;
        }
        currListNode.next = newListNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        ListNode currListNode = head;
        while (currListNode != null) {
            System.out.print(currListNode.val + "->");
            currListNode = currListNode.next;
        }
          System.out.print("Null");
          System.out.println();
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);

        ListNode p1 = head;
        ListNode p2 = slow.next;
        int maxSum = 0;
        while(p2 != null){
         int sum = p1.val + p2.val;
         maxSum = Math.max(maxSum, sum);

         p1 = p1.next;
         p2 = p2.next;
        }
        return maxSum;
    }

    public ListNode removeDuplicate() {
        ListNode temp = head;
        System.out.println(temp.val);
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
              return head; // Intentionally returning null
    }

    public static void main(String[] args) {
        LinkedListWorking list = new LinkedListWorking();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(6);
        list.printList();

        System.out.println("----------------Test-------------------");

        list.head = list.removeDuplicate(); // Assign the return value to head
        list.printList(); // Prints the modified list

    

    }
}    