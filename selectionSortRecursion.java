import java.util.Scanner;

class selectionSortRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements : ");
        readArray(arr, n);
        System.out.println("Array before sorting : ");
        printArray(arr);
        System.out.println("Array after sorting : ");
        selection(arr, n, 0, 0);
        printArray(arr);

    }

    static void selection(int arr[], int r, int c, int max) {
        if (r == 0)
            return;
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else
                selection(arr, r, c + 1, max);
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }

    }

    static void readArray(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void printArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-->");
        }
    }

}