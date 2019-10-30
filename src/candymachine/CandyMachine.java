/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candymachine;

import java.util.Scanner;
// *
// * @author mlarrubia
// */
public class CandyMachine {

    private static Scanner kb = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to CHS's Comptuer Candy Machine!");
        System.out.println("All candy provided is virtual.");
        System.out.println("How much money do you have?");
        double x = kb.nextDouble();
       
        // Happy Coding!
        double cost = 0.0;
        cost += displayChoices();
        System.out.println(cost);
        dispense();
    }
    
    public static double displayChoices(){
         System.out.println("These are your choices");
        System.out.println("A   $.065 Twix");
        System.out.println("B   $0.50 Chips");
        System.out.println("C   $0.75 Nutter Butter");
        System.out.println("D   $0.65 Peanut Butter Cup");
        System.out.println("E   $0.55 Juicy Fruit Gum");
        
        
        System.out.println("what candy ");
        char choice = kb.next().toLowerCase().charAt(0);
        
        if(choice == 'a'){
            System.out.println("you chose a");
            return 0.65;
        }
        else if(choice == 'b'){
            System.out.println("Chose b");
            return 0.50;
        }
        else if(choice == 'c'){
            System.out.println("you chose c");
            return 0.75;
        }
        else if(choice == 'd'){
            System.out.println("you chose d");
            return 0.65;
        }
        else if(choice == 'e'){
            System.out.println("you chose e");
            return 0.55;
        }
        else 
        {
            return 0;
        }
}
   public static void dispense(double moneyInserted, double candyCost){
       
   }
    
}
          
        
    

