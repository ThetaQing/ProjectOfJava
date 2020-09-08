package songqing.lesson1;

import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo02 extends JFrame {
    public TestComboboxDemo02() throws HeadlessException {
        Container container = this.getContentPane();

        // 生成列表的内容
        String[] contents = {"1","2","3"};
        // 列表中需要加入内容
        JList list = new JList(contents);

        container.add(list);

        this.setVisible(true);
        this.setBounds(100,100,300,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
