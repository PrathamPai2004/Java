import java.util.Scanner;

class patternPrint {
    int r;
    int c;

    patternPrint(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public static void pattern(int r, int c) {
        if (r == 0)
            return;

        if (c < r) {
            System.out.print("*");
            pattern(r, c + 1);
        }

        else {
            System.out.println();
            pattern(r - 1, 0);
            // System.out.println();
        }

    }
}

class printingStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial number : ");
        int stars = sc.nextInt();
        patternPrint p = new patternPrint(stars, 0);
        p.pattern(stars, 0);
        // System.out.println("*");
    }
}