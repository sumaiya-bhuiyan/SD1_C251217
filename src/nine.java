import java.util.Scanner;
public class nine {
    public static void main(String[]args){
    Scanner helper=new Scanner(System.in);
    String st=helper.nextLine();
    int v=0,c=0;
    for(int i=0;i<st.length();i++){
        char ch=st.charAt(i);
        if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        { v++;
            }
    else c++;}
    
    System.out.println("vowels:"+v);
     System.out.println("consonants:"+c);
}
}