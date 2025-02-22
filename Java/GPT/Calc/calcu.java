package Java.GPT.Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] operationButtons;
    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton, dotButton;
    private JPanel panel;

    private double num1, num2, result;
    private char operator;

    public calcu() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 18));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            numberButtons[i].addActionListener(this);
        }

        operationButtons = new JButton[4];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        operationButtons[0] = addButton;
        operationButtons[1] = subButton;
        operationButtons[2] = mulButton;
        operationButtons[3] = divButton;

        for (JButton button : operationButtons) {
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(this);
        }

        eqButton = new JButton("=");
        clrButton = new JButton("C");
        dotButton = new JButton(".");
        eqButton.setFont(new Font("Arial", Font.PLAIN, 18));
        clrButton.setFont(new Font("Arial", Font.PLAIN, 18));
        dotButton.setFont(new Font("Arial", Font.PLAIN, 18));
        eqButton.addActionListener(this);
        clrButton.addActionListener(this);
        dotButton.addActionListener(this);

        // Create panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add components to panel
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(addButton);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(mulButton);

        panel.add(clrButton);
        panel.add(numberButtons[0]);
        panel.add(dotButton);
        panel.add(divButton);

        // Set up the layout
        setLayout(new BorderLayout());
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(eqButton, BorderLayout.SOUTH);

        // Set up the initial state
        num1 = num2 = result = 0.0;
        operator = ' ';
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String buttonText = source.getText();

        if (isNumeric(buttonText)) {
            // If the button clicked is a number
            textField.setText(textField.getText() + buttonText);
        } else if (buttonText.equals(".") && !textField.getText().contains(".")) {
            // If the button clicked is a dot and there is no dot already
            textField.setText(textField.getText() + buttonText);
        } else if (isOperator(buttonText)) {
            // If the button clicked is an operator
            num1 = Double.parseDouble(textField.getText());
            operator = buttonText.charAt(0);
            textField.setText("");
        } else if (buttonText.equals("=")) {
            // If the button clicked is the equal sign
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        // Handle division by zero
                        textField.setText("Error");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
            operator = ' ';
        } else if (buttonText.equals("C")) {
            // If the button clicked is the clear button
            textField.setText("");
            num1 = num2 = result = 0.0;
            operator = ' ';
        }
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            calcu calculator = new calcu();
            calculator.setVisible(true);
        });
    }
}