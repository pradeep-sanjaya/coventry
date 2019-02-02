using System;

namespace algorithms
{
	public class DoublyNode
	{
		private int data;
		private DoublyNode next;
		private DoublyNode prev;

		public DoublyNode ()
		{
		}

		public DoublyNode (int data, DoublyNode next, DoublyNode prev)
		{
			this.data = data;
			this.next = next;
			this.prev = prev;
		}

		public int Data {
			get {
				return data;
			}
			set{
				data=value;
			}
		}

		public DoublyNode Next {
			get {
				return next;
			}
			set{
				next = value;
			}
		}

		public DoublyNode Prev {
			get {
				return prev;
			}
			set{
				prev = value;
			}
		}
	}

	public class Queue
	{
		DoublyNode head;
		DoublyNode tail;

		public Queue ()
		{
			head = null;
		}

		public void add(int data)
		{
			if (head == null) {
				head = new DoublyNode(data, null, null);
				tail = head;
			} else {
				DoublyNode node = new DoublyNode (data, null, tail);
				tail.Next = node;
				tail = node;
			}
		}

		public void remove()
		{
			head = null;
			tail = null;
		}

		public int poll()
		{
			int data = head.Data;
			head = head.Next;
			return data;
		}

		public int peek()
		{
			return head.Data;
		}

		public void print()
		{
			Console.WriteLine ("--- queue values ---");
			DoublyNode current = head;
			while (current != null) {
				Console.WriteLine(current.Data);
				current = current.Next;
			}
			Console.WriteLine ("--------------------");
		}
	}
}

