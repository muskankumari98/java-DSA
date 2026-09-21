import java.util.*;   


public class concatenation {
public static void printLetters(String str){
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i) +" ");

    }
    System.out.println();
}
    


    public static void main(String args[]){
     String firstname="Tony";
     String lastname="Spark";
     String fullname=firstname +"  " + lastname;
    // System.out.println(fullname.charAt(8));
      

    printLetters(fullname);
    }
}


