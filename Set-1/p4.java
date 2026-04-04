import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three numbers : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The largest number between " + a + "," +b + " and " + c + " is: " + Math.max(a, Math.max(b, c)));
    }
}
