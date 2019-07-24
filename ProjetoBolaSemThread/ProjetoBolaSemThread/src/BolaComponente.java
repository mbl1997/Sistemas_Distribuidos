import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

//Baseado no livro Core Java
public class BolaComponente extends JPanel{
	private List<Bola> bolas = new ArrayList<>();
	public void add(Bola b)
	{
		bolas.add(b);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for(Bola b:bolas)
			g2d.fill(b.getShape());
	}
}
