/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoimob.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author fschi
 */
public class FXMLCadPFController implements Initializable {

    @FXML
    private Pane pnSuperior;
    @FXML
    private JFXComboBox<String> cmbSexo;
    @FXML
    private JFXComboBox<String> cmbEstadoCivilCliente;
    @FXML
    private JFXComboBox<String> cmbRegimeBensCliente;
    @FXML
    private JFXComboBox<String> cmbEstadoNaturalidade;
    @FXML
    private JFXComboBox<String> cmbEscolaridade;
    @FXML
    private Label lblFecharCadastro;
    @FXML
    private JFXComboBox<String> cmbLogradouro;
    @FXML
    private JFXComboBox<String> cmbEstadoLogradouro;
    @FXML
    private JFXComboBox<String> cmbAp;
    @FXML
    private JFXComboBox<String> cmbCT;
    @FXML
    private JFXComboBox<String> cmbSO;
    @FXML
    private JFXComboBox<String> cmbCO;
    @FXML
    private AnchorPane apTabela;
    @FXML
    private JFXTabPane tabPaneCadasatroCliente;
    @FXML
    private JFXTextField txtNomeCliente;
    @FXML
    private JFXTextField txtSobrenomeCliente;
    @FXML
    private JFXTextField txtCpfCleinte;
    @FXML
    private JFXTextField txtRgCliente;
    @FXML
    private JFXTextField txtNaturalidadeCliente;
    @FXML
    private JFXTextField txtProfissaoCliente;
    @FXML
    private JFXTextField txtNomePai;
    @FXML
    private JFXTextField txtNomeMae;
    @FXML
    private JFXTextField txtComplementoLogradouro;
    @FXML
    private JFXTextField txtCep;
    @FXML
    private JFXTextField txtNumeroLogradouro;
    @FXML
    private JFXTextField txtLogradouro;
    @FXML
    private JFXTextField txtNumeroApartamento;
    @FXML
    private JFXTextField txtAndarApartamento;
    @FXML
    private JFXTextField txtBlocoApartamento;
    @FXML
    private JFXTextField txtLatitude;
    @FXML
    private JFXTextField txtLongitude;
    @FXML
    private JFXTextArea txtReferenciasParaChegar;
    @FXML
    private JFXTextField txtCidade;
    @FXML
    private JFXTextField txtCodigoCliente;
    @FXML
    private JFXTextField txtCodigoCliente1;
    @FXML
    private JFXTextField txtCodigoCliente11;
    @FXML
    private JFXTextField txtCodigoCliente111;
    @FXML
    private JFXTextField txtCodigoCliente1111;
    @FXML
    private JFXTextField txtCodigoCliente11111;
    @FXML
    private JFXTextField txtCodigoCliente111111;
    @FXML
    private JFXButton btnSalvar;
    @FXML
    private JFXButton btnLimpar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //preencher o combobox
        cmbSexo.getItems().add("MASCULINO");
        cmbSexo.getItems().add("FEMININO");
        
        cmbEstadoCivilCliente.getItems().add("SOLTEIRO");
        cmbEstadoCivilCliente.getItems().add("CASADO");
        cmbEstadoCivilCliente.getItems().add("SEPARADO");
        cmbEstadoCivilCliente.getItems().add("DIVORCIADO");
        cmbEstadoCivilCliente.getItems().add("VIÚVO");
        cmbEstadoCivilCliente.getItems().add("UNIÃO ESTÁVEL");
        
        cmbRegimeBensCliente.getItems().add("NENHUM");        
        cmbRegimeBensCliente.getItems().add("COMUNHÃO PARCIAL DE BENS");
        cmbRegimeBensCliente.getItems().add("COMUNHÃO UNIVERSAL DE BENS");
        cmbRegimeBensCliente.getItems().add("SEPARAÇÃO TOTAL DE BENS");
        
        cmbEstadoNaturalidade.getItems().add("SP");
        
