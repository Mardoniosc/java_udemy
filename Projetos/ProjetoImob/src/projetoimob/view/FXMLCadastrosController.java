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
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author fschi
 */
public class FXMLCadastrosController implements Initializable {

    @FXML
    private Button btnCadCliPF;
    @FXML
    private Button btnCadImoUr;
    @FXML
    private Button btnCadCliPJ;
    @FXML
    private Button btnCadImovRu;
    @FXML
    private Button btnCadCorretor;
    @FXML
    private Button btnCadImobiliaria;
    @FXML
    private Button btnCadFuncionairo;
    @FXML
    private Button btnCadPrestServ;
    @FXML
    private Button btnCadLogin;
    @FXML
    private Button btnCadLog;
    @FXML
    private Button btnCadBairro;
    @FXML
    private Button btnCadCidade;
    @FXML
    private Button btnCadEstado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void abrirFormularioExterno(String nomeFormulario){
        try
        {
            Stage stage = new Stage();

            Parent root = FXMLLoader.load(getClass().getResource(nomeFormulario + ".fxml"));

            Scene scene = new Scene(root);
            
            //para retirar todos os botões de minimizar, maximizar e fechar
            stage.initStyle(StageStyle.UNDECORATED);

            stage.setScene(scene);

            stage.show();//abria a stage

        } 
        catch (IOException ex)
        {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML//método para abrir o FXMLCadPF
    private void abrirFXMLCadPF(ActionEvent event)
    {
        abrirFormularioExterno("FXMLCadPF");
    }

    @FXML
    private void abrirFXMLCadEstados(ActionEvent event) {
        abrirFormularioExterno("FXMLCadEstados");
    }

    @FXML
    private void abrirFXMLCadCidades(ActionEvent event) {
        abrirFormularioExterno("FXMLCadCidades");
    }
    
}
