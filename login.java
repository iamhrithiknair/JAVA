import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class login extends Frame implements ActionListener{
    
    Label lb1;
    Label lb2;
    TextField tf1;
    TextField tf2;
    Dialog d1;
    Button b;
    Label lb3;

    public login(){
        setLayout(new FlowLayout());
        setSize(300,200);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }

        });

        lb1 = new Label("Username");
        lb1.setSize(350,100);
        lb2 = new Label("Password");
        lb2.setSize(350,100);

        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf2.setEchoChar('*');

        b = new Button("Login");
        b.addActionListener(this);

        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(b);
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        if(command.equals("Login")){
            d1 = new Dialog(this, "Login", true);
            lb3 = new Label("You are logged in!");
            lb3.setSize(350,100);
            d1.add(lb3);
            d1.setSize(200, 100); // Set dialog size
            
            d1.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                d1.dispose();
            }
        });
            d1.setVisible(true); // Show the dialog
            
        }
    }

    public static void main(String args[]){
        login log = new login();
    }
}