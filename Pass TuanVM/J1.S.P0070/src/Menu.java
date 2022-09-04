
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Menu {
    public int getChoice(int min , int max){
        System.out.println("---------Login Program--------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.println("Please choice one option:");
        Scanner sc = new Scanner(System.in);
        // until user input correct
        while(true){
            try {
                String tmp = sc.nextLine();
                //input can not be empty
                if (tmp.isEmpty()){
                    System.out.println("You need to choice in range [" + min + ", " + max +"]");
                    System.out.println("Ban can nhap trong khoang [" + min + ", " + max +"]");
                    System.out.println("Please re-choice:");
                } else {
                    int choice = Integer.parseInt(tmp.trim());
                    if(choice < min || choice > max){
                    System.out.println("You need to choice in range [" + min + ", " + max +"]");
                    System.out.println("Ban can nhap trong khoang [" + min + ", " + max +"]");
                    System.out.println("Please re-choice:");                       
                    }
                    else return choice;
                }
            } catch (NumberFormatException e) {
                    System.out.println("You need to choice in range [" + min + ", " + max +"]");
                    System.out.println("Ban can nhap trong khoang [" + min + ", " + max +"]");
                    System.out.println("Please re-choice:");   
            }
        }
    }
    
}
