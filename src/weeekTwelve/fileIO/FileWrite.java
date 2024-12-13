package weeekTwelve.fileIO;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite{
    public static void main(String[] args) throws FileNotFoundException {
        File outFile = new File("TestingFileWrite.txt");
        PrintWriter output = new PrintWriter(outFile);
        Scanner scan = new Scanner(System.in);

        //HEADER
        output.printf("%-20s %-20s %-17s %-20s %-20s","<User Name>", "<Password>", "<Score>","<Player>", "<Winning %>");

        //Declare variables
        String name, password, playerCharacter;
        int score;
        double winningPerc;

        for(int i = 0;i<2;i++){
            name = JOptionPane.showInputDialog(String.format("Enter user %d's User Name: ", (i+1)));
            password = JOptionPane.showInputDialog(String.format("Enter user %d's Password: ", (i+1)));
            playerCharacter = JOptionPane.showInputDialog(String.format("Enter user %d's Character: ", (i+1)));
            score = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter user %d's Score: ", (i+1))));
            winningPerc = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter user %d's Winning Percentage: ", (i+1))));

            output.printf("\n%-20s %-20s %-6d %-20s %15.2f",name, password, score,playerCharacter,winningPerc);
        }
        scan.close();
        output.close();
    }
}
