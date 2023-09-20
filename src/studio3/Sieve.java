package studio3;

import java.util.Scanner;

public class Sieve {
public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	System.out.println("Which max value would you like to find the prime numbers of?");
	int n = in.nextInt();
	boolean[] numbers = new boolean[n+1];
	for (int i = 2; i<=n; i++)
	{
		for (int j = 2; j<=(n/i); j++)
		{
			numbers[i*j] = true;
		}
		if (numbers[i]== false) {
			System.out.println(i);
		}
	}
}
}
