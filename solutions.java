public class solutions {
    public static void solutions(int array[][]){
        int sum=0;
            for(int j=0;j<array[0].length;j++){
                sum+=array[1][j];
         
            }
            System.out.println("sum is :"+sum);
        }


        public static void main(String[] args) {
            int nums[][]={{1,4,9},
                          {11,4,3},
                          {2,2,3}};
               solutions(nums);
          }
        }  
    


