package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControllerComanda {






        @FXML
        private TableColumn<?, ?> colunaGarcom;

        @FXML
        private TableColumn<?, ?> colunaValor;

        @FXML
        private TextField textFieldDesconto; //exibe o desconto

        @FXML
        private TableColumn<?, ?> colunaPedido;

        @FXML
        private TableView<?> tabelaComanda;

        @FXML
        private Button botaoFinalizarPedido; // finaliza o pedido

        @FXML
        private TextField textFieldTotal; // exibe o total

        @FXML
        private Button botaoAplicarDesconto; // aplica o desconto ao clicar

        @FXML
        private Button botaoLiberarMesa;; // libera  a mesa



}
