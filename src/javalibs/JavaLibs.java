/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibs;

import java.util.Scanner;

/**
 *
 * @author rdell
 */
public class JavaLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //At least one input parsed as a String --- done
        //At least one input parsed as an int
        //At least one input parsed as a double
        //Used at least one imput in a question to the user --- done
        //Math with at least one int
        //Math with at least one double
        //At least 10 imputs
        //Named variables 
        //Code formating
        //Clean output using concatenation
        
        String firstName;
        
        int ageNumber;
        int intNumber2;
        int intNumber3;
        
        double doubleNumber1;
        double doubleNumber2;
        double doubleNumber3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hello, what is your name? ");
            firstName = sc.nextLine();
        
        System.out.print(firstName +", how old are you? ");
            ageNumber = sc.nextInt();//ask how old they would be after x amount of years
            
        
        
    }
    
}
