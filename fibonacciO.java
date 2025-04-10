import java.lang.Math;

public class fibonacciO {
    public static double findFib(int n,double phi){
        return (Math.pow(phi,n))/Math.sqrt(5);
    }
    // by binet's formula gernal equation of nth is x^2+x-1 and find solution
    public static void main(String args[]){
        double phi=(Math.sqrt(5)+1)/2;
        int n=9;
        double ans=findFib(n,phi);
        System.out.println("Nth fibonacci is : "+ ans);
        
    }
}
