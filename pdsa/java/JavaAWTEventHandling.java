/*
Coventry Computing 18.2
Pradeep Sanjaya
cobsccomp182p-030

Programming, Data Structures and Algorithms
Assignment 6
Java AWT, event handling
*/

package pdsa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWTEventHandling extends Frame implements ActionListener {

    TextField tf;
    Button button;

    public JavaAWTEventHandling() throws HeadlessException {
        tf = new TextField();
        tf.setBounds(0, 50, 300, 20);

        button = new Button("click");
        button.addActionListener(this);
        button.setBounds(100, 200, 100, 50);

        add(button);
        add(tf);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new JavaAWTEventHandling();
    }
}
