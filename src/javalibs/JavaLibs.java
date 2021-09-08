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
        //Accept at least 1 input, to be parsed as a String     done
        //Accept at least 1 input, to be parsed as an int       done
        //Accept at least 1 input, to be parsed as a double     done
        //Use at least 1 input in a question for the user       done
        //Do math with at least 1 int input                     done
        //Do math with at least 1 double input                  done
        //Accept at least 10 total inputs                       done
        String nameOfPerson;
        String destination;
        String friendName;
        String cakeFlavor;
        
        int ageNumber;
        int yearsAgo;
        int total;
        
        double cakeWeight;
        double wantedCakeWeight;
        double cakeDifference;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("A person sits alone at their desk. What is this "
                + "person's name? ");
            nameOfPerson = sc.nextLine();
        
        System.out.println("Today is " 
                + nameOfPerson + "'s birthday, and they are completely alone "
                        + "apart from the voice on their screen.");
        
        System.out.print("Since it is " + nameOfPerson + "'s birthday, how "
                + "old are they turning? ");
            ageNumber = sc.nextInt();
            
        System.out.println("Unbeknownst to you, you are " + nameOfPerson 
                + " and you are alone on your birthday. But at least you have "
                        + "me, the voice on your screen.");
            
        
        
        System.out.print("Anyways, congratulations on turning " + ageNumber 
                + "! I'm proud of you, I didn't think you'd make it this far, "
                + "especially after your trip to ");
            destination = sc.next();
        
        System.out.println("After the trip you were never the same, you started"
                + " being more risky in your actions.");
        
        System.out.print(nameOfPerson + ", how many years was it since the trip"
                + " to " + destination + "? ");
            yearsAgo = sc.nextInt();
            
        total = ageNumber - yearsAgo;
        System.out.println("WOW! " + yearsAgo+ " years ago. You were " + total 
                + ", that feel hard to beli- ");
        
        System.out.print("Did you just hear that? Your door creaked, it was "
                + "one of your friends. What was their name? ");
            friendName = sc.next();
            
        System.out.println(friendName + " already left. Awe, but "
                + "look what " + friendName + " left you, a birthday "
                + "cake, how sweet. Go pick it up and tell me how much it "
                + "weighs.");
        
        System.out.print("How many pounds do you think it weighs? ");
            cakeWeight = sc.nextDouble();
            
        System.out.print(nameOfPerson + ", why would " + friendName 
                + " make you a cake that only weighs " + cakeWeight + "? "
                + "That's horrible, it's your birthday, how much do "
                + "you want your birthcake to actually weigh? ");
            wantedCakeWeight = sc.nextDouble();
        
        cakeDifference = cakeWeight - wantedCakeWeight;
        System.out.println("That's a whole " + cakeDifference + "pound "
                + "difference! Just awful, I can not believe " 
                + friendName + ".");
        
        System.out.print("Is it even the right flavor, what's your favorite "
                + "cake flavor?");
            cakeFlavor = sc.next();
            
        System.out.println("Man, it's your birthday and you can not catch a "
                + "break, first your alone besides me, the voice on your screen"
                + ", second your cake isn't even the right size, and third "
                + "it's not even the right flavor. " + nameOfPerson 
                + ", I hope your birthday gets better."); 
            
            
    }
    
}
