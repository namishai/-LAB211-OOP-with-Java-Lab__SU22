
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Menu {
     public int getChoice(int min , int max){
        System.out.println("====== USER MANAGEMENT SYSTEM ======");
        System.out.println("1. Create a new account");
        System.out.println("2. Login system");
        System.out.println("3. Exit");
        System.out.print("> Choose: ");
        Scanner sc = new Scanner(System.in);
        // until user input correct
        while(true){
            try {
                String tmp = sc.nextLine();
                //input can not be empty
                if (tmp.isEmpty()){
                    System.out.println("You need to choice in range [" + min + ", " + max +"]");
                    System.out.println("Please re-choice:");
                } else {
                    int choice = Integer.parseInt(tmp.trim());
                    if(choice < min || choice > max){
                    System.out.println("You need to choice in range [" + min + ", " + max +"]");
                    System.out.println("Please re-choice:");                       
                    }
                    else return choice;
                }
            } catch (NumberFormatException e) {
                    System.out.println("You need to choice in range [" + min + ", " + max +"]");
                    System.out.println("Please re-choice:");   
            }
        }
    }
}
