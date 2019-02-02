using System;

namespace algorithms
{
	public class LinkedList
	{
		Node head;
		public LinkedList ()
		{
			head = null;
		}

		public void add(int data)
		{
			if (head == null) {
				head = new Node (data, null);
			} else {
				Node current = head;
				while (current.Next != null) {
					current = current.Next;
				}

				current.Next = new Node (data, null);
			}
		}

		public void print()
		{
			Node current = head;
			while (current != null) {
				Console.WriteLine(current.Data);
				current = current.Next;

			}
		}
	}
}

