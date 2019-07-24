import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

//Baseado no livro CoreServlets 
public class BolaFrame extends JFrame {
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
		
		
		iniciaEventosTeclado(); //funciona para toda tela
		
		/* Este funciona, mas só quando o botão estiver em foco.
		botaoIniciar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) { 
				System.out.println("Hell");
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					adicionaBola();
				}
			}
		});*/
		
	}
	
	private void iniciaEventosTeclado() {
		//Pega o painel da janela
		JPanel painel = ((JPanel)getContentPane());  
		//Criando as ações
		ActionMap actionMap = painel.getActionMap();
		actionMap.put("baixo",new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				adicionaBola();
			}
		});
		//Relacionando os botões e as ações
		InputMap imap = painel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
		imap.put(KeyStroke.getKeyStroke("DOWN"), "baixo");
	}

	public void adicionaBola()
	{
		Bola bola = new Bola();
		comp.add(bola);
		
		Runnable r = new BolaRunnable(bola, comp);
		new Thread(r).start();
		
	}


}

