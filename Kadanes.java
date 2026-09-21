public class Kadanes {
    public static int kadanes(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currsum = currsum + numbers[i];
           
            if (currsum < 0) {
                currsum = 0;
            }
             maxsum = Math.max(currsum, maxsum);
        }

        System.out.println("maxsum: " + maxsum);
        return maxsum;
    }
    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, -2, 5};
        kadanes(numbers);
    }
}
