/*  
>>Shawerma Al 7akam calculator<<
>>User will chose what shawerma meal they want to use as they’re reference of calculation 
>>they chose an metric(time,days,distance, etc)
>>they input the value of the metric they want to convert
>>the program will calculate the equivalent amount of shawerma meals to the desierd metric and output the result to the user
*/


import javax.swing.*;


public class App {

    //these are the components of the GUI
    static JFrame mainWindow = new JFrame("Shawerma Al 7akam Calculator");// Create a new JFrame with the title "Shawerma Al 7akam Calculator"
    
    static JLabel metricLabel = new JLabel("Metric Type");// Create a new JLabel with the text "Enter the metric value:"
    
    static JLabel mealLabel = new JLabel("Meal Type");// Create a new JLabel with the text "Enter the metric value:"

    static JButton submitButton = new JButton("Submit");// Create a new JButton with the text "Submit"
    
    static JComboBox<String> metricComboBox = new JComboBox<>(new String[] {"Days", "Minutes", "Hours"});// Create a new JComboBox with the options "Days", "Minutes", and "Hours"
    
    static JPanel ComboBoxPanel = new JPanel();// Create a new JPanel to hold the JComboBoxes

    static JPanel submitPanel = new JPanel();// Create a new JPanel to hold the JButton

    static JPanel metricPanel = new JPanel();// Create a new JPanel to hold the JTextField

    static JPanel mealPanel = new JPanel();// Create a new JPanel to hold the JButton

    static JComboBox<String> mealComboBox = new JComboBox<>(new String[] {"Super Meal 2.5JD", "Double Meal 3.20JD", "Triple Meal 4.35JD"});// Create a new JComboBox with the options "Shawerma Meal 1", "Shawerma Meal 2", and "Shawerma Meal 3"
    
    static JTextField metricTextField = new JTextField(10);// Create a new JTextField
    
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
        
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 300);
        mainWindow.setLocationRelativeTo(null);
        
        
        
        //mainwindow --> comboBoxPanel --> metricPanel, mealPanel 
        //Main window layout
        mainWindow.add(ComboBoxPanel);
        mainWindow.add(submitPanel);
        //comboBoxPanel layout
        ComboBoxPanel.add(metricPanel);
        ComboBoxPanel.add(mealPanel);
        
        //metricPanel layout
        metricPanel.add(metricComboBox);
        metricPanel.add(metricLabel);
        
        //mealPanel layout
        mealPanel.add(mealComboBox);
        mealPanel.add(mealLabel);
    
        //submitPanel layout
        submitPanel.add(submitButton);
    
       
       
       
        mainWindow.setVisible(true);
        mainWindow.pack();
    }




    
}
