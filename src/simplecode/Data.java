package simplecode;

import java.time.LocalDateTime;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia(){
        LocalDateTime datahora = LocalDateTime.now();
        this.dia = datahora.getDayOfMonth();
        return this.dia;
    }
    public int getMes(){
        LocalDateTime datahora = LocalDateTime.now();
        this.mes = datahora.getMonthValue();
        return this.mes;
    }
    public int getAno(){
        LocalDateTime datahora = LocalDateTime.now();
        this.ano = datahora.getYear();
        return this.ano;
    }
    public String getData(){
        LocalDateTime datahora = LocalDateTime.now();
        this.dia = datahora.getDayOfMonth();
        this.mes = datahora.getMonthValue();
        this.ano = datahora.getYear();
        String msg = dia + "/" + mes + "/" + ano;
        return msg;
    }

}
