// most important for interview question
// neccesary to understand clearly
public class Rainwater {
    public static int TrappingRainwater(int numbers[]){
        int n = numbers.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = numbers[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(numbers[i], leftMax[i-1]);
        }

        rightMax[n-1] = numbers[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(numbers[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            //important formula
            trappedWater += Math.min(leftMax[i], rightMax[i]) - numbers[i];
        }
        return trappedWater;    
    }

public static void main(String args[]){
    int numbers[] = {4,2,0,6,3,2,5};
    int trappedWater = TrappingRainwater(numbers);
    System.out.println("Trapped water: " + trappedWater);
}
}
//T(n) = O(n) and S(n) = O(n) for leftmax and rightmax 
// Trapped water=(waterlevel-height)* width
//              = (min(leftmax,rightmax)-height)*1