public class diagonalsum {
    public static int diagonalsum(int matrix[][]){
        //n*m
        //n=m
        //O(n^2)                                     
         int sum=0;

        // for(int i=0;i<matrix.length;i++){
        //   for(int j=0;j<matrix[0].length;j++){
        //    if(i==j){
        //            sum+=matrix[i][j];
        //
        //       }hhhhhhhhj                                                                              
        //        else if(i+j==matrix.length-1){
        //            sum+=matrix[i][j];
        //        }
        //    }
       //  }
                                    


       //O(n)
       for(int i=0;i<matrix.length;i++){
        //primary digonal(pd)
        sum+=matrix[i][i];
        //secondary diagonal(sd)
        if(i!=matrix.length-1-i){
            sum+=matrix[i][matrix.length-1-i];
        }
       }
   
         
       return sum;


    }
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
             System.out.println(diagonalsum(matrix));



    
                           
    }
}
                            