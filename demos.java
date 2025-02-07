import java.util.Scanner;

public class demos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your first no.");
         int a = sc.nextInt();
        System.out.println("enter your second no.");
        int b = sc.nextInt();
        System.out.println("enter your operator");
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+': System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*' :System.out.println(a*b);
            break;
            case '%': System.out.println(a%b);
            break;
            case '/': System.out.println(a/b);
            break;
            default : System.out.println("wrong operator");
            break;
        }
        
    }
}
