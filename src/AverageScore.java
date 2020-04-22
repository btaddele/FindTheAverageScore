import javax.sound.midi.Soundbank;
/*
* Declar the identifiers
* create a scanner object to read from the key board
* open a for loop and calculate the sum
* To get the average score, devide the sum by 10
* */
import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args){
      int score;
      int sum = 0;
      int ave;

      Scanner input = new Scanner(System.in);
       for(int x=0; x<10; x++){
           System.out.print("Enter a test score: ");
           score = input.nextInt();
           sum=sum+score;

       }
       ave=sum/10;
        System.out.println("Average= " + ave);





    }
}
