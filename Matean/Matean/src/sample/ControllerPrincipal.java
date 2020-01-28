package sample;


import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class ControllerPrincipal {

    @FXML
    private ComboBox<String> comboBoxOcupadas;

    @FXML
    private Button botaoReservarMesa; // reseva a messa

    @FXML
    private ComboBox<Funcionario> comboBoxGarcom = new ComboBox<Funcionario>();
    private List<Funcionario> funcionarios = new ArrayList<>(); //cria o arraylist de funcionarios
    ObservableList<Funcionario> obsFuncionario;

    @FXML
    private ListView<Mesa> listViewOcupadas; // lista ocupadas

    @FXML
    private ListView<Mesa> listViewReservadas; // lista as reservadas

    @FXML
    private Button botaoDesocuparMesa; // desocupa a mesa

    @FXML
    private ListView<Mesa> listViewLivres; // lista as mesas livres

    @FXML
    private Button botaoAbrirMesa; // iniicia a comanda abrindo a mesa

    @FXML
    private ComboBox<String> comboBoxPedidos;

    private List<Mesa> mesas = new ArrayList<>(); // croia o arraylist de mesas
    private List<Mesa> mesasOcupadas = new ArrayList<>(); // crai o arraylist de mesas ocupadas

    private ObservableList<Mesa> obsMesas; // observa o estado das mesas
    private ObservableList<Mesa> obsMesasOcupadas; // observa as ocupadas
    private Object FXCollections;

    public ControllerPrincipal(){
        mesas = new ArrayList<>();


    }

    public void carregarMesas(){
        Mesa mesa1 = new Mesa(1);

        Mesa mesa2 = new Mesa(2);
        Mesa mesa3 = new Mesa(3);
        Mesa mesa4 = new Mesa(4);
        Mesa mesa5 = new Mesa(5);

        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
        mesas.add(mesa5);

        obsMesas = FXCollections.observableArrayList((mesas));
        obsMesasOcupadas = FXCollections.observableArrayList((mesas));
        listViewLivres.setItems(obsMesasOcupadas);
    }
    @FXML
    public void initialize(){
        System.out.println("boa noite major!");
        carregarMesas();
        Funcionario func1 = new Funcionario("Chico", 38, "pois nao patrao ");//  cria o funcionario 0
        funcionarios.add(func1);


        

    }
}
