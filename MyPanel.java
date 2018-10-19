import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
	public static final int BW = 1000;
	public static final int BH = 1000; //��� �ΰ� ����
	public Ball ball = new Ball(); //������ ����
	
	public MyPanel() {
		this.setBackground(Color.pink);
		Runnable task = () -> {
			while(true) {
				ball.update();
				repaint();
				try {
					Thread.sleep(50);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(task).start();//������ ȣ��
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ball.draw(g);
	}

	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		f.add(new MyPanel());
		f.setVisible(true);
	}

}
