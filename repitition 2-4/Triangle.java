import java.util.Scanner;
public class Triangle{
    public static void main(String[] args){
       Scanner myObj = new Scanner(System.in);
       System.out.print("What character do you want your triangle made of?");
       String Character = myObj.next();
       System.out.print("How tall do you want your triangle?");
       int Height = myObj.nextInt();
       int Line=0;
       for (int i =1; i<=Height; Height--){
           Line ++;
           for(int w=Line; w>=1; w--){
               System.out.print(""+Character);
           }
           System.out.println("");
        }
    }
}