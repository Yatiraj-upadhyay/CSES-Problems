package IntroductoryProblem.MissingNumber;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long arr[] =new long[(int) (n-1)];
        long m=0;
        for(long i=0;i<arr.length;i++){
            arr[(int)i]=sc.nextLong();
            m+=arr[(int)i];
        }
        long l=n*(n+1);
        l=l/2;
        System.out.println(l-m);


    }
}
