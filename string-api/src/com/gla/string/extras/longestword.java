package JavaString.extras;

    import java.util.Scanner;
public class longestword {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String[] am=s.split(" ");
            String longest="";
            for(int i=0;i<am.length;i++){
                if(am[i].length()>longest.length())
                    longest=am[i];
            }
            System.out.println(longest);
        }


}
