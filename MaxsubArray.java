 public class Maxsubarray {
    
   public static int maxsubarray(int numbers[]){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
       int start=i;
        for(int j=i;j<numbers.length;j++){
    int end=j;
            currsum=0;
            for(int k=i;k<=j;k++){
                currsum+=numbers[k];
            }
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
             return maxsum;
    }
    
    
    public static void main(String args[]){
        int numbers[]={1,2,3,-2,5};
        int maxsum=maxsubarray(numbers);
        System.out.println("max sum is: "+maxsum);

   } 
}
 