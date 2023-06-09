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
    public String getHoras(){
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        this.hora = dataHoraAtual.getHour();
        String h = "" + hora;
        this.min = dataHoraAtual.getMinute();
        String m = "" + min;
        this.sec = dataHoraAtual.getSecond();
        String s = "" + sec;
        if(hora < 10){
            h = "0" + hora; 
        }
        if(min < 10){
            m = "0" + min;
        }
        if(sec < 10){
            s= "0" + sec;
        }


        String msg = h + ":" + m + ": " + s;
        return msg;
    }
}
