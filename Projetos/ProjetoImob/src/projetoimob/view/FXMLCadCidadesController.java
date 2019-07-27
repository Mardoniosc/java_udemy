/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoimob.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import projetoimob.model.DTO.Cidades;
import projetoimob.model.DTO.Estados;
import projetoimob.model.dao.CidadesDAO;
import projetoimob.model.dao.EstadosDAO;
import projetoimob.model.database.DataBase;
import projetoimob.model.database.DataBaseFactory;

/**
 * FXML Controller class
 *
 * @author P772920
 */
public class FXMLCadCidadesController implements Initializable {

    @FXML
    private AnchorPane apPrincipal;
    @FXML
    private Label lblFecharCadastro;
    @FXML
    private JFXTextField txtCodigoCidade;
    @FXML
    private JFXTextField txtNomeCidade;
    @FXML
    private JFXComboBox<Estados> cmbEstado;
    @FXML
    private JFXButton btnLimpar;
    @FXML
    private JFXButton btnSalvar;
    @FXML
    private JFXButton btnDeletar;
    @FXML
    private JFXButton btnAtualizar;
    @FXML
    private TableView<Cidades> tbCidade;
    @FXML
    private TableColumn<Cidades, Integer> colunaCodigoCidade;
    @FXML
    private TableColumn<Cidades, String> colunaNomeCidade;
    private TableColumn<Estados, String> colunaSiglaEstado;
    
    //buscar os dados do banco de dados com um List
    private List<Cidades> listCidades;
    private List<Estados> listEstados;
    //jogar  na ViemTable com o ObservableList, é necessário usar
    private ObservableList<Cidades> observableCidades;
    private ObservableList<Estados> observableEstados;
    
    //Atributos para manipulação de Banco de Dados
    private final DataBase database = DataBaseFactory.getDataBase("mysql");
    private final Connection connection = database.conectar();
    private final EstadosDAO estadosDAO = new EstadosDAO();
    private final CidadesDAO cidadeDAO = new CidadesDAO();
    @FXML
    private TableColumn<?, ?> colunaEstado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        estadosDAO.setConnection(connection);
        cidadeDAO.setConnection(connection);
        
        //metodo para povoar cmbEstado
        carregarEstadoNocmbEstado();
        carregaCidadesNaTableView();
    }    

    @FXML
    private void fecharCadastro(MouseEvent event) {
        Stage st = (Stage) lblFecharCadastro.getScene().getWindow();// obtem a janela atual
        st.close();//fecha a stage
    }

    @FXML
    private void selecionarLinhaViewTable(MouseEvent event) {
    }

    @FXML
    private void limparCampos(ActionEvent event) {
        limparCampos();
    }

    @FXML
    private void inserirDaddosNoBancoDados(ActionEvent event) {
    }

    @FXML
    private void deletarEstadoSelecionado(ActionEvent event) {
    }

    @FXML
    private void atualizarEstadoSelecionado(ActionEvent event) {
    }
 
    public void limparCampos(){
        txtCodigoCidade.setText("");
        txtNomeCidade.setText("");
        cmbEstado.getSelectionModel().select(null);
    }
    
    public void carregarEstadoNocmbEstado(){
        listEstados = estadosDAO.lista();
        observableEstados = FXCollections.observableArrayList(listEstados);
        cmbEstado.setItems(observableEstados);
        
    }
    
    public void carregaCidadesNaTableView()
    {
        colunaCodigoCidade.setCellValueFactory(new PropertyValueFactory<>("id_Cidades"));
        colunaNomeCidade.setCellValueFactory(new PropertyValueFactory<>("nome_Cidades"));
        colunaEstado.setCellValueFactory(new PropertyValueFactory<>("sigla_Estado"));
        
        listCidades = cidadeDAO.listarCidadesEstados();
        
        observableCidades = FXCollections.observableArrayList(listCidades);
        
        tbCidade.setItems(observableCidades);
    }
    
}
