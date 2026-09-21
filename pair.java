
public class pair {
        public static int printpairs (int numbers[]){

     int tp=0;

for(int i=0;i<numbers.length;i++){
     int current=numbers[i];
     for(int j=i+1;j<numbers.length;j++){
        tp++;
        System.out.print("("+current+","+numbers[j]+")");
     }
     System.out.println();
    }
     return tp;
    }
    public static void main(String args[]){
        int numbers[]={2, 4, 8, 10, 12, 18};
       int tp= printpairs(numbers);
        System.out.println("Total pairs: " + tp);
      
    }



}