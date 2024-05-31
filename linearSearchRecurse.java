import javax.sound.sampled.Line;

class linearSearchRecurse {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int key = 6;

        if (LinearSearch(arr, key, 0) == 0) {
            System.out.println("Key is not there in the array ");
        } else

            System.out.println("Found at position " + LinearSearch(arr, key, 0));

    }

    static int LinearSearch(int arr[], int key, int i) {
        if (i == arr.length)
            return 0;

        if (key == arr[i])
            return i;
        return LinearSearch(arr, key, i + 1);
    }

}
