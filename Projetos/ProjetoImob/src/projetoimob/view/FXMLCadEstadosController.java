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
import java.sql.SQLException;
import java.util.List;
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
import javax.swing.JOptionPane;
import projetoimob.model.dao.EstadosDAO;
import projetoimob.model.database.DataBase;
import projetoimob.model.database.DataBaseFactory;
import projetoimob.model.DTO.Bairro;
import projetoimob.model.DTO.Estados;

/**
 * FXML Controller class
 *
 * @author fschi
 */
public class FXMLCadEstadosController implements Initializable {

    @FXML
    private AnchorPane apPrincipal;
    @FXML
    private Label lblFecharCadastro;
    private JFXTextField txtCodigoEstado;
    private JFXTextField txtNomeEstado;
    private JFXTextField txtSiglaEstado;
    @FXML
    private TableView<Estados> tbEstados;
    @FXML
    private JFXButton btnLimpar;
    @FXML
    private JFXButton btnSalvar;
    @FXML
    private TableColumn<Estados, Integer> colunaCodigoEstado;
    @FXML
    private TableColumn<Estados, String> colunaNomeEstado;
    @FXML
    private TableColumn<Estados, String> colunaSiglaEstado;
    @FXML
    private JFXButton btnDeletar;
    @FXML
    private JFXButton btnAtualizar;
    
    //buscar os dados do banco de dados com um List
    private List<Estados> listEstados;
    //jogar  na ViemTable com o ObservableList, é necessário usar
    private ObservableList<Estados> observableEstados;
    
    //Atributos para manipulação de Banco de Dados
    private final DataBase database = DataBaseFactory.getDataBase("mysql");
    private final Connection connection = database.conectar();
    private final EstadosDAO estadosDAO = new EstadosDAO();
    @FXML
    private JFXTextField txtCodigoCidade;
    @FXML
    private JFXTextField txtNomeCidade;
    @FXML
    private JFXComboBox<?> cmbEstado;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //conexão com o banco de dados
        estadosDAO.setConnection(connection);
        
        carregaEstadosNaTableView();
    } 
    
    //método para poder trabalhar com os Estados no banco
    public void carregaEstadosNaTableView()
    {
        colunaCodigoEstado.setCellValueFactory(new PropertyValueFactory<>("id_Estado"));
        colunaNomeEstado.setCellValueFactory(new PropertyValueFactory<>("nome_Estado"));
        colunaSiglaEstado.setCellValueFactory(new PropertyValueFactory<>("sigla_Estado"));
        
        listEstados = estadosDAO.lista();
        
        observableEstados = FXCollections.observableArrayList(listEstados);
        tbEstados.setItems(observableEstados);
    }

    @FXML//Méto para fchar a stage FXMLCadEstados
    private void fecharCadastro(MouseEvent event) {
        
        Stage st = (Stage) lblFecharCadastro.getScene().getWindow();// obtem a janela atual
        st.close();//fecha a stage
    }

    @FXML//Limpar os campos dos textfileds
    private void limparCampos(ActionEvent event) {
        limparCampos();
    }

    @FXML//Méto para inserir os dados digitados pelo ususário no banco de dados
    private void inserirDaddosNoBancoDados(ActionEvent event) {
        Estados estados = new Estados();
        
        estados.setNome_Estado(txtNomeEstado.getText());
        estados.setSigla_Estado(txtSiglaEstado.getText());
        
        estadosDAO.inserir(estados);
        limparCampos();
        carregaEstadosNaTableView();
    }
    
    public void limparCampos()
    {
        txtCodigoEstado.setText("");
        txtNomeEstado.setText("");
        txtSiglaEstado.setText("");
    }

    @FXML//Metodo para selecionar o que esta sendo seleciona na linha
    private void selecionarLinhaViewTable(MouseEvent event) {
        txtCodigoEstado.setText(String.valueOf(tbEstados.getSelectionModel().getSelectedItem().getId_Estado()));
        txtNomeEstado.setText(tbEstados.getSelectionModel().getSelectedItem().getNome_Estado());
        txtSiglaEstado.setText(tbEstados.getSelectionModel().getSelectedItem().getSigla_Estado());
    }

    @FXML
    private void deletarEstadoSelecionado(ActionEvent event) {
        Estados estado = new Estados();
        estado.setId_Estado(Integer.parseInt(txtCodigoEstado.getText()));
        
        estadosDAO.remover(estado);
        limparCampos();
        carregaEstadosNaTableView();
        JOptionPane.showMessageDialog(null, "Estado deletado com sucesso!");
        
        
    }

    @FXML
    private void atualizarEstadoSelecionado(ActionEvent event) {
        Estados estado = new Estados();
        estado.setId_Estado(Integer.parseInt(txtCodigoEstado.getText()));
        estado.setNome_Estado(txtNomeEstado.getText());
        estado.setSigla_Estado(txtSiglaEstado.getText());
        
        estadosDAO.alterar(estado);
        limparCampos();
        carregaEstadosNaTableView();
    }
    
    
}
