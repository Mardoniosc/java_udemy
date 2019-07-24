/*
 * Controle do FXML para o cadastro de Pessoa Fisica
 */
package projetoimob.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author MVM
 */
public class FXMLCadPFController implements Initializable {

    @FXML
    private AnchorPane apSuperior;
    @FXML
    private Pane pnSuperior;
    @FXML
    private AnchorPane apTabela;
    @FXML
    private JFXTabPane tablePaneCadastroCliente;
    @FXML
    private JFXButton bntSalvar;
    @FXML
    private JFXButton bntLimpar;
    @FXML
    private JFXTextField txtCodigoCliente;
    @FXML
    private JFXTextField txtNomeCliente;
    @FXML
    private JFXTextField txtSobrenomeCliente;
    @FXML
    private JFXTextField txtCPFCliente;
    @FXML
    private JFXTextField txtRGCliente;
    @FXML
    private JFXRadioButton rdbSexoM;
    @FXML
    private ToggleGroup sexo;
    @FXML
    private JFXRadioButton rdbSexoF;
    @FXML
    private JFXTextField txtCodigoAdicionais;
    @FXML
    private JFXComboBox<String> cmbEstado;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbEstado.getItems().add("DF");
        cmbEstado.getItems().add("GO");
        cmbEstado.getItems().add("SP");
        
    }    
    
}
