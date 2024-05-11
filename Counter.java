import java.awt.*;
import java.awt.event.*;

public class Counter extends Frame implements ActionListener {
    private int count = 0;
    private Label countLabel;
    private Button countButton;

    public Counter() {
        super("Counter");

        // Initialize components
        countLabel = new Label("Count: 0");
        countButton = new Button("Increment");

        // Set layout
        setLayout(new FlowLayout());

        // Add components
        add(countLabel);
        add(countButton);

        // Add action listener to the button
        countButton.addActionListener(this);

        // Set frame properties
        setSize(200, 100);
        setVisible(true);

        // Handle window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        // Increment count and update label
        count++;
        countLabel.setText("Count: " + count);
    }

    public static void main(String[] args) {
        new Counter();
    }
}
