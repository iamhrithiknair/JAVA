import java.awt.event.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Calculate extends JFrame implements ActionListener{
    JLabel num1;
    JLabel num2;

    JTextField tf1;
    JTextField tf2;
    JTextField res;

    JButton divide;

    public Calculate(){
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //setBounds(100,200,380,300);
        setSize(300,200);
        
        num1 = new JLabel("Num1",JLabel.LEFT);
        num1.setSize(350,100);
        num2 = new JLabel("Num2",JLabel.LEFT);
        num2.setSize(350,100);

        tf1 = new JTextField(20);
        tf2 = new JTextField(20);
        res = new JTextField(20);
        res.setHorizontalAlignment(JTextField.CENTER);
        res.setEditable(false);

        divide = new JButton("Divide");
        divide.addActionListener(this);
        
        add(num1);
        add(tf1);
        add(num2);
        add(tf2);
        add(divide);
        add(res);
        
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(command.equals("Divide")){
            CalculateResult();
        }
    }

    private void CalculateResult(){
        String firstNumber = tf1.getText();
        String secondNumber = tf2.getText();

        double result = 0;
        try{
            
            double n1 = Double.parseDouble(firstNumber);
            double n2 = Double.parseDouble(secondNumber);
             if(n2==0){
                throw new ArithmeticException();
            }
            result = n1/n2;
            res.setText(String.valueOf(result));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "NumberFormatException", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Can't divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]){
        Calculate calc = new Calculate();
    }



}