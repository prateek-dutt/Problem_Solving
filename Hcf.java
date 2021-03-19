import java.util.*;


public class Hcf{

    public int findHcf(int p, int q)
    {
        int i=p;
        int j = q;
        int ans=0;
        while(i!=j){
            if(i>j){
                i=i-j;
            }
            else{
                j=j-i;
            }
        }    
        return i;
    
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        int q = sc.nextInt();
        Hcf h = new Hcf();
        sc.close();

        System.out.println("HCF of"+p+"and"+q+":"+h.findHcf(p,q));

    }
}