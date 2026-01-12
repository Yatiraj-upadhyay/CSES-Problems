package IntroductoryProblem.WierdAlgorithm.Repititive;

import java.util.Scanner;

public class repetetive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int a=1;
        int m=0;
        int n=str.length();
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                a++;
            }
            else{
                if(a>m){
                    m=a;
                }
                a=1;
            }

        }
        m=Math.max(m,a);
        System.out.println(m);
    }
}
