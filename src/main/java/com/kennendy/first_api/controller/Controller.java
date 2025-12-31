package com.kennendy.first_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kennendy.first_api.model.ProdutoModel;
import com.kennendy.first_api.service.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


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
    
}
