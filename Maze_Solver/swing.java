import javax.swing.*;
import java.awt.*;

public class swing {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Introduction");
        frame.setLocation(200,100);
        frame.setSize(1000,800);
        frame.getContentPane().setBackground(Color.orange);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
