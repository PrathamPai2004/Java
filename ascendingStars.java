import java.util.Scanner;

class ascendingStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stars : ");
        int stars = sc.nextInt();

        pattern(stars, stars, stars);

    }

    static void pattern(int r, int c, int stars) {
        if (r == 0)
            return;

        if (r <= c) {
            System.out.print("*");
            pattern(r, c - 1, stars);
        } else {
            System.out.println();
            pattern(r - 1, stars, stars);
        }
    }
}
