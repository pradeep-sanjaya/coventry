using System;

namespace algorithms
{
	class OneDimensionArray
	{
		public OneDimensionArray() 
		{
		}

		public void test()
		{
			int[] numbers = new int[5];

			numbers[0] = 10;
			numbers[1] = 20;
			numbers[2] = 30;
			numbers[3] = 40;
			numbers[4] = 50;

			for (int cou = 0; cou < 5; cou++) {
				Console.WriteLine (numbers[cou]);
			}
		}
	}
}
