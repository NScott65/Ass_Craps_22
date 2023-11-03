import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int sum1 = 0;
        int sum2;
        boolean done = false;
        boolean done2 = false;
        int plays = 0;
        String n = "";

        System.out.println("Welcome to the Craps Simulator!");
        System.out.println("Rule 1: If the sum is 2, 3, or 12 it is called \"craps\" or \"crapping out\" and the game is over with a loss.");
        System.out.println("Rule 2: If the sum is 7 or 11 it is called a \"natural\" and the game is over with a win.");
        System.out.println("Rule 3: For all other values, the sum becomes \"the point\" and the user makes subsequent rolls \nuntil they either roll a 7, in which case they lose, or they roll the point sum in which case they win.");

        do{
        do {
            int dR2 = (int)(Math.random() * 6) + 1;
            int dR1 = (int)(Math.random() * 6) + 1;
            plays++;
            System.out.println("Roll 1: " + dR1);
            System.out.println("Roll 2: " + dR2);
            if(plays == 1) {
                sum1 = dR1 + dR2;
            }else{
                sum2 = dR1 + dR2;
            }
            System.out.println("Sum: " + sum1);

            if (sum1 == 2 || sum1 == 3 || sum1 == 12 && plays > 1) {
                System.out.println("Sorry, you crapped out.");
                System.out.println("Try Again?[Y/N]");
                if (scan.hasNextLine()) {
                    n = scan.nextLine();
                    if (n.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                }
            }else if(sum1 == 7 || sum1 == 11){
                System.out.println("You have won!");
                System.out.println("Try Again?[Y/N]");
                if (scan.hasNextLine()) {
                    n = scan.nextLine();
                    if (n.equalsIgnoreCase("N")) {
                        System.exit(0);
                    }
                }
            }else{
                done = true;
            }
        }while(!done);


            System.out.println("Reroll. You need a " + sum1 + " to win. A 7 will make you lose.");
            int dR3 = (int)(Math.random() * 6) + 1;
            int dR4 = (int)(Math.random() * 6) + 1;
            plays++;
            System.out.println("Roll 1: " + dR3);
            System.out.println("Roll 2: " + dR4);
            sum2 = dR3 + dR4;
            System.out.println("Sum: " + sum2);
            if(sum2 == sum1){
                System.out.println("You have won!");
                System.out.println("Try Again?[Y/N]");
                if (scan.hasNextLine()) {
                    n = scan.nextLine();
                    if (n.equalsIgnoreCase("N")) {
                        done2 = true;
                    }else if(n.equalsIgnoreCase("Y")){
                        done = false;
                    }
                }
            }else if(sum2 == 7){
                System.out.println("Sorry, you crapped out.");
                System.out.println("Try Again?[Y/N]");
                if (scan.hasNextLine()) {
                    n = scan.nextLine();
                    if (n.equalsIgnoreCase("N")) {
                        done2 = true;
                    }else if(n.equalsIgnoreCase("Y")){
                        done = false;
                    }
                }
            }else{
                System.out.println("Reroll. You need a " + sum1 + " to win. A 7 will make you lose.");
            }
        }while(!done2);

    }
}