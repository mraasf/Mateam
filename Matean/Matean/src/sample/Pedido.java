package sample;

public class Pedido {
    private Prato prato;
    private Integer quantidade;

    public Double calculaPreco() {
        return this.prato.getValor() * this.quantidade;
    }// calcula  o preco,retornado o calor x a quantidade
}
