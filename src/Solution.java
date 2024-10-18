import java.util.*;
import java.io.*;
class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int count = 0;
        Node current = head;

        // Traverse the linked list until we reach the end
        while (current != null) {
            count++; // Increment the count for each node
            current = current.next; // Move to the next node
        }

        return count; // Return the total count of nodes
    }

    public static void main(String[] args) {
        // Create nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // Create Solution object and call the getCount method
        Solution solution = new Solution();
        int count = solution.getCount(head);

        // Print the count
        System.out.println("Count of nodes is: " + count);
    }
}
