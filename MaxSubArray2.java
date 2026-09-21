public class MaxSubArray2 {
    public static int maxsubarray2(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prfix[] = new int[numbers.length];
        prfix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prfix[i] = prfix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                //important line
                currsum = (i == 0) ? prfix[j] : prfix[j] - prfix[i - 1];
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, -2, 5};
        int maxsum = maxsubarray2(numbers);
        System.out.println("max sum is: " + maxsum);
    }
}


