package com.kennendy.first_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kennendy.first_api.model.ProdutoModel;

@Repository
public interface ProdutoRepository  extends JpaRepository<ProdutoModel, Long>{

}
