 /* Write a program to check if a given integer number is Positive, Negative, or Zero. */

 public class code_2_1{
     public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        if(n > 0){
            System.out.println("Positive");
        }
        if(n < 0){
            System.out.println("Negative");
        }
        if(n == 0){
            System.out.println("Zero");
        } 
     }
 } 