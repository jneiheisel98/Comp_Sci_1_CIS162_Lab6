
import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int startNumber;
      int finalNumber;
      int i;


      Scanner input = new Scanner(System.in);
      startNumber = input.nextInt();
      finalNumber = input.nextInt();
      int times = finalNumber-startNumber;
      
      System.out.println(times);
          for (i =startNumber; i<times; i++) {
             System.out.print(i + " ");
          }
   }
}