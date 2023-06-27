package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread {
	
	public void run() {
		JFrame frame = new JFrame("제목");
		Container c = frame.getContentPane();
		
		JLabel label = new JLabel("test gui");
		c.add(label);
		label.setFont(new Font("MS Serif", Font.ITALIC, 32));
		label.setHorizontalAlignment(JLabel.CENTER); // 0 넣어도 됨
		
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack(); // 프레임 사이즈 설정
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; ; i++) {
			label.setText("" + i);
		}
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		A04 a = new A04();
		a.start();
		
	}
}
