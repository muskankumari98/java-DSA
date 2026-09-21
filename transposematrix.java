public class transposematrix {
    public static int[][]transposematrix(int matrix[][]){
       int  row=2;
       int  col=3;


       int transpose[][]=new int[col][row];
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            transpose [j][i]= matrix[i][j];
        }
    }
    return transpose;  
}


public static void main(String args[]){
    int matrix[][]={{2,3,7},
                    {5,6,7}};
    int [][]transpose=transposematrix(matrix);
    for(int i=0;i<transpose.length;i++){
        for(int j=0;j<transpose[i].length;j++){
System.out.println(transpose[i][j]+" ");
        }
    System.out.println();
      


      
      
    }

    
    }

    


}