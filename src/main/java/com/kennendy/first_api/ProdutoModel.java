package com.kennendy.first_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Transforma uma class em uma entidade no BD.
@Entity
// Cria uma tabela e o nome
@Table(name = "tb_cadastro")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdProduto;
    private String nome;
    private double valor;
    private String categoria;

    
    public ProdutoModel() {
    }


    public ProdutoModel(String nome, double valor, String categoria) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
