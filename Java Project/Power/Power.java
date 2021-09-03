import java.util.*;
public class Power{

    public static void main(String[] args) {
        long x;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base ");
        x=sc.nextLong();
        System.out.println("Enter exponent ");
        n=sc.nextInt();
        long result = exponentiation(x, n);

        System.out.printf("%d^%d = %d\n", x, n, result);
    }

    public static long exponentiation(long x, int n) {
        if (n != 0)
            return (x * exponentiation(x, n - 1));
        else
            return 1;
    }
}