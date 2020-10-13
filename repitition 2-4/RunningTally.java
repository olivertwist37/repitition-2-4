import java.util.Scanner;
public class RunningTally{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        double Total=0;
        double newNumber = myObj.nextDouble();
        for(int i=0; i < 1; i++){
        if(newNumber <=-1){
         System.out.println("Add:  "+newNumber);
         System.out.println("");
         System.out.println("your total is "+Total);
         i=2;
        }else{
          System.out.println("Add:  "+newNumber);
          Total=Total+newNumber;
          newNumber = myObj.nextDouble();
          i--;
        }
       }
    }
}
