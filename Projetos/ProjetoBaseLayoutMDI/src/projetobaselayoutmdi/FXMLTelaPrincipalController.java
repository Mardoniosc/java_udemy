package projetobaselayoutmdi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class FXMLTelaPrincipalController implements Initializable {

    @FXML
    private AnchorPane apPrincipal;
    @FXML
    private AnchorPane apMenuDireito;
    @FXML
    private ImageView imgLogoTipo;
    @FXML
    private Button btnMDI1;
    @FXML
    private Button btnMDI2;
    @FXML
    private AnchorPane apMenuEsquerdo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        //foi criada a ação do click no botão
        btnMDI1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    // Colocando no objeto a o FxmlMDI01 
                    AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLMDI01.fxml"));
                    
                    // chamar dentro do apMenuEsquerdo FXMLAPmenuesquerdo
                    apMenuEsquerdo.getChildren().setAll(a);
                    
                } catch (IOException ex) {
                    Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        //foi criada a ação do click no botão
        btnMDI2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    // Colocando no objeto a o FxmlMDI01 
                    AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLMDI02.fxml"));
                    
                    // chamar dentro do apMenuEsquerdo FXMLAPmenuesquerdo
                    apMenuEsquerdo.getChildren().setAll(a);
                    
                } catch (IOException ex) {
                    Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }    
    
}
