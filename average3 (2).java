import java.util.*;
public class average3 {
    public static void main (String args[]){
           Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double a = sc.nextDouble();
        
        
        System.out.println("Enter the second number:" );
double b =sc.nextDouble();

        System.out.println ("Enter the third number:" );
             double c = sc.nextDouble();
             
            System.out.println( "average value is:" + average(a,b,c));
}
public static double average (double a, double b, double c){


      return ( a + b + c)/3;

}
}

        


    