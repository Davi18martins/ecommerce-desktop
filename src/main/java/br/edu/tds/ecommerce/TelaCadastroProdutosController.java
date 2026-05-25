/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.edu.tds.ecommerce;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author aluno
 */
public class TelaCadastroProdutosController implements Initializable {

    @FXML 
    private TextField txtNome;
    @FXML 
    private TextField txtPreco;
    @FXML 
    private TextField txtQuantidade;
    @FXML 
    private TextField txtImagem;
    @FXML 
    private TextArea txtDescricao;
    @FXML 
    private ComboBox<String> cbCategoria;
    @FXML
    private CheckBox cAtivo;
    @FXML
    private Produto produtoEdicao;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cbCategoria.getItems().add(0,"Nissan");
        cbCategoria.getItems().add(1,"Mazda");
        cbCategoria.getItems().add(2,"Toyota");
        cbCategoria.getItems().add(3,"Honda");
    }

    private boolean validarCampos(){
        
        boolean validado = true;
        
        if(txtNome.getText().isEmpty()){
            txtNome.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
            validado = false;
        }
        if(txtPreco.getText().isEmpty()){
            txtPreco.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
            validado = false;
        }
        if(txtQuantidade.getText().isEmpty()){
            txtQuantidade.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
            validado = false;
        }
        if(txtImagem.getText().isEmpty()){
            txtImagem.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
            validado = false;
        }
        
        return validado;
        
       
    }
    @FXML
    private void salvarProduto() throws Exception{
        txtNome.setStyle("-fx-border-color:  black; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtPreco.setStyle("-fx-border-color:  black; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtQuantidade.setStyle("-fx-border-color:  black; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtImagem.setStyle("-fx-border-color:  black; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        
        boolean status= validarCampos();
        
        if(status){
            //salvo os dados do produto no banco de dados
            
            Produto p = new Produto();
            p.setNome(txtNome.getText());
            p.setCategoria(cbCategoria.getValue());
            p.setPreco(Double.parseDouble(txtPreco.getText()));
            p.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            p.setImagem(txtImagem.getText());
            p.setDescricao(txtDescricao.getText());
            p.setAtivo(cAtivo.isSelected());
            
            ProdutoDAO dao = new ProdutoDAO();
            dao.cadastrarProduto(p);
            mostrarAlerta("Produto cadastro com sucesso!");
            
            
        }else{
            //corrigir informações do formulário
            mostrarAlerta("Todos os campos são obrigatórios");
        }
    }
    
    private void mostrarAlerta(String msg){
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Sistemas");
    alert.setHeaderText(null);
    alert.setContentText(msg);
    alert.showAndWait();
    }
    
    public void setProduto(Produto p){
        
        produtoEdicao = p;
        txtNome.setText(produtoEdicao.getNome());
        cbCategoria.setValue(produtoEdicao.getCategoria());
        txtPreco.setText(String.valueOf(produtoEdicao.getPreco()));
        txtQuantidade.setText(String.valueOf(produtoEdicao.getQuantidade()));
        txtImagem.setText(produtoEdicao.getImagem());
        txtDescricao.setText(produtoEdicao.getDescricao());
        cAtivo.setSelected(produtoEdicao.isAtivo());
    }
}
