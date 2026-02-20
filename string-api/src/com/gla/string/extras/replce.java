package JavaString.extras;

    import java.util.Scanner;
public class replce {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String oldWord=sc.nextLine();
            String newWord=sc.nextLine();
            String[] w=s.split(" ");
            String r="";
            for(int i=0;i<w.length;i++){
                if(w[i].equals(oldWord))r=r+newWord;
                else r=r+w[i];
                if(i<w.length-1)r=r+" ";
            }
            System.out.println(r);

    }

}
