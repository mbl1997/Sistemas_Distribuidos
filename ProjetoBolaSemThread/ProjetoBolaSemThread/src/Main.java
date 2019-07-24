import java.awt.EventQueue;

import javax.swing.JFrame;

//Baseado no livro CoreServlets
public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new BolaFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});

	}

}
