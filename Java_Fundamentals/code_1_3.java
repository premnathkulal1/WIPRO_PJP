/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers

Example1)
C:\>java Sample 10 20
O/P Expected : The sum of 10 and 20 is 30 */

public class code_1_3{
	public static void main(String args[]){
	 	int num_1 = Integer.parseInt(args[0]);
		int num_2 = Integer.parseInt(args[1]);
		int sum = num_1+num_2;
		System.out.println("The sum of "+num_1+" and "+num_2+" is "+sum);
	}
}
