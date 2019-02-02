using System;

namespace algorithms
{
	public class ExceptionHandling
	{
		public void tryCatchTest() {
			try {
				int[] numbers = new int[1];
				Console.Write(numbers[10]);
			} catch (Exception e) {
				Console.WriteLine(e.Message);
			}
		}
	}

}

