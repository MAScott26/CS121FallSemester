import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BankManagementRead {
    public static void main(String[] args) {
        try{
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("Bank.json"));
            BankManagement accountInfo = gson.fromJson(reader,BankManagement.class);

            System.out.println("~~~~~~~~~~~~~~~~~~Account Details~~~~~~~~~~~~~~~");
            System.out.printf("Account number: %s%nAccount Holder: %s%nBalance: %.2f%nType: %s%n",accountInfo.getNumber(),accountInfo.getName(),accountInfo.getBalance(),accountInfo.getType());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
