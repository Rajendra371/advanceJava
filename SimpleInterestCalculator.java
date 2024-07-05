import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleInterestCalculator extends JFrame implements ActionListener {

    TextField principalTextField, rateTextField, timeTextField, amountTextField;
    Button calculateButton, clearButton;

    public SimpleInterestCalculator() {
    
       
        super("Simple Interest Calculator");
        

        // Create text fields
        principalTextField = new TextField(20);
        rateTextField = new TextField(20);
        timeTextField = new TextField(20);
        amountTextField = new TextField(20);
        amountTextField.setEditable(false);  // Make amount field non-editable

        // Create buttons
        calculateButton = new Button("Calculate");
        clearButton = new Button("Clear");

        // Add labels (optional)
        Label principalLabel = new Label("Principal:");
        Label rateLabel = new Label("Rate (%):");
        Label timeLabel = new Label("Time (Years):");
        Label amountLabel = new Label("Total Amount:");

        // Set layout
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Add components to the frame
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(principalLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        add(principalTextField, c);

        c.gridx = 0;
        c.gridy = 1;
        add(rateLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        add(rateTextField, c);

        c.gridx = 0;
        c.gridy = 2;
        add(timeLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        add(timeTextField, c);

        c.gridx = 0;
        c.gridy = 3;
        add(amountLabel, c);

        c.gridx = 1;
        c.gridy = 3;
        add(amountTextField, c);

        c.gridx = 0;
        c.gridy = 4;
        add(calculateButton, c);

        c.gridx = 1;
        c.gridy = 4;
        add(clearButton, c);

        // Add action listeners
        calculateButton.addActionListener(this);
        clearButton.addActionListener(this);

    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            calculateSimpleInterest();
        } else if (e.getSource() == clearButton) {
            clearTextFields();
        }
    }

    private void calculateSimpleInterest() {
        double principal, rate, time, amount;

        try {
            principal = Double.parseDouble(principalTextField.getText());
            rate = Double.parseDouble(rateTextField.getText());
            time = Double.parseDouble(timeTextField.getText());
        } catch (NumberFormatException ex) {
            // Handle invalid input (show error message)
            System.out.println("Invalid input. Please enter numbers only.");
            return;
        }

        amount = principal + (principal * rate * time) / 100;
        amountTextField.setText(String.format("%.2f", amount)); // Format amount to 2 decimal places
    }

    private void clearTextFields() {
        principalTextField.setText("");
        rateTextField.setText("");
        timeTextField.setText("");
        amountTextField.setText("");
    }

    public static void main(String[] args) {
        new SimpleInterestCalculator();
        
    }
}
