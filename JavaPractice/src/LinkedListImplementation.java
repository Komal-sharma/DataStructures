import java.util.Scanner;


class Node{
	int value;
	Node next;
	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}



}
class LinkedList{
	Node head;
	public void insert(int value) {
		Node temp = new Node();
		temp.value=value;
		if(head == null) {
			head =temp;
		}else {
			Node n= head;
			while(n.next!=null)
				n=n.next;
			n.next=temp;

		}
	}

	public void show() {
		Node start = head;
		while(start.next!=null) {
			System.out.print(start.value+",");
			start = start.next;
		}

		System.out.print(start.value);
	}

	public void insertAt(int value,int index) {
		Node node = new Node();
		node.value=value;
		Node temp = head;
		if(index== 0)
			insertAtStart(value);
		else {
			while(index-1>0) {
				temp = temp.next;
				index--;
			}
			//System.out.println(temp);
			node.next = temp.next;
			temp.next =node;
		}


	}

	public void insertAtStart(int value) {
		Node node = new Node();
		node.value=value;		
		node.next=head;
		head =node;
	}
	public void delete(int value) {
		Node temp = head;
		Node prev=head;
		while(temp.next!=null) {
			if(temp.value ==value) {
				prev.next = temp.next;
				break;
			}else {
				prev = temp;
				temp = temp.next;
			}
		}
	}
	public void deleteAt(int index) {
		Node temp = head;

		if(index==0) {
			head = head.next;
		}else {
			while(index-1>0) {
				temp = temp.next;
				index--;
			}
			//		/System.out.println(temp);
			temp.next =temp.next.next;
		}
	}

}
public class LinkedListImplementation {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(13);
		list.insert(9);


		list.insertAtStart(77);
		list.insertAtStart(88);

		list.insertAt(44, 1);

		list.show();
		System.out.println();
		list.delete(13);

		list.show();
		System.out.println();

		list.deleteAt(4);
		list.show();


	}

}
