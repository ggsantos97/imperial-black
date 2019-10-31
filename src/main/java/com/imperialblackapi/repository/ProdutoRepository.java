package com.imperialblackapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imperialblackapi.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
