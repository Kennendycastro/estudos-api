package com.kennendy.first_api.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_estoque")
@NoArgsConstructor
@Getter
@Setter
public class EstoqueModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestoque")
    private Long idEstoque;

    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String tipo;
    //Um estoque pode ter varios produtos
    //@OneToMany(mappedBy = "estoque")
    //private ProdutoModel produto;


}
