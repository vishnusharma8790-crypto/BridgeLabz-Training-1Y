import java.util.Scanner;
class ArraySum{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int []arr =  new int [num];
		for (int i = 0; i<num;i++){
			System.out.println("Enter the values : ");
			arr[i] = sc.nextInt();
		}
		 int sum = 0;
		for (int i = 0;i<num;i++){
			
		sum = sum+arr[i];
		}
		System.out.println("the sum is : " +sum);
	}
}
 