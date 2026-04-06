/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.edu.tds.telalogin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    private void abrirTelalogin() throws IOException {
        App.setRoot("telaLogin");
    }
    @FXML
    private void cadastrarUsuario(){
        String nome = txtNome.getText();
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        String email = txtEmail.getText();
        String cpf = txtCPF.getText();
        
        if(nome.isEmpty() && usuario.isEmpty() && senha.isEmpty() && email.isEmpty() && cpf.isEmpty()){
            lblNome.setText("* Nome é obrigatório");
            lblUsuario.setText("* Usuário é obrigatório");
            lblSenha.setText("* Senha é obrigatório");
            lblEmail.setText("* Email é obrigatório");
            lblCPF.setText("* CPF é obrigatório");
            System.out.println("Todos os campos são obrigatórios!");
            return;
        }
        if(nome.isEmpty()){
            lblNome.setText("* Nome é obrigatório");
            lblUsuario.setText("");
            lblSenha.setText("");
            lblEmail.setText("");
            lblCPF.setText("");
            System.out.println("Campo nome é obrigatório !");
            return;
        }
        if(usuario.isEmpty()){
            lblNome.setText("");
            lblUsuario.setText("* Usuário é obrigatório");
            lblSenha.setText("");
            lblEmail.setText("");
            lblCPF.setText("");
            System.out.println("Campo usuário é obrigatório !");
            return;
        }
        if(senha.isEmpty()){
            lblNome.setText("");
            lblUsuario.setText("");
            lblSenha.setText("* Senha é obrigatório");
            lblEmail.setText("");
            lblCPF.setText("");
            System.out.println("Campo senha é obrigatório !");
            return;
        }
        if(email.isEmpty()){
            lblNome.setText("");
            lblUsuario.setText("");
            lblSenha.setText("");
            lblEmail.setText("* Email é obrigatório");
            lblCPF.setText("");
            System.out.println("Campo email é obrigatório !");
            return;
        }
        if(cpf.isEmpty()){
            lblNome.setText("");
            lblUsuario.setText("");
            lblSenha.setText("");
            lblEmail.setText("");
            lblCPF.setText("* CPF é obrigatório");
            System.out.println("Campo cpf é obrigatório !");
            return;
        }
        lblNome.setText("");
        lblUsuario.setText("");
        lblSenha.setText("");
        lblEmail.setText("");
        lblCPF.setText("");
        System.out.println("Nome   : " + nome);
        System.out.println("Usuário: " + usuario);
        System.out.println("Senha  : " + senha);
        System.out.println("Email  : " + email);
        System.out.println("CPF    : " + cpf);
        
        //Cadastrando um usuário
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = new Usuario (nome, usuario, email, senha, cpf);
        dao.cadastrar(u);
    }
}
    

