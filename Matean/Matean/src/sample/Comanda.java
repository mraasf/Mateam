package sample;

public class Comanda {
    private Pedido[] pedidos;

    public Double calculaPreco() {
        Double total = Double.valueOf(0);// variavelque recebe  o total

        for (int i=0; i<pedidos.length; i++) {
            Pedido um = pedidos[i];
            total+=um.calculaPreco();// calcula o valor da comanda de acordo com os itens
        }

        return total;
    }
}
