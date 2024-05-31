import java.util.Scanner;
import java.math.*;

class printReverse {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();

        // System.out.println("Enter the digits of a number : ");
        // int dig = sc.nextInt();

        // int res = fun(n, dig);
        // System.out.println(res);

        System.out.println(dig);

    }

    // int sum = 0;

    static int rev = 0;
    static int dig = DigitReturner(n);

    static int DigitReturner(int n) {
        return (int) (Math.log10(n));
    }

    static int fun(int n, int dig) {
        if (n == 0)
            return rev;
        else {

            int rem = n % 10;
            return (rem * (int) (Math.pow(10, dig - 1))) + fun(n / 10, dig - 1);

        }

    }
}

// logic 1 :
// if(n==0)return rev;else{

// int rem = n % 10;rev=rev*10+rem;return

// fun(n / 10);
// }

// logic 2 :
