import java.util.Scanner;

class bubbleSortRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the array size : ");
        // int n = sc.nextInt();

        int[] arr = { 1, 3, 4, 2, 6, 9, 5 };
        for (int ele : arr) {
            System.out.print(ele + "-->");
        }
        System.out.println();
        System.out.println("Sorted array is : ");

        sort(arr.length - 1, 0, arr);
        for (int i : arr) {
            System.out.print(i + "-->");
        }
        // System.out.println("The arr");
        // System.out.println();

    }

    static void sort(int r, int c, int arr[]) {
        int temp;

        if (r == 0)
            return;

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;

            }
            sort(r, c + 1, arr);
        } else
            sort(r - 1, 0, arr);

    }
}
