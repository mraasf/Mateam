package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ControllerPedidos {

    @FXML
    private TableColumn<?, ?> colunaGarcom;

    @FXML
    private Button botaoCozinha;

    @FXML
    private Button botaoAdicionar;

    @FXML
    private ComboBox<?> comboBoxGarcom;

    @FXML
    private TableView<?> tabelaPedidos;

    @FXML
    private ComboBox<?> comboBoxPedidoAtual;

    @FXML
    private Button botaoEditarPedido; // muda o pedido

    @FXML
    private TableColumn<?, ?> colunaHorario;

    @FXML
    private TableColumn<?, ?> colunaPedido;

    @FXML
    private Button botaoFecharMesa; // encerra a conta

    @FXML
    private TableColumn<?, ?> colunaMesa;

    @FXML
    private Button botaoEliminar; // exclui itens

    @FXML
    private TextArea textAreaComentarios;

}
