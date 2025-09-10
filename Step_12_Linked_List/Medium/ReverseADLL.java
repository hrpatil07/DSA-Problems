package Step_12_Linked_List.Medium;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Solution {
    public Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = null;
        Node current = head;

        // Swap prev and next for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // move left since swapped
        }
        // New head will be the last processed node
        return temp.prev;
    }
}

public class ReverseADLL {
    // Utility to print DLL
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create DLL: 1 <-> 2 <-> 3 <-> 4 <-> 5
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("Original list:");
        printList(head);

        Solution sol = new Solution();
        Node newHead = sol.reverse(head);

        System.out.println("Reversed list:");
        printList(newHead);
    }
}
