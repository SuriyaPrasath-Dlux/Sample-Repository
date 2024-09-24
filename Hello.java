import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a");
        int a=input.nextInt();
        System.out.println("enter b");
        int b= input.nextInt();
        int c=a*b;
        System.out.println(c);
    }
}
