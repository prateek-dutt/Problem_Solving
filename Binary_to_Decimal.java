import java.util.*;
import java.lang.*;

public class Binary_to_Decimal {



    public static void main(String argsp[]){
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary strings");
        String bin_no = sc.next();
        
        int i=bin_no.length()-1;
        int j =0;
        System.out.println(i);
        while(j<bin_no.length()){
            if(bin_no.charAt(j)=='1'){
                int m =(int) Math.pow(2,i--);
                sum = sum +m;
            }
            else{
                i--;
            }
            j++;
        }

            System.out.println(sum);

    }
    
}
