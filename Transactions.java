/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Thabiso <your.name at your.org>
 */
public class Transactions {

     double balance = 500.00;
        int withdrawalAmount = 0;
        int depositAmount = 0;
        int option = 0;
        int atmCode = 0;
        double cash = 0.0;
        
        
        Random num = new Random();
	Random Genpin = new Random();
        
        String summary = "WELCOME TO OUT TUT ATM " + "\n" +
                         "************************" + "\n" +
                         "           RECIEPT      " + "\n" +
                         "Opening balance : " + balance;
    public Transactions() {
    }
    
    public void withdraw()
    {
    //Prompting the user for the amount they want to withdraw
                         String strAmount = JOptionPane.showInputDialog("How much do you want to withdraw?");
                         //Parsing the String value to integer
                         withdrawalAmount = Integer.parseInt(strAmount);
                         if(withdrawalAmount <= balance) //Checking if the amount requested is less than the balance
                         {
                             //Deducting the money withdrawn from the balance
                             balance -= withdrawalAmount;
                             
                             //Asking the user if they would like to see a receipt for their transaction
                             String reciept = JOptionPane.showInputDialog("Would you like to view your reciept? Y/N");
                             
                             //Checking the option the user selected
                             if(reciept.charAt(0) == 'Y' || reciept.charAt(0) == 'y')
                             {
                                 //Displays appropriate message for the user
                                 JOptionPane.showMessageDialog(null,summary + "\n" + "Amount withdrawn : -R"+withdrawalAmount + "\n" + "Available balance : " + balance);
                             }
                             else if(reciept.charAt(0) == 'N' || reciept.charAt(0) == 'n')
                             {
                                 //Displays appropriate message for the user
                                 JOptionPane.showMessageDialog(null,"Goodbye!");
                             }
                             else
                             {
                                 //Displays appropriate message for the user
                                 JOptionPane.showMessageDialog(null,"Invalid option!");
                             }
                         }
                         //If the money requested exceeds the balance it should display an appropriate message
                         else if(withdrawalAmount > balance)
                         {
                             //Displays appropriate message for the user
                             JOptionPane.showMessageDialog(null,"Insufficient balance!");
                         }
                         else
                         {
                            //Displays appropriate message for the user
                                 JOptionPane.showMessageDialog(null,"Invalid option!");
                         }
                         
    
                     }
    public void deposit()
    {
           //Prompting the user for the amount they want to deposit
                         String strAmount = JOptionPane.showInputDialog("How much do you want to deposit?");
                         
                         //Parsing the String value to integer
                         depositAmount = Integer.parseInt(strAmount);
                         
                         //Adding the money deposited to the balance
                         balance += depositAmount;
                         
                         //Asking the user if they would like to see a receipt for their transaction
                         String reciept = JOptionPane.showInputDialog("Would you like to view your reciept? Y/N");
                         
                         //Checking the option the user selected
                         switch (reciept.charAt(0)) {
                             case 'Y':
                             case 'y':
                                 //Displays appropriate message for the user
                                 JOptionPane.showMessageDialog(null,summary + "\n" + "Amount deposited : +R" + depositAmount + "\n" +
                                          "\n" + " Available balance : R" + balance);
                                 break;
                             case 'N':
                             case 'n':
                                 //Displays appropriate message for the user
                                 JOptionPane.showMessageDialog(null,"Goodbye!");
                                 break;
                             default:
                                 //Displays appropriate message for the user
                                 JOptionPane.showMessageDialog(null,"Invalid option!");
                                 break;
                         } 
                         
    }
                         public void checkBalance()
                         {
                            JOptionPane.showMessageDialog(null,summary + "\n" + "Amount deposited : +R" + depositAmount + "\n" +
                                         "Amount withdrawn : -R"+withdrawalAmount
                                         + "\n" + " Available balance : R" + balance);
                         }
    
    }

