package DAA_FINAL;


import java.util.*;

class GFG {

	static int binomialCoeff(int n, int k)
	{

		// Base Cases
		if (k > n)
			return 0;
		if (k == 0 || k == n)
			return 1;

		return binomialCoeff(n - 1, k - 1)
			+ binomialCoeff(n - 1, k);
	}

	public static void main(String[] args)
	{
		int n = 5, k = 2;
		System.out.printf("Value of C(%d, %d) is %d ", n, k,
						binomialCoeff(n, k));
	}
}


