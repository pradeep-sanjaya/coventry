using System;

namespace algorithms
{
	public class Node
	{
		private int data;
		private Node next;

		public Node ()
		{
		}

		public Node (int data, Node next)
		{
			this.data = data;
			this.next = next;
		}

		public int Data {
			get {
				return data;
			}
			set{
				data=value;
			}
		}

		public Node Next {
			get {
				return next;
			}
			set{
				next = value;
			}
		}
	}
}

