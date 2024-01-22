
package assignment;

import java.util.Random;
import javax.swing.JOptionPane;


public class Assignment {

 
    public static void main(String[] args) {
  
        String preMenu =  "WELCOME TO OUR TUT ATM " + "\n" +
                      "**********************" + "\n" +
                      "Enter your 4-digit pin";
                
        String menu = "WELCOME TO OUT TUT ATM " + "\n" +
                      "**********************" + "\n" +
                      "1. Withdraw" + "\n" +
                      "2. Deposit" + "\n" +
                      "3. Check balance" + "\n" +
                      "\n" +
                      "4. Exit";
        
        int option = 0;
        int atmCode = 0;
	
        Random num = new Random();
	Random Genpin = new Random();
        
        Transactions t1 = new Transactions();
       // String 
       
       //Prompting the user for the correct pin, this feature returns a string, therefore we store the pin as a String value
         String strPin = JOptionPane.showInputDialog(preMenu);
         
         //Parsing the String value pin to integer value
         int pin = Integer.parseInt(strPin);
        while(option != 4)
        {
        
         
         if(pin == 2001) //Checking if the entered pin is accurate
         {
             
         String strOption = JOptionPane.showInputDialog(menu);
         option = Integer.parseInt(strOption);
         
             //Withdrawing money from account
             switch (option) {
             //testing if the option picked was 1 "Withdrawal"
                 case 1:
                     {
                         t1.withdraw();
                         break;
                     }
                 case 2:
                     {
                        t1.deposit();
                        break;
                     }
             //Testing if the option picked was 3 "Check balance"
                 case 3:
                     t1.checkBalance();
                     break;
                 default:
                     break;
                     
             }
         }
         //If the user entered the incorrect pin, message should be displayed appropriately
         else if(pin != 2001)
         {
           //Displays appropriate message for the user
           JOptionPane.showMessageDialog(null,"Incorrect pin! Try again...");
             //Prompting the user for the correct pin, this feature returns a string, therefore we store the pin as a String value
           strPin = JOptionPane.showInputDialog(preMenu);
         
         //Parsing the String value pin to integer value
           pin = Integer.parseInt(strPin);
         }
         else
         {
            //Displays appropriate message for the user
           JOptionPane.showMessageDialog(null,"Invalid Digits! Try again...");
         }
        }
    }
    
}
