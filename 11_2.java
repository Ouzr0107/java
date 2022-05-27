import java.awt.*;
import java.util.*;
import javax.swing.*;

public class test {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new Frame();
            frame.setVisible(true);
        });
    }
}

class Judge {
    public static boolean isNum(String str) {
        return str.matches("-?\\d+.*\\d*");
    }
}

class Frame extends JFrame {

    public Frame() {
        setTitle("计算器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        JPanel jp = new JPanel();
        add(jp);
        var tf1 = new JTextField(5);
        var opt = new String[]{"+", "-", "*", "/"};
        var cob1 = new JComboBox<>(opt);
        var tf2 = new JTextField(5);
        var lb1 = new JLabel("=");
        var tf3 = new JTextField(10);
        var bt1 = new JButton("计算");
        var bt2 = new JButton("清空结果");
        var cb1 = new JCheckBox("结果取整");
        Box b1 = Box.createVerticalBox();
        jp.add(tf1);
        jp.add(cob1);
        jp.add(tf2);
        jp.add(lb1);
        jp.add(tf3);
        b1.add(bt1);
        b1.add(bt2);
        b1.add(cb1);
        jp.add(b1);
        bt1.addActionListener(e -> {
            var num1 = tf1.getText();
            var op = cob1.getSelectedItem();
            var num2 = tf2.getText();
            if (num1.equals("")) {
                tf1.requestFocus();
                return;
            } else if (num2.equals("")) {
                tf2.requestFocus();
                return;
            }
            if (Judge.isNum(num1) && Judge.isNum(num2)) {
                double result;
                if (Objects.equals(op, "+")) {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                } else if (Objects.equals(op, "-")) {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                } else if (Objects.equals(op, "*")) {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                } else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                }
                if (cb1.isSelected()) {
                    tf3.setText(Integer.toString((int) result));
                } else {
                    tf3.setText(Double.toString(result));
                }
            }
        });
        bt2.addActionListener(e -> {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        });
    }
}