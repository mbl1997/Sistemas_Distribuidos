import java.awt.Component;

//Baseado no Core Java
public class BolaRunnable implements Runnable{
	private Bola bola;
	private Component componente;
	public static final int STEPS = 2000;
	public static final int DELAY = 5;
	
	public BolaRunnable(Bola b, Component c)
	{
		this.bola = b;
		this.componente = c;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i=1;i<=STEPS;i++)
			{
				bola.move(componente.getBounds());
				componente.repaint();
				Thread.sleep(DELAY);
			}
		} catch(InterruptedException e) {e.printStackTrace();}
	}
}
