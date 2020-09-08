package songqing.lesson1;

import javax.swing.*;
import java.awt.*;
// 密码框
public class TestTextDemo02 extends JFrame {
    public TestTextDemo02() throws HeadlessException {
        Container container = this.getContentPane();

        JPasswordField passwordField = new JPasswordField();  // ***
        passwordField.setEchoChar('*');

        container.add(passwordField);

        this.setVisible(true);
        this.setBounds(100,100,300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
