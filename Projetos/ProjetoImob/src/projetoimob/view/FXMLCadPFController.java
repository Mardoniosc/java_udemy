/*
 * Controle do FXML para o cadastro de Pessoa Fisica
 */
package projetoimob.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTabPane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
