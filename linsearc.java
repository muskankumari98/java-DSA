

public class linsearc 
 { 
    public static int linearsearch(int numbers[], int key){ 
        for(int i =0;i<numbers.length;i++){
            if (numbers[i]==key){
                return i;

            }
        }
        return -1;
    }
    public static void main (String args[]){
int numbers[]={3,5,8,9,20,45};
int key=56;
int index = linearsearch(numbers,key);
if(index==-1){
    System.out.println("Element not found");
}
else{
    System.out.println("Element found at index: " + index);
}
    }
    
 }
