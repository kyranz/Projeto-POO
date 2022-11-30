package fatec.poo.model;

public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private boolean situacao;
    private String dataEntrada;
    private double totalFaturado;
    private Hospede hospede;
    private Atendente atendente;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
    }
    
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    public void reservar(Hospede hospede, Atendente atendente){
       this.situacao = true; 
       this.hospede = hospede;
       this.atendente = atendente;
       
       atendente.addQuartoHotel(this);
       hospede.setQuartoHotel(this);
    }
    
    public double liberar(int dias, double taxaDesc){
        this.situacao = false;
        
        this.dataEntrada = null;
        
        this.hospede.setQuartoHotel(null);
        this.hospede = null;
        
        this.atendente = null;
        
        double valorFinal = this.valorDiaria * dias;
        valorFinal -= valorFinal * taxaDesc;
        
        this.totalFaturado += valorFinal;
        
        return valorFinal;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Atendente getAtendente() {
        return atendente;
    }
    
    
}
