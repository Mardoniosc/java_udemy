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
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author MVM
 */
public class FXMLTelaPrincipalController implements Initializable {

    @FXML
    private AnchorPane apPrincipal;
    @FXML
    private AnchorPane apMenuEsquerdo;
    @FXML
    private ImageView imgLogoTipo;
    @FXML
    private Button btnHome;
    @FXML
    private AnchorPane apMenuDireito;
    @FXML
    private VBox vboxMenuEsquerdo;
    @FXML
    private Button btnAtendimentos;
    @FXML
    private Button btnAgendamentos;
    @FXML
    private Button btnCadastros;
    @FXML
    private Button btnPesquisas;
    @FXML
    private Button btnRelatorios;
    @FXML
    private Button btnPagamentos;
    @FXML
    private Button btnSair;

    /**
     * Initializes the controller class
     * Metodo de incialização do FXMLTelaPrincipal
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        botaoSelecionadoCor("#9a0000", "#2A2A2A", "#2A2A2A", "#2A2A2A", "#2A2A2A"
                , "#2A2A2A", "#2A2A2A");
        abrirFormularioNoMenuEsquerdo("FXMLHome");
    }    

    // Metodo para clicar no botão e chamar o FXML passado por argumento
    private void abrirFormularioNoMenuEsquerdo(String nomeFormulario){
        try {
            // Colocando no objeto a o FxmlMDI01 
            AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource(nomeFormulario + ".fxml"));
            //Deixar o AncorPane FXMLMDI01
            AnchorPane.setTopAnchor(a, 0.0);
            AnchorPane.setLeftAnchor(a, 0.0);
            AnchorPane.setRightAnchor(a, 0.0);
            AnchorPane.setBottomAnchor(a, 0.0);

            // chamar dentro do apMenuEsquerdo FXMLAPmenuesquerdo
            apMenuDireito.getChildren().setAll(a);

        } catch (IOException ex) {
            Logger.getLogger(FXMLTelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodo para mudar a cor do botão quando clicado
    public void botaoSelecionadoCor(String btnHo, String btnAt, String btnAg, 
            String btnCa, String btnPe, String btnRe, String btnPa){
        
        btnAgendamentos.setStyle("-fx-background-color: "+ btnAg +";");
        btnAtendimentos.setStyle("-fx-background-color: "+ btnAt +";");
        btnCadastros.setStyle("-fx-background-color: "+ btnCa +";");
        btnHome.setStyle("-fx-background-color: "+ btnHo +";");
        btnPagamentos.setStyle("-fx-background-color: "+ btnPa +";");
        btnPesquisas.setStyle("-fx-background-color: "+ btnPe +";");
        btnRelatorios.setStyle("-fx-background-color: "+ btnRe +";");
    }
    
    @FXML// Metodo para abrir home ou FXMLHome.fxml dentro do apMenuDireito
    private void abrirHome(ActionEvent event) {
        botaoSelecionadoCor("#9a0000", "#2A2A2A", "#2A2A2A", "#2A2A2A", "#2A2A2A"
                , "#2A2A2A", "#2A2A2A");
        
        abrirFormularioNoMenuEsquerdo("FXMLHome");
    }
       
    @FXML// Metodo para abrir home ou Atendimentos.fxml dentro do apMenuDireito
    private void abrirAtendimentos(ActionEvent event) {
        botaoSelecionadoCor("#2A2A2A", "#9a0000", "#2A2A2A", "#2A2A2A", "#2A2A2A"
                , "#2A2A2A", "#2A2A2A");
        abrirFormularioNoMenuEsquerdo("FXMLAtendimentos");
    }

    @FXML// Metodo para abrir home ou Agendamentos.fxml dentro do apMenuDireito
    private void abrirAgendamentos(ActionEvent event) {
        botaoSelecionadoCor("#2A2A2A", "#2A2A2A", "#9a0000", "#2A2A2A", "#2A2A2A"
                , "#2A2A2A", "#2A2A2A");
        abrirFormularioNoMenuEsquerdo("FXMLAgendamentos");
    }

    @FXML// Metodo para abrir home ou Cadastros.fxml dentro do apMenuDireito
    private void abrirCadastros(ActionEvent event) {
        botaoSelecionadoCor("#2A2A2A", "#2A2A2A", "#2A2A2A", "#9a0000", "#2A2A2A"
                , "#2A2A2A", "#2A2A2A");
        abrirFormularioNoMenuEsquerdo("FXMLCadastros");
    }

    @FXML// Metodo para abrir home ou Pesquisas.fxml dentro do apMenuDireito
    private void abrirPesquisas(ActionEvent event) {
        botaoSelecionadoCor("#2A2A2A", "#2A2A2A", "#2A2A2A", "#2A2A2A", "#9a0000"
                , "#2A2A2A", "#2A2A2A");
        abrirFormularioNoMenuEsquerdo("FXMLPesquisas");
    }

    @FXML// Metodo para abrir home ou Relatorios.fxml dentro do apMenuDireito
    private void abrirRelatorios(ActionEvent event) {
        botaoSelecionadoCor("#2A2A2A", "#2A2A2A", "#2A2A2A", "#2A2A2A", "#2A2A2A"
                , "#9a0000", "#2A2A2A");
        abrirFormularioNoMenuEsquerdo("FXMLRelatorios");
    }

    @FXML// Metodo para abrir home ou Pagamentos.fxml dentro do apMenuDireito
    private void abrirPagamentos(ActionEvent event) {
        botaoSelecionadoCor("#2A2A2A", "#2A2A2A", "#2A2A2A", "#2A2A2A", "#2A2A2A"
                , "#2A2A2A", "#9a0000");
        abrirFormularioNoMenuEsquerdo("FXMLPagamentos");
    }
    
    //Metodo para mudar a cor do botão selecionado

    @FXML
    private void sairSistema(ActionEvent event) {
        System.exit(0);
        
    }
    
}
