package fatec.poo.model;

public class Hospede extends Pessoa {
    String cpf;
    double txDesconto;
    QuartoHotel quartoHotel;

    public Hospede(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public void setTxDesconto(double txDesconto) {
        this.txDesconto = txDesconto;
    }

    public void setQuartoHotel(QuartoHotel quartoHotel) {
        this.quartoHotel = quartoHotel;
    }

    public String getCpf() {
        return cpf;
    }

    public double getTxDesconto() {
        return txDesconto/100;
    }

    public QuartoHotel getQuartoHotel() {
        return quartoHotel;
    }

    
}
