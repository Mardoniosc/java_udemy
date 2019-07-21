/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoimob.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MVM
 */
public class FXMLCadastrosController implements Initializable {

    @FXML
    private Button btnCadImoUrb;
    @FXML
    private Button btnCadImobiliarias;
    @FXML
    private Button btnCadCorretores;
    @FXML
    private Button btnCadImoRur;
    @FXML
    private Button btnCadCliePF;
    @FXML
    private Button btnCadCliPJ;
    @FXML
    private Button btnCadCidades;
    @FXML
    private Button btnCadLogra;
    @FXML
    private Button btnCadPrestServ;
    @FXML
    private Button btnCadEstados;
    @FXML
    private Button btnCadBairros;
    @FXML
    private Button btnCadLogin;
    @FXML
    private Button btnCadFunc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void abrirFXMLCadPF(ActionEvent event) {
        try {
                    Stage stage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("FXMLCadPF.fxml"));
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    
                } catch (IOException ex) {
                    Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }

        
    }

}

