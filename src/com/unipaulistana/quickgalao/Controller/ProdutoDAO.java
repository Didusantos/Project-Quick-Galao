/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipaulistana.quickgalao.Controller;

import com.unipaulistana.quickgalao.Model.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author didup
 */
public class ProdutoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProdutoDTO> lista = new ArrayList();
    
    public void cadastrarProduto(ProdutoDTO objprodutodto){
        String sql = "insert into produtos(nome, capacidade_ml, galao_status, preco_unitario) values (?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getNome_produto());
            pstm.setInt(2, objprodutodto.getCapacidade_produto());
            pstm.setString(3, objprodutodto.getGalao_status());
            pstm.setFloat(4, objprodutodto.getPreco_galao());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir, verifique ProdutoDAO"+ e);
            
        }
    }
    
    public ArrayList<ProdutoDTO> listarProdutos(){
        String sql = "SELECT * FROM produtos";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ProdutoDTO objfuncionariodto = new ProdutoDTO();
                objfuncionariodto.setId_produto(rs.getInt("id"));
                objfuncionariodto.setNome_produto(rs.getString("nome"));
                objfuncionariodto.setCapacidade_produto(rs.getInt("capacidade_ml"));
                objfuncionariodto.setGalao_status(rs.getString("galao_status"));
                objfuncionariodto.setPreco_galao(rs.getFloat("preco_unitario"));
                
                lista.add(objfuncionariodto);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar produto, favor verificar ProdutoDAO" + e);
        }
        return lista;
    } 
}
