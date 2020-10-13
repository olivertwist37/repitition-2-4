import java.util.Scanner;
import java.lang.Math;
public class D6{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        for (int i=1;i>0;i--){
            System.out.println(" "); 
            System.out.print("How many D6's do you want to roll?");
            int Die = myObj.nextInt();
            int total =0;
            System.out.print("you rolled: ");
            for (Die=Die; Die>0; Die--){
                int n = (int) (Math.random() * (6-1+1)+1);
                System.out.print(" "+n);
                total=total+n;
            }
            System.out.println(" "); 
            System.out.println("Total: "+total); 
            System.out.println(" "); 
            System.out.println("Again? [y,n]");
            String again = myObj.next();
            if (again.equals("y"))i++;
            else i--;
        }
    }
}
