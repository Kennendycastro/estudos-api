package com.kennendy.first_api.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.kennendy.first_api.model.ProdutoModel;
import com.kennendy.first_api.repository.ProdutoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository pr;
   
    public List<ProdutoModel> listar(){
        
        return pr.findAll();
    }

    



   

}
