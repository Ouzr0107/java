import java.awt.*;
import javax.swing.*;

public class test {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			var frame = new Frame();
		});
	}

}

class Frame extends JFrame {
	public Frame() {
		setTitle("控件测试");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		setSize(screenWidth * 2 / 3, screenHeight * 2 / 3);
		Image img = new ImageIcon("src\\ico.png").getImage();
		setIconImage(img);
		JPanel jp = new JPanel();
		add(jp);
		JButton b1 = new JButton("按钮1");
		jp.add(b1);
		JButton b2 = new JButton("红色按钮");
		b2.setBackground(Color.RED);
		jp.add(b2);
		JLabel lb1 = new JLabel("我是谁");
		jp.add(lb1);
		JRadioButton rd1 = new JRadioButton("单选1");
		jp.add(rd1);
		JRadioButton rd2 = new JRadioButton("单选2");
		jp.add(rd2);
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rd1);
		bg1.add(rd2);
		JCheckBox cb1 = new JCheckBox("复选1");
		JCheckBox cb2 = new JCheckBox("复选2");
		jp.add(cb1);
		jp.add(cb2);
		JComboBox<String> cob1 = new JComboBox<String>();
		cob1.addItem("专科生");
		cob1.addItem("本科生");
		cob1.addItem("研究生");
		cob1.addItem("博士生");
		jp.add(cob1);
		var str = new String[] { "中国", "美国", "巴基斯坦" };
		var lt1 = new JList<String>(str);
		jp.add(lt1);
		var tf1 = new JTextField("我是计量人",12);
		jp.add(tf1);
		var pf1 = new JPasswordField(12);
		jp.add(pf1);
		var ta1 = new JTextArea(10,20);
		jp.add(ta1);
		setVisible(true);
	}
}