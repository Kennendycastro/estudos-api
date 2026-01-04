package com.kennendy.first_api.service;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.kennendy.first_api.model.ProdutoModel;
import com.kennendy.first_api.model.RespostaModel;
import com.kennendy.first_api.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository pr;
    private final RespostaModel rm;

    public List<ProdutoModel> listar() {

        return pr.findAll();
    }

    public ResponseEntity<?> cadastrarAlterar(ProdutoModel pm, String op) {

        if (pm.getNome() == null || pm.getNome().trim().isEmpty()) {

            rm.setMesagem("O nome não pode ser vaziu");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        } else if (pm.getValor() <= 0) {
            rm.setMesagem("O valor não pode ser negativo ou 0.");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        } else if (pm.getNome() == null || pm.getCategoria().trim().isEmpty()) {
            rm.setMesagem("A categoria não pode ser vazia.");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        } else {

            if (op.equals("cadastrar")) {
                rm.setMesagem("Produto criado.");
                return new ResponseEntity<ProdutoModel>(pr.save(pm), HttpStatus.CREATED);

            } else {
                rm.setMesagem("Produto alterado.");
                return new ResponseEntity<ProdutoModel>(pr.save(pm), HttpStatus.OK);
            }

        }
    }


    public ResponseEntity<RespostaModel> remover(Long id){
        pr.deleteById(id);
        rm.setMesagem("O produto foi deletado.");

        return new ResponseEntity<RespostaModel>(rm, HttpStatus.OK);

    }

}
