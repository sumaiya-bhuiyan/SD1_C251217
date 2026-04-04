import java.util.Scanner;

public class five {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        float a = sc.nextFloat();
        char sign = sc.next().charAt(0);
        float b = sc.nextFloat();
        float result = 0;

        switch(sign){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
        }

        System.out.println(result);
    }
}
