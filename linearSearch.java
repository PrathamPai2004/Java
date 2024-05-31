import java.util.Scanner;

class method {
    int Linear(int arr[], int j, int n, int key) {
        if (j >= n)
            return -1;
        if (arr[j] == key) {
            return j;
        } else
            return Linear(arr, j + 1, n, key);
    }

}

class linearSearch {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nThe elements : ");
        for (int i : arr) {
            System.out.print(i + "-->");
        }
        System.out.println("\nEnter the key element : ");
        int key = sc.nextInt();

        method m = new method();
        if (m.Linear(arr, 0, n, key) == -1) {
            System.out.println("Key not found ");
        } else {
            System.out.println("Key found at index " + m.Linear(arr, 0, n, key));
        }

    }
}
