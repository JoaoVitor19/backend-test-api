package com.example.demo.Repository;

import com.example.demo.Model.Empresa;
import com.example.demo.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
