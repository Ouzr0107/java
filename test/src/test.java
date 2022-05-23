import java.awt.*;
import javax.swing.*;

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
		setTitle("计算器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		setSize(screenWidth * 2 / 3, screenHeight * 2 / 3);
		Image img = new ImageIcon("src\\ico.png").getImage();
		setIconImage(img);
		JPanel jp = new JPanel();
		var lo = new 
		jp.setLayout();
		add(jp);
		var tf1 = new JTextField(5);
		var opt = new String[] { "+", "-", "*", "/" };
		var cb1 = new JComboBox<String>(opt);
		var tf2 = new JTextField(5);
		var lb1 = new JLabel("=");
		var tf3 = new JTextField(10);
		
	}
}