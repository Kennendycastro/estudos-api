package com.kennendy.first_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kennendy.first_api.model.ProdutoModel;
import com.kennendy.first_api.service.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/status")
    public String rota(){return "A API está rodando..";}

    @GetMapping("/listar")
    public List<ProdutoModel> listar() {
        return ps.listar();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModel pm) {
        
        return ps.cadastrarAlterar(pm, "cadastrar");
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModel pm){
        return ps.cadastrarAlterar(pm, "alterar");
    }

    @DeleteMapping("/deletar/{codigo}")
    public ResponseEntity<?> deletar(@PathVariable Long codigo){
        return ps.remover(codigo);
    }
    
}
