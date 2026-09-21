public class primeno {
    public static boolean isprime (int n) {
        if(n==2){
            return true;

        }
        //boolean isprime=true;
    for(int i=2; i<=Math.sqrt(n); i++){
     if(n%i==0){
    return false;
    //isprime=true;
////break;
    }
}
return true;

//return isprime;
    }
public static void main(String[] args) {
    System.out.println(isprime(5));
}
}
