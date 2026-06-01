package br.edu.tds.ecommerce;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DashboardController {

    @FXML
    private BorderPane painelPrincipal;

    @FXML
    private void abrirUsuarios() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/edu/tds/ecommerce/TelaGerenciamentoUsuariosController.fxml"));
        
            Parent root =loader.load();
        
            TelaGerenciamentoUsuariosController controller =loader.getController();
        
       
        
            //Trocando de tela
            Stage stage = (Stage) painelPrincipal.getScene().getWindow();
            stage.setScene(new Scene(root));
            
        System.out.println("Abrir Usuários");
    }

    @FXML
    private void abrirProdutos() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/edu/tds/ecommerce/TelaGerenciamentoUsuariosController.fxml"));
        
            Parent root =loader.load();
        
            TelaGerenciamentoUsuariosController controller =loader.getController();
        
       
        
            //Trocando de tela
            Stage stage = (Stage) painelPrincipal.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setMaximized(false);
            
        
        System.out.println("Abrir Produtos");
    }

    @FXML
    private void abrirFornecedores() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/edu/tds/ecommerce/TelaGerenciamentoUsuariosController.fxml"));
        
            Parent root =loader.load();
        
            TelaGerenciamentoUsuariosController controller =loader.getController();
        
       
        
            //Trocando de tela
            Stage stage = (Stage) painelPrincipal.getScene().getWindow();
            stage.setScene(new Scene(root));
        
        System.out.println("Abrir fornecedores");
    }

    @FXML
    private void abrirVendas() throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/edu/tds/ecommerce/TelaGerenciamentoUsuariosController.fxml"));
        
            Parent root =loader.load();
        
            TelaGerenciamentoUsuariosController controller =loader.getController();
        
       
        
            //Trocando de tela
            Stage stage = (Stage) painelPrincipal.getScene().getWindow();
            stage.setScene(new Scene(root));

        System.out.println("Abrir vendas");
    }

    @FXML
    private void abrirFinanceiro() throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/edu/tds/ecommerce/TelaGerenciamentoUsuariosController.fxml"));
        
            Parent root =loader.load();
        
            TelaGerenciamentoUsuariosController controller =loader.getController();
        
       
        
            //Trocando de tela
            Stage stage = (Stage) painelPrincipal.getScene().getWindow();
            stage.setScene(new Scene(root));

        System.out.println("Abrir financeiro");
    }

    @FXML
    private void abrirRelatorios() throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/edu/tds/ecommerce/TelaGerenciamentoUsuariosController.fxml"));
        
            Parent root =loader.load();
        
            TelaGerenciamentoUsuariosController controller =loader.getController();
        
       
        
            //Trocando de tela
            Stage stage = (Stage) painelPrincipal.getScene().getWindow();
            stage.setScene(new Scene(root));

        System.out.println("Abrir relatórios");
    }

    @FXML
    private void logout() throws IOException {

        System.out.println("logout");
    }
}