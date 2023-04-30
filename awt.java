//creating first awt program in java- login page

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class awt{
	public static void main(String[] args){
		
		JFrame f = new JFrame("Login Page");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setBounds(100,200,380,300);
		JLabel lb = new JLabel("",JLabel.CENTER);
        lb.setSize(350,100);
		JButton b1 = new JButton("Login");
		b1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            lb.setText("You are logged in");
         }
        });
		JLabel lb1 = new JLabel("Username:");
		JLabel lb2 = new JLabel("Password:");
		JTextField t1 = new JTextField(" ",20);
		JPasswordField p1 = new JPasswordField(" ",20);
		JPanel p = new JPanel();
		p.add(lb1);
		p.add(t1);
		p.add(lb2);
		p.add(p1);
		p.add(b1);
		p.add(lb);
		f.add(p);
		f.setVisible(true);
		
		
		}
	}
