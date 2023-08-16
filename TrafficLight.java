import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TrafficLight extends Frame implements ItemListener{
    CheckboxGroup lights = new CheckboxGroup();
    Checkbox red;
    Checkbox yellow;
    Checkbox green;

    TextField textfield;
    int x=0, y=0, z=0;
    String message = "";
    
    public TrafficLight(String title){
        super(title);
        setLayout(new FlowLayout());
        setSize(300,200);
        setVisible(true);

        red = new Checkbox("Red", lights, false);
        yellow = new Checkbox("Yellow", lights, false);
        green = new Checkbox("Green", lights, false);
        
        textfield = new TextField(20);
        
        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);

        add(red);
        add(yellow);
        add(green);
        add(textfield);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }

        });

    }

    public void itemStateChanged(ItemEvent e){
        Checkbox selected = (Checkbox) e.getItemSelectable();
        String labeltext = selected.getLabel();

        if(labeltext.equals("Red")){
            message = "STOP!";
            x=1;
        }
        else if(labeltext.equals("Yellow")){
            message = "SLOW DOWN & WAIT!";
            y=1;
        }
        else if(labeltext.equals("Green")){
            message = "GO!";
            z=1;
        }
        textfield.setText(message);
        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(100, 105, 110, 270);
        g.drawOval(120, 150, 60, 60);
        g.drawOval(120, 230, 60, 60);
        g.drawOval(120, 300, 60, 60);

        if(x==1){

            g.setColor(Color.RED);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 300, 60, 60);
            x=0;

        }

        if(y==1){

            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.YELLOW);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 300, 60, 60);
            y=0;
        }

        if(z==1){

            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.GREEN);
            g.fillOval(120, 300, 60, 60);
            z=0;
        }
    }

    public static void main(String args[]){

        TrafficLight tf = new TrafficLight("Traffic Light");
        
    }
}