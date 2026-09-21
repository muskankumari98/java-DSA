

public class binarysear {
    public static int binarysearch(int numbers[], int key){
        int beg = 0;
        int end = numbers.length - 1;

        while (beg <= end) {
            int mid = (beg + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 8, 10, 12, 18};
        int key = 10;
        int index = binarysearch(numbers, key);
        System.out.println("index for any key is: " + index);
    }
}
