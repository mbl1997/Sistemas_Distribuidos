package Exercicio_07;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Marih Bianchini
 */


public class JanelaSensores extends JFrame {
    public static final int NUM_SENSORES=6;
    private JLabel labelSensor[];
    private JTextField textoSensor[];


    public JanelaSensores() {
        super("Janela de Sensores");
        setBounds(300, 200, 200, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciaComponentes();
        JanelaSensores.this.setVisible(true);
    }

    private void iniciaComponentes() {
        this.setLayout(new GridLayout(NUM_SENSORES, 2));
        labelSensor = new JLabel[NUM_SENSORES];
        textoSensor = new JTextField[NUM_SENSORES];
        for(int i=0; i<NUM_SENSORES; i++){
            labelSensor[i] = new JLabel("Sensor "+(i+1)+":");
            this.add(labelSensor[i]);
            textoSensor[i] = new JTextField("0");
            this.add(textoSensor[i]);
        }
        
    }

    public void atualizaSensor(int sensor, int valor) {
        textoSensor[sensor-1].setText(String.valueOf(valor));
    }

    public static void main(String[] args) {
        new JanelaSensores().atualizaSensor(3, 30);
    }
}
