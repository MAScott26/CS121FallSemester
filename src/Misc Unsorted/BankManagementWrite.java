import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BankManagementWrite {
    public static void main(String[] args) {
        try {
            BankManagement accountInfo = new BankManagement("9999", "Honda Jones", "Savings", 9999.98 );
            Gson gson = new Gson();
            String jsonString = gson.toJson(accountInfo);
            System.out.println(jsonString);
            FileWriter filewrite = new FileWriter("Bank.json");
            filewrite.write(jsonString);
            filewrite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
