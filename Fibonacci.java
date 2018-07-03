
package edu.hit.java.quizy;

/**
 *
 * @author EpsilonW
 */
public class FibonacciSequence {

    /**
     fibonacci sequence
     */
    public static void main(String[] args) {
        int n=20;
        int i;
        for(i=1; i<=n; i++)
        {
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int n){
        if(n==1||n==2)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
