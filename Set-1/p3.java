import java.util.Scanner;

public class Three {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n=sc.nextInt();
        boolean isEven=true;
        if(n%2!=0){
            isEven=false;
        }
        System.out.println(isEven?"Even":"Odd");
    }
}

