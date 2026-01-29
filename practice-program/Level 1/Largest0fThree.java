import java.util.Scanner; 
public class  Largest0fThree{
	public static void main(String[] args){
/*for(int i = 1;i<=3;i++){
			System.out.println("enter the first number :");
			System.out.println("enter the Second number :");
			System.out.println("enter the Third number :");*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  first number :");
		int num1  = sc.nextInt();
		System.out.println("Enter the second number :");
		int num2  = sc.nextInt();
		System.out.println("Enter the third number :");
		int num3  = sc.nextInt();
		
		
		if(num1>num2 && num1>num3){
			System.out.println("num1 is the largest number :"+num1);
		}
		else if (num2>num1 && num2>num3){
			System.out.println("num2 is the largest number : "+num2);
		}
		else {
			System.out.println("num3 is the largest number : "+num3);
		}
	}
}
		
		
			
			
			
		
		
		
	
		

		