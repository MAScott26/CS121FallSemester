package weekEleven.ArrayListsDemo;

import java.util.ArrayList;

public class SystemManagement {

    ArrayList<Integer> scoreList = new ArrayList<>();
    ArrayList<Character> letterGradeList = new ArrayList<>();
    ArrayList<String> nameList = new ArrayList<>();

    public void addName(String Name){
        this.nameList.add(Name);
    }
    public void addScore(int Score){
        this.scoreList.add(Score);
    }
    public void addGrade(char Grade){
        this.letterGradeList.add(Grade);
    }

    public void displayInfo(){
        System.out.printf("%-10s%-10s%-10s","Name", "Score","Grade" );

        for (int i = 0;i<nameList.size();i++){
            System.out.printf("%-10s%-10d%-10c");

        }
    }









}
