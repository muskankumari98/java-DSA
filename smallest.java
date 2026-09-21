

public class smallest  {
    public static int getsmallest(int numbers[]){
        //int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
           // if(largest < numbers[i]){
               // largest = numbers[i];
            
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
    
       // System.out.println("smallest no is" +smallest);
        return smallest;
    }
       public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6};
        int smallest = getsmallest(numbers);
        System.out.println("smallest value is: " + smallest);
       }
    }
    
    //return largest;


