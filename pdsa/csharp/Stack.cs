using System;

namespace algorithms
{
	public class Stack
	{
		Node head;
		public Stack ()
		{
			head = null;
		}

		public void push(int data)
		{
			if (head == null) {
				head = new Node (data, null);
			} else {
				head = new Node (data, head);
			}
		}

		public int pop()
		{
			if (head == null) {
				throw new Exception ("stack is empry");
			} else {
				int data = head.Data;
				head = head.Next;
				return data;
			}
		}

		public int peek()
		{
			return head.Data;
		}

		public void empty()
		{
			head = null;
		}

		public void print()
		{
			Console.WriteLine ("--- stack values ---");

			Node current = head;
			while (current != null) {
				Console.WriteLine(current.Data);
				current = current.Next;

			}
		}
	}
}

