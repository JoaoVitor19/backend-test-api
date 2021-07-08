package com.example.demo.Repository;

import com.example.demo.Model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
    Optional<Empresa> findByNameContaining(String name);
}
