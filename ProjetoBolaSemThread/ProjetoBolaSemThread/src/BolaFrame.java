import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Baseado no livro CoreServlets
public class BolaFrame extends JFrame{
	public static final int DEFAULT_WIDTH = 450;
	public static final int DEFAULT_HEIGHT = 350;
	public static final int STEPS = 1000;
	public static final int DELAY = 3;
	private BolaComponente comp;
	
	public BolaFrame()
	{
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setTitle("Bola Anime");
		
		comp = new BolaComponente();
		add(comp,BorderLayout.CENTER);
		JPanel botaoPanel = new JPanel();
		
		JButton botaoIniciar = new JButton("Iniciar");
		botaoPanel.add(botaoIniciar);
		botaoIniciar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				adicionaBola();
			}
		});
		
		JButton botaoSair = new JButton("Sair");
		botaoPanel.add(botaoSair);
		botaoSair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		add(botaoPanel,BorderLayout.SOUTH);
	}
	
	public void adicionaBola()
	{
		try{
			Bola bola = new Bola();
			comp.add(bola);
			
			for(int i=0;i<=STEPS;i++)
			{
				bola.move(comp.getBounds());
				comp.paint(comp.getGraphics());;
				Thread.sleep(DELAY);
			}
		} catch(InterruptedException e){e.printStackTrace();}
	}

}

