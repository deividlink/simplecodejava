package simplecode;

import java.time.LocalDateTime;

public class Hora {
    private int hora;
    private int min;
    private int sec;

    public int getHora(){
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        this.hora = dataHoraAtual.getHour();
        return hora;
    }   
    public int getMinuto(){
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        this.min = dataHoraAtual.getMinute();
        return min;
    }
    public int getSegundos(){
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        this.sec = dataHoraAtual.getSecond();
        return sec;
    } 
}
