/*
  
        LCM(a,b) = (a * b) / GCD(a,b)


*/
import java.util.*;

public class Lcm


{
    static int gcd(int a, int b)
    {
        int i =a;
        int j =b;

        while(i!=j)
        {
            if(i>j){
                i=i-j;
            }
            else{
                j=j-i;
            }
        }
        return i;
    }
    public static void main(String args[])
    {
        int a=0,b=0;
        int i=0, j=0;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        a = sc.nextInt();
        System.out.println("Enter the second Number");
        b = sc.nextInt();
        //assuming b>a
        int lcm = (a*b)/gcd(a, b);
        System.out.println("LCM OF"+a+"and"+b+"is : "+lcm);
    }
}