import java.util.*;
public class Volumeofcylinder{
	public static void main(String[] args){
		Scanner sc= new Scannner(System.in);
		int radius = sc.nextInt();
		int height = sc.nextInt();
		
		double volume = 3.14*radius*radius*height;
		System.out.println(volume);
		
		