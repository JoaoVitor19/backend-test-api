package com.example.demo.Model;

import com.example.demo.Dto.EmpresaDto;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String endereco;

    @OneToMany(mappedBy = "empresa", fetch = FetchType.EAGER)
    private List<Produto> produtoList;

    public Empresa() {
    }

    public Empresa(String name, String endereco, List<Produto> produtoList) {
        this.name = name;
        this.endereco = endereco;
        this.produtoList = produtoList;
    }

    public static Empresa from(EmpresaDto empresaDto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(empresaDto, Empresa.class);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
}
