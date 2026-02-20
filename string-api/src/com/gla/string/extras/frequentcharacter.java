package JavaString.extras;


    import java.util.Scanner;
public class frequentcharacter {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            int max=0;
            char res=' ';
            for(int i=0;i<s.length();i++){
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j))count++;
                }
                if(count>max){
                    max=count;
                    res=s.charAt(i);
                }
            }
            System.out.println("Most Frequent Character: '"+res+"'");

    }

}
