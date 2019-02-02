using System;
using System.Threading;

namespace algorithms
{
	public class ThreadHandling
	{
		public ThreadHandling ()
		{
		}

		public void thread1Start()
		{
			Console.WriteLine ("Child thread start");

			for (int cou = 0; cou <= 50; cou++) 
			{
				try {
					Console.WriteLine ("Thread 1 : {0}", cou);
					//Console.WriteLine ("Child thread paused for {0} seconds", 500/1000);
					Thread.Sleep (200);
					//Console.WriteLine ("Child thread resumes");
				} catch (ThreadAbortException e) {
					Console.WriteLine (e.Message);
				} finally {
					Console.WriteLine ("Could not catch");
				}
			}

		}

		public void thread2Start()
		{
			Console.WriteLine ("Child thread start");

			for (int cou = 0; cou <= 50; cou++) 
			{
				Console.WriteLine ("Thread 2 : {0}", cou);
				//Console.WriteLine ("Child thread paused for {0} seconds", 1000/1000);
				Thread.Sleep (1000);
				//Console.WriteLine ("Child thread resumes");
			}

		}

		public void createThread()
		{
			ThreadStart reference1 = new ThreadStart (thread1Start);

			Console.WriteLine ("Creating thread1");
			Thread child1 = new Thread (reference1);
			child1.Start ();

			ThreadStart reference2 = new ThreadStart (thread2Start);
			Console.WriteLine ("Creating thread2");
			Thread child2 = new Thread (reference2);
			child2.Start ();

			Thread.Sleep (1000);
			child1.Abort ();

			Console.ReadKey ();
		}
			
	}
}

