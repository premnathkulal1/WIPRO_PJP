/*Write a program to check if a given integer number is odd or even.*/

public class code_2_2{
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        if((n % 2) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
} 