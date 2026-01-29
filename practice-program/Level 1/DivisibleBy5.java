import java.util.Scanner; 
public class  DivisibleBy5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int  num = sc.nextInt();
		int  divide = num/5;
		if(num%5==0){
			System.out.println("the number is divisible by 5 :"+divide);
		}
		else{
			System.out.println("the number is not divisible by 5");
		}
	}
}
			
		
	
			
			
			
			
			
			
			
		
		
		
	
		

		