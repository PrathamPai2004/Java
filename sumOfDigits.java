import java.util.Scanner;

class sumOfDigits {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();

        int SumRes = SumReturn(n);
        System.out.println("The result is " + SumRes);

        int ProdRes = ProdReturn(n);
        System.out.println("The result is " + ProdRes);

    }

    static int SumReturn(int n) {
        if (n == 0)
            return 1;
        else
            // return SumReturn(n / 10) + n % 10;
            return n % 10 + SumReturn(n / 10);
    }

    int prod = 1;

    static int ProdReturn(int n) {
        if (n == 0)
            return 1;
        else
            // return SumReturn(n / 10) + n % 10;

            return n % 10 * ProdReturn(n / 10);
    }
}
