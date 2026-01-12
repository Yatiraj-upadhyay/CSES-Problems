package IntroductoryProblem.IncreasingArray;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long s=0;
        for(int i=1;i<n;i++){
            long a=0l;
            if(arr[i]<arr[i-1]){
                a=arr[i-1]-arr[i];
                s+=a;
                arr[i]+=a;
            }

        }
        System.out.println(s);

    }
}
