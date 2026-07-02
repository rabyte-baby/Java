import java.util.Scanner;

public class RPSGame {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        
        
        System.out.print("Enter the desired number (1-3): ");
        
        int Number = scanner.nextInt();
        
        if (Number < 1 || Number > 3) {
            System.out.println("Invalid! Not following instruction!");
        } 
        else {
            int numberComputer = (int)(Math.random() * 3) + 1;
            System.out.println("Computer chose: " + numberComputer);
            
            if (Number == numberComputer) {
                System.out.println("Tie!");
            } else if (Number == 1 && numberComputer == 3) {
                System.out.println("Rock! User wins!");
            } else if (Number == 2 && numberComputer == 1) {
                System.out.println("Paper! User wins!");
            } else if (Number == 3 && numberComputer == 2) {
                System.out.println("Scissors! User wins!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}
