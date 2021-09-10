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
        String cakeDescriptor;
        String birthdayActivities;
        String emotion;
        
        int ageNumber;
        int yearsAgo;
        int total;
        
        double personWeight;
        double cakeWeight;
        double weightDifference;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insert a name: ");
            nameOfPerson = sc.nextLine();
        System.out.print("Insert a place: ");
            destination = sc.next();
        System.out.print("Insert a name: ");
            friendName = sc.next();
        System.out.print("Insert an adjective: ");
            cakeDescriptor = sc.next();
        System.out.print("Insert a word that ends in \"ing\": ");
            birthdayActivities = sc.next();
        System.out.print("Insert an emotion: ");
            emotion = sc.next();
        
        System.out.print("Insert a number(int): ");
            ageNumber = sc.nextInt();
        System.out.print("Insert a number(int): ");
            yearsAgo = sc.nextInt();
            
        System.out.print("Insert a number(double): ");
            cakeWeight = sc.nextDouble();
        System.out.print("Insert a number(double): ");
            personWeight = sc.nextDouble();
            
        total = ageNumber - yearsAgo;
        weightDifference = personWeight - cakeWeight;
        
        
        
        System.out.println("There name is " + nameOfPerson + " Today is " 
                + nameOfPerson + "'s birthday. ");
        
        System.out.println(nameOfPerson + " is turning "  + ageNumber + ". For"
                + " their birthday, they are going to " + destination + ".");
        
        System.out.println("It has  been " + yearsAgo + " since they had gone "
                + "there last, they were only " + total + "!");
        
        System.out.println(" For their birthday their friend, " + friendName 
                + ", baked them a " + cakeDescriptor + " cake. ");
        
        System.out.println(nameOfPerson + " weights " + personWeight + "kg and"
                + " their cake weights " + cakeWeight + "kg, the difference "
                        + "between them is " + weightDifference+ "kg.");
        
        System.out.println("For "+ nameOfPerson + "'s birthday, they are going"
                + " to be " + birthdayActivities + " at " + destination + ".");
        
        System.out.println("They are so " +emotion+ " to be at " + destination 
                + " because they have waited so long to come.");
            
    }
    
}
