import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter your lottery number: ");
       int x = s.nextInt();

       Lottery lottery = new Lottery();
       lottery.determineWinnings(x);
    }
}