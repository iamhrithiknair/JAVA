import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{

    JTextField displayfield;
    JButton[] numberButtons;
    JButton[] operatorButtons;
    JButton equalButton;
    JButton clearButton;

    String firstNumber;
    String operator;

    public Calculator(String title){

        super(title);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        displayfield = new JTextField();
        displayfield.setEditable(false);
        displayfield.setHorizontalAlignment(JButton.RIGHT);
        add(displayfield, BorderLayout.NORTH);

        //number buttons
        JPanel numpanel = new JPanel(new GridLayout(4,3));
        numberButtons = new JButton[10];
        for(int i=0; i<numberButtons.length; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numpanel.add(numberButtons[i]);   
        }
        add(numpanel, BorderLayout.CENTER);

        //operator buttons
        JPanel operatorpanel = new JPanel(new GridLayout(4,1));
        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        for(JButton ob : operatorButtons){
            ob.addActionListener(this);
            operatorpanel.add(ob);
        }
        add(operatorpanel, BorderLayout.EAST);

        equalButton = new JButton("=");
        equalButton.addActionListener(this);
        add(equalButton, BorderLayout.SOUTH);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        add(clearButton, BorderLayout.WEST);

        pack();
    }

    public void actionPerformed(ActionEvent e){

        String command = e.getActionCommand();
        if(isNumber(command)){
            handleNumberButton(command);
        }
        else if(isOperator(command)){
            handleOperatorButton(command);
        }
        else if(command.equals("=")){
            calculateResult();
        }
        else if(command.equals("C")){
            clearFields();
        }
    }

        private boolean isNumber(String str){
            return str.matches("\\d");
        }

        private boolean isOperator(String str){
            return str.matches("[+\\-*/]");
        }

        private void handleNumberButton(String number){
            String currentNumber = displayfield.getText();
            displayfield.setText(currentNumber+number);
        }

        private void handleOperatorButton(String operator){
            firstNumber = displayfield.getText();
            this.operator = operator;
            displayfield.setText("");
        }

        private void calculateResult(){
            
            String secondNumber = displayfield.getText();
            double result = 0;
            try{
                double num1 = Double.parseDouble(firstNumber);
                double num2 = Double.parseDouble(secondNumber);

                switch(this.operator){

                    case "+":
                        result = num1 + num2;
                        break;

                    case "-":
                        result = num1 - num2;
                        break;

                    case "*":
                        result = num1 * num2;
                        break;

                    case "/":
                        result = num1 / num2;
                        break;
                }
                displayfield.setText(String.valueOf(result));
            }
            catch(NumberFormatException e){
                displayfield.setText("error");
            }
            
        }

        private void clearFields(){
            
            displayfield.setText("");
            firstNumber = "";
            operator = "";
        }

        public static void main(String args[]){

            Calculator cal = new Calculator("My calculator");
        }
    }






    

























