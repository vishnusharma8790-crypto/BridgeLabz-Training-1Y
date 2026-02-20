package JavaString.extras;
    import java.util.Scanner;
    public class toggle{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String r="";
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch>='A'&&ch<='Z')r=r+(char)(ch+32);
                else if(ch>='a'&&ch<='z')r=r+(char)(ch-32);
                else r=r+ch;
            }
            System.out.println(r);
        }
    }


