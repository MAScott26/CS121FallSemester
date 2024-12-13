package projectOne;
import java.util.Scanner;


public class CharacterBattle {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String playerOne;
        String playerTwo;
        int p1HP;
        int p2HP;
        String p1MOV;
        String p2MOV;
        int p1Pow;
        int p2Pow;
        int p1Spd;
        int p2Spd;
        boolean keepGoing;
        int numRounds;
        int roundNum = 0;

        int p1Wins = 0;
        int p2Wins = 0;

        System.out.println("Enter an odd number of rounds");
        numRounds = Integer.parseInt(scnr.nextLine());
        while ((numRounds % 2) == 0) {
            System.out.println("please enter an odd Number: ");
            numRounds = Integer.parseInt(scnr.nextLine());
        }

        for (int i = 0; i < numRounds; i++) {
            keepGoing = true;

            System.out.println("Round " + (roundNum += 1));
            System.out.println("~~~~~~~~~~");
            System.out.println("Player One, Enter your character's Name");
            playerOne = scnr.nextLine();
            System.out.printf("Enter %s's HP:\n", playerOne);
            p1HP = Integer.parseInt(scnr.nextLine());
            System.out.printf("Enter %s's Attack Name:\n", playerOne);
            p1MOV = scnr.nextLine();
            System.out.printf("Enter %s's Power:\n", p1MOV);
            p1Pow = Integer.parseInt(scnr.nextLine());
            System.out.printf("Enter %s's Speed:\n", playerOne);
            p1Spd = Integer.parseInt(scnr.nextLine());

            System.out.println("~~~~~~~~~~");
            System.out.println("Player Two, Enter your character's Name");
            playerTwo = scnr.nextLine();
            System.out.printf("Enter %s's HP:\n", playerTwo);
            p2HP = Integer.parseInt(scnr.nextLine());
            System.out.printf("Enter %s's Attack Name:\n", playerTwo);
            p2MOV = scnr.nextLine();
            System.out.printf("Enter %s's Power:\n", p2MOV);
            p2Pow = Integer.parseInt(scnr.nextLine());
            System.out.printf("Enter %s's Speed:\n", playerTwo);
            p2Spd = Integer.parseInt(scnr.nextLine());

            while (keepGoing) {
                if (p1Spd == p2Spd){
                    Integer flip = (int) (Math.random() * (11-1)+1 );
                    if (flip>=5){
                        p1Spd +=1;
                    }
                    else{
                        p2Spd+=1;
                    }
                    System.out.println("Since speeds were equal, A coin flip has decided who goes first.");
                }
                if (p1Spd > p2Spd) {
                    // player one attacks first
                    System.out.printf("%s attacks %s using %s for %d points of Damage\n",playerOne, playerTwo,p1MOV ,p1Pow);
                    p2HP -= p1Pow;
                    System.out.printf("%s's health is now %d\n",playerTwo, p2HP);

                    if(p2HP <= 0){
                        p1Wins += 1;
                        System.out.printf("Player 1 wins Round %d\n",roundNum);
                        keepGoing = false;
                        break;
                    }

                    //player two attacks after
                    System.out.printf("%s attacks %s using %s for %d points of Damage\n",playerTwo, playerOne, p2MOV,p2Pow);
                    p1HP -= p2Pow;
                    System.out.printf("%s's health is now %d\n",playerOne, p1HP);

                    if (p1HP <= 0){
                        p2Wins += 1;
                        System.out.printf("Player 2 wins Round %d\n",roundNum);
                        keepGoing = false;
                        break;
                    }
                }
                else if (p2Spd > p1Spd){
                    System.out.printf("%s attacks %s using %s for %d points of Damage\n",playerTwo, playerOne, p2MOV,p2Pow);
                    p1HP -= p2Pow;
                    System.out.printf("%s's health is now %d \n",playerOne, p1HP);

                    if (p1HP <= 0){
                        p2Wins += 1;
                        System.out.printf("Player 2 wins Round %d\n",roundNum);
                        keepGoing = false;
                        break;
                    }

                    System.out.printf("%s attacks %s using %s for %d points of Damage\n",playerOne, playerTwo,p1MOV ,p1Pow);
                    p2HP -= p1Pow;
                    System.out.printf("%s's health is now %d\n",playerTwo, p2HP);

                    if(p2HP <= 0){
                        p1Wins += 1;
                        System.out.printf("Player 1 wins Round %d\n",roundNum);
                        keepGoing = false;
                        break;
                    }
                }
                }
            }
        System.out.printf("\nPlayer One Score: %d\n", p1Wins);
        System.out.printf("\nPlayer Two Score: %d\n", p2Wins);

        if(p1Wins>p2Wins){
            System.out.printf("\nPlayer 1 won %d out of %d Rounds! Congratulations\n",p1Wins, numRounds);
        }
        else{
            System.out.printf("\nPlayer 2 won %d out of %d Rounds! Congratulations\n",p2Wins, numRounds);
        }

        }
    }

