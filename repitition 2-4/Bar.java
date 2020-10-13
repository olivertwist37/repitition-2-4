import java.util.Scanner;
public class Bar{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("What character do you want your bar made of?");
        String Character = myObj.next();
        System.out.println(" "+Character);
        System.out.print("How long do you want your bar?");
        int length = myObj.nextInt();
        System.out.println(" "+length);
        for(length=length; length>0; length--){
            System.out.print(""+Character);
        }
    }
}