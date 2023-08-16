import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TrafficLightwithButtonGroup_RadioButton extends JFrame implements ItemListener{
    
    ButtonGroup bg;
    JRadioButton red;
    JRadioButton yellow;
    JRadioButton green;

    TextField textfield;
    int x=0, y=0, z=0;
    String message = "";

    public TrafficLightwithButtonGroup_RadioButton(String title){
        super(title);
        setLayout(new FlowLayout());
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        bg = new ButtonGroup();
        red = new JRadioButton("Red", false);
        yellow = new JRadioButton("Yellow", false);
        green = new JRadioButton("Green", false);

        bg.add(red);
        bg.add(yellow);
        bg.add(green);

        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);
        
        add(red);
        add(yellow);
        add(green);

        textfield = new TextField(20);
        
        add(textfield);

        
    }

    public void itemStateChanged(ItemEvent e){
        JRadioButton selected = (JRadioButton) e.getItemSelectable();
        String labeltext = selected.getText();

        if(labeltext.equals("Red")){
            message = "Stop!";
            x=1;
            y=0;
            z=0;
        }
        else if(labeltext.equals("Yellow")){
            message = "Slow Down & Wait!";
            x=0;
            y=1;
            z=0;

        }

        else if(labeltext.equals("Green")){
            message = "Go!";
            x=0;
            y=0;
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

            
        }

        if(y==1){

            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.YELLOW);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 300, 60, 60);

            
        }

        if(z==1){

            g.setColor(Color.WHITE);
            g.fillOval(120, 150, 60, 60);
            g.setColor(Color.WHITE);
            g.fillOval(120, 230, 60, 60);
            g.setColor(Color.GREEN);
            g.fillOval(120, 300, 60, 60);

            
        }
    }

    public static void main(String args[]){
        TrafficLightwithButtonGroup_RadioButton tf = new TrafficLightwithButtonGroup_RadioButton("my trafficlight");
    }

    }

    
   
