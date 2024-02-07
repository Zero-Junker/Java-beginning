
/**
 * Write a description of class BankApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class BankApplication
{
    public static void displayMenu(){
        System.out.println("Welsome to FHSU bank");
        System.out.println("***************************");
        System.out.println("*          Menu           *");
        System.out.println("* 1. Open account         *");
        System.out.println("* 2. Deposit              *");
        System.out.println("* 3. Withdraw             *");
        System.out.println("* 4. Inquiry account info *");
        System.out.println("* 5. update interest      *");
        System.out.println("* 6. quit                 *");
        System.out.println("***************************");
    }

    public static void main(String[] args){
        ArrayList<Account> account = new ArrayList();
        Scanner stnd = new Scanner(System.in);
        int choice = 0;
        int id;
        double balance,amount;
        do{
            displayMenu();
            System.out.println("Please pick an option: ");
            choice = stnd.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter account type (C or S");
                    char accountType = stnd.next().toUpperCase().charAt(0);
                    System.out.println("Enter id: ");
                    id = stnd.nextInt();
                    System.out.println("Enter initial balance: $");
                    balance = stnd.nextDouble();
                    if(accountType == 'S'){
                        account.add(new SavingsAccount(id,balance));
                    }
                    else{
                        account.add(new CheckingAccount(id,balance));
                    }
                    break;
                case 2:
                    System.out.println("Enter account id");
                    id = stnd.nextInt();
                    Account a = null;
                    for(int i = 0; i < account.size(); i++){
                        if(account.get(i).getId() == id){
                            a = account.get(i);
                            break;
                        }
                    }
                    if (a == null){
                        System.out.println("Invalid id");
                    }
                    else{
                        System.out.println("Enter amount to deposit: ");
                        amount = stnd.nextDouble();
                        try{
                            a.deposit(amount);
                            System.out.println("Deposit succesfull. Your account is now: ");
                            System.out.println(a);
                        }
                        catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
            }
        }while (choice != 6);
    }
}
