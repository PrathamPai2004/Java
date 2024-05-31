import java.util.Scanner;

//This program checks if the number inputted by the user is a palindrome or not 
//input : 121
//output : true
//-->->->->->->->->-
//input : 863
//output : false

public class palindromeNum {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();

        System.out.println(PalindromeReturn(n));

    }

    static int digits(int n) {
        int dig = (int) Math.log10(n) + 1;
        return helper(n, dig);

    }

    static int rev = 0;

    static int helper(int n, int dig) {
        if (n % 10 == n)
            return n;

        else {
            int rem = n % 10;
            return (rem * (int) Math.pow(10, dig - 1)) + helper(n / 10, --dig);

        }
    }

    static boolean PalindromeReturn(int n) {
        return (n == digits(n));
    }
}
