import java.util.*;
import java.math.*;
public class functions{
    public static Boolean prime(int a){
        if(a<2){
            System.out.println("Invalid number");
            return false;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(prime(n)){
            System.out.println("Giiven Number is prime number");
        }
        else{
            System.out.println("Given number is not prime");
        }
        sc.close();
    }
}