/*  
>>Shawerma Al 7akam calculator<<
>>User will chose what shawerma meal they want to use as they’re reference of calculation 
>>they chose an metric(time,days,distance, etc)
>>they input the value of the metric they want to convert
>>the program will calculate the equivalent amount of shawerma meals to the desierd metric and output the result to the user
*/


import javax.swing.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        creatGUI();
    

    
    
    }

    public static double calculateShawermaMealsInDays(double metric, double price) {
        //x * 48 = amount of meals
        double meals = 0.0;
        double cost = 0.0;
        
        meals = metric * 48; //amount of meals in the given metric
        cost = meals * price;//total cost of the meals

        System.out.println("In "+ metric + " days, you can eat " + meals + " shawerma meals, which will cost you " + cost + " Dinars.");
        return meals;
    }



    
    public static double calculateShawermaMealsInMins(double metric, double price) {
        //x * 0.033 = amount of meals
        double meals = 0.0;
        double cost = 0.0;
        
        meals = metric * 0.033;//amount of meals in the given metric
        cost = meals * price;//total cost of the meals

        System.out.println("In "+ metric + " minutes, you can eat " + meals + " shawerma meals, which will cost you " + cost + " Dinars.");
        return meals;
    }


    public static double calculateShawermaMealsInHours(double metric, double price) {
        //x * 2 = amount of meals
        double meals = 0.0;//amount of meals in the given metric
        double cost = 0.0;//total cost of the meals
        
        meals = metric * 2;
        cost = meals * price;

        System.out.println("In "+ metric + " hours, you can eat " + meals + " shawerma meals, which will cost you " + cost + " Dinars.");


        return meals;
    }
    
    
    public static void creatGUI() {
        JFrame mainWindow = new JFrame("Shawerma Al 7akam Calculator");// Create a new JFrame with the title "Shawerma Al 7akam Calculator"
        
        
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 300);
        mainWindow.setLocationRelativeTo(null);
        
    
    
    
    
       
       
       
        mainWindow.setVisible(true);
        mainWindow.pack();
    }




    
}
