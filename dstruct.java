package RIO;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import RIO.Noding.Node;

public class dstruct {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose Data Structure");
		System.out.println("1. Stack");
		System.out.println("2. Queue");
		System.out.println("3. Linked List");
		System.out.println("4. Circular Linked List");
		System.out.println("Enter choice:");
		String choice = scan.nextLine();

		switch (choice) {
		case "1":
			Stack<Integer> stack = new Stack<>();
			while (true) {
				System.out.println("-Stack-Operations-");
				System.out.println("Choose Operation:");
				System.out.println("1. Push");
				System.out.println("2. Pop");
				System.out.println("3. Display");
				System.out.println("4. Exit");
				System.out.println("Enter choice:");
				String choices = scan.nextLine();
				switch (choices) {
				case "1":
					System.out.println("Enter value to push:");
					try {
						int value = scan.nextInt();
						stack.push(value);
						System.out.println(value + " pushed to stack.");
					} catch (java.util.InputMismatchException e) {
						System.out.println("Invalid input. Please enter an integer.");
					}
					scan.nextLine();
					break;
				case "2":
					if (!stack.isEmpty()) {
						int poppedValue = stack.pop();
						System.out.println(poppedValue + " popped from stack.");
					} else {
						System.out.println("Stack is empty. Cannot pop.");
					}
					break;
				case "3":
					System.out.println("Current stack: " + stack);
					break;
				case "4":
					System.out.println("Exiting Stack operations.");
					return;
				default:
					System.out.println("Invalid choice. Please choose again.");
					break;
				}
				System.out.println();
			}

		case "2":
			Queue<String> queue = new LinkedList<>();
			while (true) { 
				System.out.println("-Queue-Operations-");
				System.out.println("Choose Operation:");
				System.out.println("1. Enqueue"); 
				System.out.println("2. Dequeue");
				System.out.println("3. Display");
				System.out.println("4. Exit");
				System.out.println("Enter choice:");
				String choices = scan.nextLine();
				switch (choices) {
				case "1":
					System.out.println("Enter a string to enqueue:");
					String valueToAdd = scan.nextLine();
					queue.add(valueToAdd);
					System.out.println("'" + valueToAdd + "' enqueued to the queue.");
					break;
				case "2":
					if (!queue.isEmpty()) {
						String removedValue = queue.poll();
						System.out.println("'" + removedValue + "' dequeued from the queue.");
					} else {
						System.out.println("Queue is empty. Cannot dequeue.");
					}
					break;
				case "3":
					System.out.println("Current queue: " + queue);
					break;
				case "4":
					System.out.println("Exiting Queue operations.");
					return;
				default:
					System.out.println("Invalid choice. Please choose again.");
					break;
				}
				System.out.println();
			}
		case "3":
		    Node head = null;
		    while (true) {
		        System.out.println("-Linked-List-Operations-");
		        System.out.println("Choose Operation:");
		        System.out.println("1. Add to end");
		        System.out.println("2. Delete from beginning");
		        System.out.println("3. Display");
		        System.out.println("4. Exit");
		        System.out.println("Enter choice:");
		        String listChoice = scan.nextLine();
		        
		        switch (listChoice) {
		            case "1":
		                System.out.println("Enter value to add:");
		                try {
		                    int value = scan.nextInt();
		                    scan.nextLine();
		                    Node newNode = new Node(value);
		                    if (head == null) {
		                        head = newNode;
		                    } else {
		                        Node current = head;
		                        while (current.next != null) {
		                            current = current.next;
		                        }
		                        current.next = newNode;
		                    }
		                    System.out.println(value + " added to the list.");
		                } catch (java.util.InputMismatchException e) {
		                    System.out.println("Invalid input. Please enter an integer.");
		                    scan.nextLine();
		                }
		                break;
		            case "2":
		                if (head != null) {
		                    int removedValue = head.data;
		                    head = head.next;
		                    System.out.println(removedValue + " deleted from the list.");
		                } else {
		                    System.out.println("List is empty. Cannot delete.");
		                }
		                break;
		            case "3":
		                System.out.print("Current Linked List: ");
		                if (head == null) {
		                    System.out.println("Empty");
		                } else {
		                    Node current = head;
		                    while (current != null) {
		                        System.out.print(current.data + " -> ");
		                        current = current.next;
		                    }
		                    System.out.println("null");
		                }
		                break;
		            case "4":
		                System.out.println("Exiting Linked List operations.");
		                return;
		            default:
		                System.out.println("Invalid choice. Please choose again.");
		                break;
		        }
		        System.out.println();
		    }

		case "4":
		    Node headCLL = null;
		    while (true) {
		        System.out.println("-Circular-Linked-List-Operations-");
		        System.out.println("Choose Operation:");
		        System.out.println("1. Add to end");
		        System.out.println("2. Delete from beginning");
		        System.out.println("3. Display");
		        System.out.println("4. Exit");
		        System.out.println("Enter choice:");
		        String cllChoice = scan.nextLine();
		        
		        switch (cllChoice) {
		            case "1":
		                System.out.println("Enter value to add:");
		                try {
		                    int value = scan.nextInt();
		                    scan.nextLine();
		                    Node newNode = new Node(value);
		                    if (headCLL == null) {
		                        headCLL = newNode;
		                        newNode.next = headCLL;
		                    } else {
		                        Node current = headCLL;
		                        while (current.next != headCLL) {
		                            current = current.next;
		                        }
		                        current.next = newNode;
		                        newNode.next = headCLL;
		                    }
		                    System.out.println(value + " added to the list.");
		                } catch (java.util.InputMismatchException e) {
		                    System.out.println("Invalid input. Please enter an integer.");
		                    scan.nextLine();
		                }
		                break;
		            case "2":
		                if (headCLL != null) {
		                    int removedValue = headCLL.data;
		                    if (headCLL.next == headCLL) {
		                        headCLL = null; // List becomes empty
		                    } else {
		                        Node last = headCLL;
		                        while (last.next != headCLL) {
		                            last = last.next;
		                        }
		                        headCLL = headCLL.next;
		                        last.next = headCLL;
		                    }
		                    System.out.println(removedValue + " deleted from the list.");
		                } else {
		                    System.out.println("List is empty. Cannot delete.");
		                }
		                break;
		            case "3":
		                System.out.print("Current Circular Linked List: ");
		                if (headCLL == null) {
		                    System.out.println("Empty");
		                } else {
		                    Node current = headCLL;
		                    do {
		                        System.out.print(current.data + " -> ");
		                        current = current.next;
		                    } while (current != headCLL);
		                    System.out.println("(goes back to " + headCLL.data + ")");
		                }
		                break;
		            case "4":
		                System.out.println("Exiting Circular Linked List operations.");
		                return;
		            default:
		                System.out.println("Invalid choice. Please choose again.");
		                break;
		        }
		        System.out.println();
		    }
		default:
			System.out.println("Invalid choice. Please choose a valid data structure.");
			break;
		}
		scan.close();
	}
}