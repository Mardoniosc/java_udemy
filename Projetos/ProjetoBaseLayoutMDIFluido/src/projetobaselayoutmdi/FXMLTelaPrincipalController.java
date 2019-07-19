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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    @FXML
    private Button btnChamarFXMLExterno;

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
                    //Deixar o AncorPane FXMLMDI01
                    AnchorPane.setTopAnchor(a, 0.0);
                    AnchorPane.setLeftAnchor(a, 0.0);
                    AnchorPane.setRightAnchor(a, 0.0);
                    AnchorPane.setBottomAnchor(a, 0.0);
                    
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
                    //Deixar o AncorPane FXMLMDI02 FLUIDO ou ancorado em todos os lados
                    AnchorPane.setTopAnchor(a, 0.0);
                    AnchorPane.setLeftAnchor(a, 0.0);
                    AnchorPane.setRightAnchor(a, 0.0);
                    AnchorPane.setBottomAnchor(a, 0.0);
                    
                    // chamar dentro do apMenuEsquerdo FXMLAPmenuesquerdo
                    apMenuEsquerdo.getChildren().setAll(a);
                    
                } catch (IOException ex) {
                    Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        //evento para o botão acompanhar a largura da ApMenuDireito
        btnMDI1.prefWidthProperty().bind(apMenuDireito.widthProperty());
        //evento para o botão acompanhar a largura da ApMenuDireito
        btnMDI2.prefWidthProperty().bind(apMenuDireito.widthProperty());
        
        
        //foi criada a ação do click no botão
        btnChamarFXMLExterno.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("FXMLExterno.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    
                } catch (IOException ex) {
                    Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }    
    
}
