package weeekTwelve.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {

        File fileOutput = new File("TestingFileWrite.txt");
        try{
            Scanner console = new Scanner(fileOutput);
            String header = console.nextLine();
            System.out.printf("%s",header);
            while(console.hasNextLine()){
                String name = console.next();
                String password = console.next();
                int score = Integer.parseInt(console.next());
                String playerCharacter = console.next();
                double winningPerc = Double.parseDouble(console.next());

                System.out.printf("\n%-20s %-20s %-6d %-20s %15.2f",name, password, score,playerCharacter,winningPerc);
            }
            console.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();

        }





    }
}
