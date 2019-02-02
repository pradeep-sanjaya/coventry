using System;

namespace algorithms
{
	public class MainClass
	{

		public static void Main (string[] args)
		{
			Console.WriteLine ("Linked List methods - add");
			Console.WriteLine ("\nAdd 10, 20, 30 to Linked List");

			Console.WriteLine ("add 10, 20, 30");
			LinkedList list = new LinkedList ();
			list.add (10);
			list.add (20);
			list.add (30);
			list.print ();


			Console.WriteLine ("\n\nStack methods - push, pop, peek, empty");
			Console.WriteLine ("\nPush 10, 20, 30 to stack");

			Stack stack = new Stack ();
			stack.push (10);
			stack.push (20);
			stack.push (30);
			stack.print ();

			Console.WriteLine("\nPop a value from stack");
			Console.WriteLine("poped value: " + stack.pop());

			Console.WriteLine("\nPeep a value from stack");
			Console.WriteLine("peek value: " + stack.peek());

			stack.print ();

			Console.WriteLine ("\nCall stack empty");
			stack.empty();
			stack.print ();


			Console.WriteLine ("\n\nQueue methods - add, poll, peek, remove");
			Console.WriteLine ("\nAdd 10, 20, 30 to queue");

			Queue queue = new Queue ();
			queue.add (10);
			queue.add (20);
			queue.add (30);
			queue.print ();

			Console.WriteLine("\nPoll a value from queue");
			Console.WriteLine ("poll value: " + queue.poll());

			Console.WriteLine("\nPeek a value from queue");
			Console.WriteLine ("peek value: " + queue.peek());

			queue.print ();

			Console.WriteLine ("\nCall queue remove");
			queue.remove ();
			queue.print ();
		}
	}
}

