import java.util.*;
public class first {

    public static void main(String[] args) {
        int a=12 , b=13;
        System.out.println("Before swap");
        System.out.println("first Number:"+a);
        System.out.println("Second Number:" +b);

        int temporary = a;
        a = b;
        b = temporary;

        System.out.println("After swap");
        System.out.println("First Number = " +a);
        System.out.println("second Number:" +b);
    }
}