package sample;

public class Mesa {
    private Integer numeroMesa;
    private Integer numOcupantes;
    private boolean estaLivre = true;
    private Comanda comanda;
    private Integer capacidade;

    // ocupa a mesa
    public void ocuparMesa(int numOcupantes) {
        if (numOcupantes<=this.capacidade && estaLivre) {
            this.numOcupantes = numOcupantes; // define o numerodecoupantes da mesa
            this.estaLivre = false; // define que a mesa esta ocupada
            this.comanda = new Comanda(); // cria uma nova comanda
        }
        else {
            return;
        }
    }
// libera a mesa
    public void desocuparMesa(double valorPago) {
        Double total = comanda.calculaPreco(); // calcula o total
        if (valorPago>=total) {
            this.numOcupantes = 0; // zera o numero de ocupantes
            this.estaLivre = true; // define a mesa como livre
            this.comanda = null; // define a comanda como null
        }
    }

    public Mesa(Integer numero){
        this.numeroMesa= numero;
    }
    @Override
    public String toString(){
        return this.numeroMesa.toString();
    }
}
