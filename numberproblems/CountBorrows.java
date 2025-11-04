package numberproblems;
import java.util.*;
public class CountBorrows {
    public static String CountBor(int num1,int num2){
        if(num1<num2) return "not possible";
        int n1=num1;
        int n2=num2;
        int carry=0;
        int borrows=0;
        while(n1>0||n2>0){
            int d1=n1%10;
            int d2=n2%10;
            d1-=carry;
            carry=0;
            if(d1<d2){
                d1+=10;
                carry=1;
                borrows++;
            }
            int diff=d1-d2;
            n1/=10;
            n2/=10;

        }
        return String.valueOf(borrows);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        String res=CountBor(num1, num2);
        System.out.println(res);
    }
    
}
