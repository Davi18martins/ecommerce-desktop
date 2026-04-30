/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.edu.tds.telalogin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aluno
 */
public class TelaCadastroUsuarioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtSenha;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtCPF;
    @FXML
    private Label lblNome;
    @FXML
    private Label lblUsuario;
    @FXML
    private Label lblSenha;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblCPF;
    @FXML
    private Text txtTelaEditarUsuario;
    @FXML
    private Button btnCadastrar;
    
    private Usuario usuarioEdicao;
    
    @FXML
    private void abrirTelalogin() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/edu/tds/telalogin/telaLogin.fxml"));
        
        Parent root =loader.load();
        
        TelaLoginController controller =loader.getController();
        
       
        
        //Trocando de tela
        Stage stage = (Stage) txtNome.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    @FXML
    private void cadastrarUsuario() throws IOException{ 
        
        if(usuarioEdicao == null){
            inserirUsuario();
        }
        else{
            atualizarUsuario();
        }
        
    }
    private void inserirUsuario() throws IOException{ 
        
        txtNome.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtUsuario.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtSenha.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtEmail.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtCPF.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        
        String nome = txtNome.getText();
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        String email = txtEmail.getText();
        String cpf = txtCPF.getText();
        
        if(nome.isEmpty()){
            txtNome.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        if(usuario.isEmpty()){
            txtUsuario.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        if(senha.isEmpty()){
            txtSenha.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        if(email.isEmpty()){
            txtEmail.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        if(cpf.isEmpty()){
            txtCPF.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        System.out.println("Nome   : " + nome);
        System.out.println("Usuário: " + usuario);
        System.out.println("Senha  : " + senha);
        System.out.println("Email  : " + email);
        System.out.println("CPF    : " + cpf);
        
        //Cadastrando um usuário
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = new Usuario (nome, usuario, email, senha, cpf);
        dao.cadastrar(u);
        mostrarAlerta("O cadastro de " + u.getNomeCompleto()+ "foi cadastrado com sucesso!");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/edu/tds/telalogin/TelaGerenciamentoUsuariosController.fxml"));
        
            Parent root =loader.load();
        
            TelaGerenciamentoUsuariosController controller =loader.getController();
        
       
        
            //Trocando de tela
            Stage stage = (Stage) txtUsuario.getScene().getWindow();
            stage.setScene(new Scene(root));
    }
    
    private void atualizarUsuario() throws IOException{ 
        
        txtNome.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtUsuario.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtSenha.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtEmail.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        txtCPF.setStyle("-fx-border-color:  #277CE0; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        
        String nome = txtNome.getText();
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        String email = txtEmail.getText();
        String cpf = txtCPF.getText();
        
        if(nome.isEmpty()){
            txtNome.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        if(usuario.isEmpty()){
            txtUsuario.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        if(senha.isEmpty()){
            txtSenha.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        if(email.isEmpty()){
            txtEmail.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        if(cpf.isEmpty()){
            txtCPF.setStyle("-fx-border-color: red; -fx-border-width: 0px0px3px0px; -fx-background-color: transparet;");
        }
        System.out.println("Nome   : " + nome);
        System.out.println("Usuário: " + usuario);
        System.out.println("Senha  : " + senha);
        System.out.println("Email  : " + email);
        System.out.println("CPF    : " + cpf);
        
        //Atualizando um usuário
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = new Usuario (nome, usuario, email, senha, cpf);
        dao.atualizar(u);
        mostrarAlerta("O cadastro de " + u.getNomeCompleto()+ "foi atualizado com sucesso!");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/br/edu/tds/telalogin/TelaGerenciamentoUsuariosController.fxml"));
        
            Parent root =loader.load();
        
            TelaGerenciamentoUsuariosController controller =loader.getController();
        
       
        
            //Trocando de tela
            Stage stage = (Stage) txtUsuario.getScene().getWindow();
            stage.setScene(new Scene(root));;
    }
    
    public void setUsuario(Usuario u){
        
        usuarioEdicao = u;
        txtNome.setText(u.getNomeCompleto());
        txtUsuario.setText(u.getNomeUsuario());
        txtSenha.setText(u.getSenha());
        txtEmail.setText(u.getEmail());
        txtCPF.setText(u.getCpf());
        
        txtTelaEditarUsuario.setText("Atualizar conta de usuário");
        btnCadastrar.setText("Atualizar");
    }
    
    private void mostrarAlerta(String msg){
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Sistemas");
    alert.setHeaderText(null);
    alert.setContentText(msg);
    alert.showAndWait();
   }
    
}
    