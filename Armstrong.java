import java.util.Scanner;

/*

! ---------------------------------------------------------------
! This program computes all Armstrong numbers in the range of
! 0 and 999.  An Armstrong number is a number such that the sum
! of its digits raised to the third power is equal to the number
! itself.  For example, 371 is an Armstrong number, since
! 3**3 + 7**3 + 1**3 = 371.
! ---------------------------------------------------------------


*/



public class Armstrong {


    static boolean find_arm(int a)
    {
        int a1=0,a2=0,a3=0;
        a1=a/100;
        a2=(a%100)/10;
        a3 =(a%100)%10;
        double sum_pow = Math.pow(a1, 3) + Math.pow(a2, 3) + Math.pow(a3,3);
        int sum=(int) sum_pow;
        if(sum==a){
            return true;
        }
        return false;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a=0;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        
        
        if(find_arm(a))
        {
            System.out.println("is Armstrong");
        }
        else{
            System.out.println("is not Armstrong");
        }

        
    }
    
}
