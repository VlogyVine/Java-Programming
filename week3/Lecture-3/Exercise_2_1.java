import java.util.Scanner;

public class Exercise_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int) (Math.random() * 100);

        System.out.print("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        while (guess.length() < 2) {
            guess = "0" + guess;
        }

        String lotteryStr = String.format("%02d", lottery);
        System.out.println("The lottery number is " + lotteryStr);

        if (guess.equals(lotteryStr)) {
            System.out.println("Exact match: you win $10,000");
        }
        else if ((guess.charAt(0) == lotteryStr.charAt(1) &&
                guess.charAt(1) == lotteryStr.charAt(0))) {
            System.out.println("Match all digits: you win $3,000");
        }
        else if (guess.contains(Character.toString(lotteryStr.charAt(0))) ||
                guess.contains(Character.toString(lotteryStr.charAt(1)))) {
            System.out.println("Match one digit: you win $1,000");
        }
        else {
            System.out.println("Sorry: no match");
        }

        input.close();
    }
}
