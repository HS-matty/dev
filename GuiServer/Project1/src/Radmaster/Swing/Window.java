package Radmaster.Swing;

import static Radmaster.Functions.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.JDialog;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Window {
    public Window() {
        super();
    }


    // Create a simple GUI window

    public static void createWindow() {
        //Create and set up the window.
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel =
            new JLabel("I'm a label in the window", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        
        
       // JButton button1 = new JButton("Button 1");
       // JButton button2 = new JButton("Button 2");
        
        JButton button = new JButton("Click!!!");
        //button.set
        
        button.getToolkit();
        //displayMessa
        
        
        frame.getContentPane().add(button);//Display the window.
        
       // MouseEvent
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                 alert("action!: " + event.getID());
                 echo("!!!!");
            }
        });
        
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createWindow();
    }
}
