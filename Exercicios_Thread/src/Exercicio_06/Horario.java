package Exercicio_06;

/**
 *
 * @author Marih Bianchini
 */


public class Horario {

    private int hora, minuto, segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void incrementa() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                hora++;
                minuto = 0;
                if (hora == 24) {
                    hora = 0;
                }

            }
        }
    }

    @Override
    public String toString() {
        String horaS = String.valueOf(hora);
        String minutoS = String.valueOf(minuto);
        String segundoS = String.valueOf(segundo);
        if(hora < 10) horaS = "0"+horaS;
        if(minuto < 10) minutoS = "0"+minutoS;
        if(segundo < 10) segundoS = "0"+segundoS;

        return(horaS + ":" + minutoS + ":" + segundoS);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Horario other = (Horario) obj;
        if (this.hora != other.hora) {
            return false;
        }
        if (this.minuto != other.minuto) {
            return false;
        }
        if (this.segundo != other.segundo) {
            return false;
        }
        return true;
    }
    
    
}
