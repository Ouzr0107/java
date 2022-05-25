import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class test {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			var frame = new Frame();
			frame.setTitle("我的第一个窗口");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}

}

class Frame extends JFrame {
	public Frame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		setSize(screenWidth * 2 / 3, screenHeight * 2 / 3);
		Image img = new ImageIcon("src\\ico.png").getImage();
		setIconImage(img);
		add(new testComponent());
	}
}

class testComponent extends JComponent {
	public void paintComponent(Graphics g) {
		var message = "This is my first graphic:";
		var f = new Font("Arial", Font.BOLD + Font.ITALIC, 16);
		g.setFont(f);
		g.setColor(Color.RED);
		g.drawString(message, 100, 20);
		g.setColor(Color.BLUE);
		g.fillRect(50, 50, 100, 50);
		g.setColor(Color.RED);
		g.drawLine(160, 75, 300, 75);
		g.drawLine(250, 50, 300, 75);
		g.drawLine(250, 100, 300, 75);
		g.setColor(Color.GREEN);
		g.drawArc(310, 50, 50, 50, 0, 360);
		g.setColor(Color.BLACK);
		g.drawArc(20, 25, 350, 100, 0, 360);
	}
}