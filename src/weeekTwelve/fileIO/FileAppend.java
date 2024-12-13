package weeekTwelve.fileIO;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args)throws IOException {

        try{
            FileWriter fileWriter = new FileWriter("TestingFileWrite.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String name = JOptionPane.showInputDialog("Enter Users name: ");
            String password = JOptionPane.showInputDialog("Enter Password: ");
            String playerCharacter = JOptionPane.showInputDialog("Enter Character Name: ");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter Users Score: "));
            double winningPerc = Double.parseDouble(JOptionPane.showInputDialog("Enter Win percentage: "));

            output.printf("\n%-20s %-20s %-6d %-20s %15.2f",name, password, score,playerCharacter,winningPerc);

            fileWriter.close();

        }
        catch(FileNotFoundException e){
            System.err.println("FILE NOT FOUND. PUT ONE IN!!!");
        }


    }


}
