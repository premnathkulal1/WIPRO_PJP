/* Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 

Example1)
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

Example2)
If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 

[Note: It is mandatory to pass two arguments in command line] */

public class code_1_1{
	public static void main(String args[]){
		String company_name = args[0];
		String company_location = args[1];

		if(company_name.equals("Wipro") && company_location.equals("Bangalore")){
			System.out.println("Wipro Technologies Bangalore");
		}
		else if(company_name.equals("ABC") && company_location.equals("Mumbai")){
			System.out.println("ABC Technologies Mumbai");
		}
	}
}
