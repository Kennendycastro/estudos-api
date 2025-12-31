package com.kennendy.first_api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kennendy.first_api.model.ProdutoModel;
import com.kennendy.first_api.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository pr;
   
    public List<ProdutoModel> listar(){
        
        return pr.findAll();
    }



   

}
