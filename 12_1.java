package wangzhuojian.lab12;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class test {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new Frame();
            frame.setVisible(true);
        });
    }
}

class Frame extends JFrame {

    public Frame() {
        setTitle("实验12");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var jp = new JPanel();
        var sp = new JScrollPane();
        jp.add(sp);
        add(jp);
        jp.setBorder(new EmptyBorder(5, 5, 5, 5));
        jp.setLayout(new BorderLayout(0, 0));
        var mb1 = new JMenuBar();
        var mn1 = new JMenu("File");
        var mn2 = new JMenu("Edit");
        var tb1 = new JToolBar();
        add(tb1, BorderLayout.SOUTH);
        mb1.add(mn1);
        mb1.add(mn2);
        var pm1 = new JPopupMenu();
        jp.add(sp, BorderLayout.CENTER);
        String[] columnNames = {"姓名", "学号"};
        String[][] tableValues = {{"张三", "15h001"}, {"李四", "15h002"}};
        var table = new JTable(tableValues, columnNames);
        sp.setViewportView(table);
        var mi1 = new JMenuItem("New");
        var mi2 = new JMenuItem("Open");
        var mi3 = new JMenuItem("New");
        var mi4 = new JMenuItem("Open");
        var mi5 = new JMenuItem("Search");
        var mi6 = new JMenuItem("Show");
        var bt1 = new JButton("New");
        var bt2 = new JButton("Open");
        tb1.add(bt1);
        tb1.add(bt2);
        mn1.add(mi1);
        mn1.add(mi2);
        pm1.add(mi3);
        pm1.add(mi4);
        mn2.add(mi5);
        mn2.add(mi6);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pm1.show(e.getComponent(), e.getX(), e.getY());
            }
        });
        mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        mi1.addActionListener(e -> JOptionPane.showMessageDialog(null, "您点击了New菜单"));
        mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        mi2.addActionListener(e -> JOptionPane.showMessageDialog(null, "您点击了Open菜单"));
        bt1.addActionListener(e -> JOptionPane.showMessageDialog(null, "您点击了New菜单"));
        bt2.addActionListener(e -> JOptionPane.showMessageDialog(null, "您点击了Open菜单"));
        var dl1 = new JDialog(this, false);
        var dl2 = new JDialog(this, true);
        dl1.setSize(400, 200);
        dl2.setSize(400, 200);
        mi5.addActionListener(e -> dl1.setVisible(true));
        mi6.addActionListener(e -> dl2.setVisible(true));
        setJMenuBar(mb1);
        setBounds(500, 250, 600, 400);
    }
}
