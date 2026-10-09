package com.loja.ecommerce.repository;

import com.loja.ecommerce.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}