/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexao {
    public Statement stm =null; // prepara e realiza pesquisas no banco
    public ResultSet rs =null; // armazena o resultado de uma pesquisa passada para o Statement
    public Connection conection; // responsavel por realizar a conexao com o banco
    
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/banco_mega?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private String user = "root";
    private String pass = "102030";
    
        
    public void conectabanco() {
        try {
            Class.forName(driver);
             conection = DriverManager.getConnection(caminho, user, pass); // realiza a conexao com o banco
            JOptionPane.showMessageDialog(null, "Conectado!"); // mensagem de erro, caso ocorra algum
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha na conexão!\n" + ex);
            
        }
        
        
    }
    
}
