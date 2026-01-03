package com.kennendy.first_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Transforma uma class em uma entidade no BD.
@Entity
// Cria uma tabela e o nome
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdutoModel {
    //nome, valor, categoria

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idproduto;
    private String nome;
    private double valor;
    private String categoria;
    //Um produto tem um unico estoque
    //@ManyToOne
    //FK
    //@JoinColumn(name = "estoque_id")
    //private EstoqueModel estoque;
        
}
