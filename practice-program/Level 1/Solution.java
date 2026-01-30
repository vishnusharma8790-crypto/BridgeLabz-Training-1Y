// User function Template for Java
import java.util.Scanner;
class Solution {
    public static void main (String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if(number % 3 == 0){
            System.out.println("Fizz");
        }
        else if(number % 5 == 0)
            System.out.print("Buzz");
            
        
          else if(number % 15 == 0)
            System.out.print("FizzBuzz");  
          
          else{
              System.out.print("this is not related number");  
          } 
          
        }
}
