
import java.util.Scanner;

public class RockPaperScissorsGame {

        public static void main(String[] args) {
            int scissor = 0;
            int rock = 1;
            int paper = 2;
            int user;
            int computer;
            Scanner in = new Scanner(System.in);
            String[] SRP = {"scissors", "rock", "paper"};
            System.out.print("scissor(0), rock(1), paper(2): ");
            user = in.nextInt();
            computer = (int) (Math.random() * 3 + 0);
            if (computer == user) {
                System.out.println("The computer chose " + SRP[computer] + " and you chose " + SRP[user] + ", it is a draw.");
            } else if (computer == 0 && user == 1) {
                System.out.println("The computer chose scissor and you chose rock, you win!");
            } else if (computer == 1 && user == 0) {
                System.out.println("The computer chose rock and you chose scissor, the computer wins!");
            } else if (computer == 2 && user == 1) {
                System.out.println("The computer chose paper and you chose rock, the computer wins.");
            } else if (computer == 1 && user == 2) {
                System.out.println("The computer chose rock and you chose paper, you win!");
            } else if (computer == 2 && user == 0) {
                System.out.println("The computer chose paper and you chose scissor, you win!");
            } else if (computer == 0 && user == 2) {
                System.out.println("The computer chose scissor and you chose paper, the computer wins.");
            }
        }
    }
