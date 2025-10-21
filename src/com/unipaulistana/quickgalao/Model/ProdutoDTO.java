/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unipaulistana.quickgalao.Model;

/**
 *
 * @author didup
 */
public class ProdutoDTO {
    private String nome_produto, galao_status;
    private int capacidade_produto, id_produto;
    private float preco_galao;
  

    /**
     * @return the nome_produto
     */
    public String getNome_produto() {
        return nome_produto;
    }

    /**
     * @param nome_produto the nome_produto to set
     */
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    /**
     * @return the galao_status
     */
    public String getGalao_status() {
        return galao_status;
    }

    /**
     * @param galao_status the galao_status to set
     */
    public void setGalao_status(String galao_status) {
        this.galao_status = galao_status;
    }

    /**
     * @return the capacidade_produto
     */
    public int getCapacidade_produto() {
        return capacidade_produto;
    }

    /**
     * @param capacidade_produto the capacidade_produto to set
     */
    public void setCapacidade_produto(int capacidade_produto) {
        this.capacidade_produto = capacidade_produto;
    }

    /**
     * @return the preco_galao
     */
    public float getPreco_galao() {
        return preco_galao;
    }

    /**
     * @param preco_galao the preco_galao to set
     */
    public void setPreco_galao(float preco_galao) {
        this.preco_galao = preco_galao;
    }

    /**
     * @return the id_produto
     */
    public int getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }
    
    
}
