public class staircasesearch { 
    public static boolean staircasesearch(int matrix[][],int key){

        //staircase search(seedhi ki tarah)
        //O(n+m)

        //m=row=i;
        //n=column=j;


        //(0,m-1)
        //key<cell value
        // left

        //key>cellvalue
        //bottom



        //(n-1,0)
        //key<cell
        //top

        //key>cell
        //right
        

        //i=0 to n-1;
        // j=m-1 to 0;
        //stop;


         int row=0 ,col=matrix[0].length-1;
         while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found key at ("+ row +"," + col + ")");
                return true;
            }
              
            else if (key<matrix[row][col]){
                col--;
            }
            else{          
               row++;
            }
        }

         System.out.println("key not found");
         return false;
    }
public static void main(String args[]) {
        int matrix[][] = 
                {{ 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

                int key=50;
            staircasesearch(matrix,key);
}
}
