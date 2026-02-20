package JavaString.extras;

    import java.util.Scanner;
    public class remove{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char ch=sc.next().charAt(0);
            String r="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=ch)r=r+s.charAt(i);
            }
            System.out.println("Modified String: \""+r+"\"");
        }


}
