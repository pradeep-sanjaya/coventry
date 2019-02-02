using System;

namespace algorithms
{
	public class MultiDimensionArray
	{
		public MultiDimensionArray ()
		{
		}

		public void test()
		{
			int [,] array = new int[,] {{1, 2, 3}, {4, 5, 6}};

			for (int cou1 = 0; cou1 < 2; cou1++) {

				Console.WriteLine ("Row {0}", cou1);

				for (int cou2 = 0; cou2 < 3; cou2++) {
					Console.WriteLine(array[cou1, cou2]);
				}
			}
		}
	}
}

