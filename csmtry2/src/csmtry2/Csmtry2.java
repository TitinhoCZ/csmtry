/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csmtry2;

import java.util.Scanner;

/**
 *
 * @author Titous
 */
public class Csmtry2 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String mainMenu = ("Select a choice from the menu: \n" 
            + "1. Select Liverpool \n" 
            + "2. Select Chelsea \n"
            + "3. Exit");
        int choice = 0;
        
        do {
            System.out.println(mainMenu);
            choice = scan.nextInt();
            switch (choice) {
                case 1 : 
                    System.out.println("Zvolil sis Liverpool.");
                    break;
                case 2 :
                    System.out.println("Zvolil sis Chelsea.");
                    break;   
            }   
        }while (choice != 3);
    }
}
