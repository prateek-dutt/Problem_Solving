import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Decimal_to_Binary {
   
   

    public int[] convert_to_binary(int dec_no){
            //input check
            //System.out.println(dec_no);
            int[] bit_list = new int[10];
            int i =0;
            while(dec_no>0){
                bit_list[i] = dec_no %2;
                dec_no = dec_no /2;
                i++;
            }


            return bit_list;
            
            

    }



    public static void main(String args[]){
        int dec_no;
        Scanner sc = new Scanner(System.in);
        dec_no=sc.nextInt();
        Decimal_to_Binary dc_object = new Decimal_to_Binary();
        
        int [] bit_array = dc_object.convert_to_binary(dec_no);
        int j = bit_array.length-1;
        while(j>=0){

            System.out.print(bit_array[j]);
            j--;

        }
    }
}
