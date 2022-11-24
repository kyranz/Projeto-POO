package fatec.poo.model;

import java.util.ArrayList;

public class Atendente extends Pessoa {
    private String regFunc;
    private String turno;  
    private ArrayList<QuartoHotel> quartos;

    
    public Atendente(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
        quartos = new ArrayList<>();
    }
 
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getRegFunc() {
        return regFunc;
    }
    
    public void addQuartoHotel(QuartoHotel q) {
        quartos.add(q);
    }
    
    
}
