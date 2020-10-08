import java.util.Scanner;
import java.lang.Math;


public class ScissorsRockPaper {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerWin = 0;
        int personWin = 0;

        while (computerWin <= 2 || personWin <= 2) {

            System.out.print("Please enter a number 0 - 2: ");
            int person = input.nextInt();
    
            int computer = (int)(Math.random() * 3);
            System.out.println(computer);

            if (computer == 0) {
                switch (person) {
                    case 1 : personWin++;
                    break;
                    case 2 : computerWin++;
                    break;
                }
            } else if (computer == 1) {
                switch (person) {
                    case 0 : computerWin++;
                    break;
                    case 2 : personWin++;
                }
            } else {
                switch (person) {
                    case 0 : personWin++;
                    break;
                    case 1 : computerWin++;
                    break;
                }
            }

            if (computerWin == 2) {
                System.out.println("The computer won twice.");
            } else if (personWin == 2) {
                System.out.println("You won twice.");
                break;
            }
        }
    }
}
