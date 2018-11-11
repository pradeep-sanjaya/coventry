import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Assignment6 extends Frame implements ActionListener {

    TextField tf;
    Button button;

    public Assignment6() throws HeadlessException {
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
        new Assignment6();
    }
}
