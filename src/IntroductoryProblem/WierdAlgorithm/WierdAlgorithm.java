//package IntroductoryProblem.WierdAlgorithm;

import java.util.Scanner;

public class WierdAlgorithm {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        long n=sc.nextInt();
        System.out.print(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
                System.out.print(" "+n);
            }
            else{
                n=3*n+1;
                System.out.print(" "+n);
            }
        }

    }
}
