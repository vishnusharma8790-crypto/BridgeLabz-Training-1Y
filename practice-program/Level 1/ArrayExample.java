import java.util.Scanner;
public class ArrayExample{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int marks[] = {12,14,16,18,20};
		System.out.println(marks[1]);
		System.out.println("Update array elements : ");
		
		for (int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
		System.out.println("Enter your element");
		int m = sc.nextInt();
		for(int i = 0;i<marks.length;i++){
			if(marks[i]==m){
				System.out.println("Number found at index :" +i);
			}
		}
	}
}