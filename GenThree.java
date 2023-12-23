/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int randomnum1 = (int)(Math.random()*(b-a))+a;
		int randomnum2 = (int)(Math.random()*(b-a))+a;
		int randomnum3 = (int)(Math.random()*(b-a))+a;
		System.out.println(randomnum1);
		System.out.println(randomnum2);
		System.out.println(randomnum3);
		System.out.println("The minimal generated number was " + Math.min(Math.min(randomnum1, randomnum2), randomnum3));
	}
}