        cmbEscolaridade.getItems().add("FUNDAMENTO - INCOMPLETO");
        cmbEscolaridade.getItems().add("FUNDAMENTO - COMPLETO");
        cmbEscolaridade.getItems().add("MÉDIO - INCOMPLETO");
        cmbEscolaridade.getItems().add("MÉDIO - COMPLETO");
        cmbEscolaridade.getItems().add("SUPERIOR - INCOMPLETO");
        cmbEscolaridade.getItems().add("SUPERIOR - COMPLETO");
        cmbEscolaridade.getItems().add("PÓS GRADUAÇÃO - INCOMPLETO");
        cmbEscolaridade.getItems().add("PÓS GRADUAÇÃO - COMPLETO");
        
        cmbLogradouro.getItems().add("RUA");
        cmbLogradouro.getItems().add("AVENIDA");
        cmbLogradouro.getItems().add("ALAMEDA");
        cmbLogradouro.getItems().add("JARDIM"); 
        
        cmbLogradouro.getItems().add("AEROPORTO");         
        cmbLogradouro.getItems().add("ÁREA");          
        cmbLogradouro.getItems().add("CAMPO");
        cmbLogradouro.getItems().add("CHÁCARA");
        cmbLogradouro.getItems().add("COLÔNIA"); 
        cmbLogradouro.getItems().add("CONDOMÍNIO");
        cmbLogradouro.getItems().add("CONJUNTO");
        cmbLogradouro.getItems().add("DISTRITO");
        cmbLogradouro.getItems().add("ESPLANADA"); 
        cmbLogradouro.getItems().add("ESTAÇÃO");
        cmbLogradouro.getItems().add("ESTRADA");
        cmbLogradouro.getItems().add("FAVELA"); 
        cmbLogradouro.getItems().add("FEIRA"); 
        cmbLogradouro.getItems().add("JARDIM");         
        cmbLogradouro.getItems().add("LADEIRA"); 
        cmbLogradouro.getItems().add("LAGO");
        cmbLogradouro.getItems().add("LAGOA");
        cmbLogradouro.getItems().add("LARGO"); 
        cmbLogradouro.getItems().add("LOTEAMENTO");
        cmbLogradouro.getItems().add("MORRO");
        cmbLogradouro.getItems().add("NÚCLEO"); 
        cmbLogradouro.getItems().add("PARQUE");
        cmbLogradouro.getItems().add("PASSARELA");
        cmbLogradouro.getItems().add("PÁTIO"); 
        cmbLogradouro.getItems().add("PRAÇA"); 
        cmbLogradouro.getItems().add("QUADRA"); 
        cmbLogradouro.getItems().add("RECANTO");
        cmbLogradouro.getItems().add("RESIDENCIAL");
        cmbLogradouro.getItems().add("RODOVIA");        
        cmbLogradouro.getItems().add("SETOR"); 
        cmbLogradouro.getItems().add("SÍTIO");
        cmbLogradouro.getItems().add("TRAVESSA");
        cmbLogradouro.getItems().add("TRECHO");
        cmbLogradouro.getItems().add("TREVO");
        cmbLogradouro.getItems().add("VALE"); 
        cmbLogradouro.getItems().add("VEREDA"); 
        cmbLogradouro.getItems().add("VIA"); 
        cmbLogradouro.getItems().add("VIADUTO");
        cmbLogradouro.getItems().add("VIELA"); 
        cmbLogradouro.getItems().add("VILA"); 
        
        cmbEstadoLogradouro.getItems().add("SP");
        
        //combobox da aba Preferências
        //Aqui vai ter todos os campos dos combobox para o usuário
        //escolher como se fosse um questionário, onde será usado 
        //para filtrar o imóvel desejado
        cmbAp.getItems().add("SIM");
        cmbAp.getItems().add("NÂO");
        cmbCT.getItems().add("SIM");
        cmbCT.getItems().add("NÂO");
        cmbSO.getItems().add("SIM");
        cmbSO.getItems().add("NÂO");
        cmbCO.getItems().add("SIM");
        cmbCO.getItems().add("NÂO");
              
        
    }    

    @FXML//Método para fechar o form ou a Stage no caso do JavaFX
    private void fecharCadastro(MouseEvent event)
    {
        Stage st = (Stage) lblFecharCadastro.getScene().getWindow();// obtem a janela atual
        st.close();//fecha a stage
    }
    
}
