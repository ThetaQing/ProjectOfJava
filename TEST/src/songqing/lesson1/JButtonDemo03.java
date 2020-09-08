package songqing.lesson1;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
// 复选框
public class JButtonDemo03 extends JFrame {
    public JButtonDemo03() throws HeadlessException {
        Container container = getContentPane();
        // 将一个图片变为图标
        URL url = JButtonDemo01.class.getResource("/tx.jpg");  // 获取图标
        ImageIcon icon = new ImageIcon(url);

        // 多选框
        JCheckBox checkBox1 = new JCheckBox("多选框1");
        JCheckBox checkBox2 = new JCheckBox("多选框2");
        JCheckBox checkBox3 = new JCheckBox("多选框3");

        container.add(checkBox1,BorderLayout.NORTH);
        container.add(checkBox2,BorderLayout.CENTER);
        container.add(checkBox3,BorderLayout.SOUTH);


        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,300);
    }
}
