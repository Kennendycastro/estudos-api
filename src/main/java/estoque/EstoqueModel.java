package estoque;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import produtos.ProdutoModel;

@Entity
@Table(name = "tb_estoque")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EstoqueModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    //Um estoque pode ter varios produtos
    @OneToMany(mappedBy = "estoque")
    private ProdutoModel produto;


}
