import java.util.Scanner;

public class eight {
    public static void main(String[]args){
        Scanner helper=new Scanner(System.in);
        System.out.print("Enter a String :");
        String st=helper.nextLine();
        int l=0;int r=st.length()-1;
        boolean pal=true;
        while(l<r){
            if(st.charAt(l)!=st.charAt(r))
            {pal=false;
            break;}
            l++;
            r--;
        }
        if(pal==true){
            System.out.print("Palindrome");
        }
        else System.out.print("Not Plindrome:");
    }
}
