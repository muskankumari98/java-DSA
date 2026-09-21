public class binomial {
    public static int factorial(int n){
        int f=1;
        for (int i=1; i<=n; i++){
            f = f*i;
        }
            return f;
        }
    public static int binomialCoeff(int n ,int r){
        int factN = factorial(n);
        int factR = factorial(r) ;
        int factNR = factorial(n-r);
    int binomialCoeff=factN/(factR * factNR);
    return binomialCoeff
public static void main(String args[]){
    System.out.println(binomialCoeff(6,2));
}
}