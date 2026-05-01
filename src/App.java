/*  
>>Shawerma Al 7akam calculator<<
>>User will chose what shawerma meal they want to use as they’re reference of calculation 
>>they chose an metric(time,days,distance, etc)
>>they input the value of the metric they want to convert
>>the program will calculate the equivalent amount of shawerma meals to the desierd metric and output the result to the user
*/


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.math.*;
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
    
    static JPanel centerPanel = new JPanel(); // FlowLayout by default (CENTERED)

    public static void main(String[] args) {
    // Set the look and feel to the system's look and feel
    try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
        e.printStackTrace();
    }

    
    // Create and display the GUI
    SwingUtilities.invokeLater(() -> creatGUI());
    
    }



    //this method will calculate the amount of shawerma meals in the given metric and output the result to the user
    public static double calculateShawermaMealsInDays(double metric, double price) {
        //x * 48 = amount of meals
        double meals = 0.0;
        double cost = 0.0;
        
        meals = metric * 48; //amount of meals in the given metric
        cost = meals * price;//total cost of the meals

        JOptionPane.showMessageDialog(mainWindow, "In "+ Math.round(metric * 10000.0) / 10000.0 + " days, you can buy " + Math.round(meals * 10000.0) / 10000.0 + " shawerma meals, which will cost you " + Math.round(cost * 10000.0) / 10000.0 + " Dinars.");
        return meals;
    }

    //this method will calculate the amount of shawerma meals in the given metric and output the result to the user
    public static double calculateShawermaMealsInMins(double metric, double price) {
        //x * 0.033 = amount of meals
        double meals = 0.0;
        double cost = 0.0;
        
        meals = metric * 0.033;//amount of meals in the given metric
        cost = meals * price;//total cost of the meals

        JOptionPane.showMessageDialog(mainWindow, "In "+ Math.round(metric * 10000.0) / 10000.0 + " minutes, you can buy " + Math.round(meals * 10000.0) / 10000.0 + " shawerma meals, which will cost you " + Math.round(cost * 10000.0) / 10000.0 + " Dinars.");
        return meals;
    }

    //this method will calculate the amount of shawerma meals in the given metric and output the result to the user
    public static double calculateShawermaMealsInHours(double metric, double price) {
        //x * 2 = amount of meals
        double meals = 0.0;//amount of meals in the given metric
        double cost = 0.0;//total cost of the meals
        
        meals = metric * 2;
        cost = meals * price;

        JOptionPane.showMessageDialog(mainWindow, "In "+ Math.round(metric * 10000.0) / 10000.0 + " hours, you can buy " + Math.round(meals * 10000.0) / 10000.0 + " shawerma meals, which will cost you " + Math.round(cost * 10000.0) / 10000.0 + " Dinars.");


        return meals;
    }
    
    
    public static void creatGUI() {
        
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 300);
        mainWindow.setLocationRelativeTo(null);
        
        
        
        //mainwindow --> comboBoxPanel --> metricPanel, mealPanel 
        //Main window layout
        mainWindow.add(ComboBoxPanel, BorderLayout.NORTH);
        mainWindow.add(submitPanel, BorderLayout.SOUTH);
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
        submitPanel.add(centerPanel, BorderLayout.CENTER);
        centerPanel.add(metricTextField, BorderLayout.CENTER);
        centerPanel.add(submitButton, BorderLayout.SOUTH);
        
        //now we will work on the logic of the submit button
        submitButton.addActionListener(e -> {
    try {
        String selectedMetric = (String) metricComboBox.getSelectedItem();
        String selectedMeal = (String) mealComboBox.getSelectedItem();

        String input = metricTextField.getText().trim();

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(mainWindow, "Please enter a value.");
            return;
        }

        double metricValue = Double.parseDouble(input);
        double mealPrice = 0.0;

        switch (selectedMeal) {
            case "Super Meal 2.5JD":
                mealPrice = 2.5;
                break;
            case "Double Meal 3.20JD":
                mealPrice = 3.20;
                break;
            case "Triple Meal 4.35JD":
                mealPrice = 4.35;
                break;
        }

        switch (selectedMetric) {
            case "Days":
                calculateShawermaMealsInDays(metricValue, mealPrice);
                break;
            case "Hours":
                calculateShawermaMealsInHours(metricValue, mealPrice);
                break;
            case "Minutes":
                calculateShawermaMealsInMins(metricValue, mealPrice);
                break;
        }
        // Clear the input field after calculation
        metricTextField.setText("");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(mainWindow,
                "Please enter a valid number.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE);
    } 
    // Catch any other unexpected exceptions
    catch (Exception ex) {
        JOptionPane.showMessageDialog(mainWindow,
                ex.toString(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }
            });
        
                                                
        mainWindow.pack();
        mainWindow.setVisible(true);
    }  
}
