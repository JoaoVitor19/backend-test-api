package com.example.demo.Dto;

import com.example.demo.Model.Empresa;
import com.example.demo.Model.Produto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.List;

public class EmpresaDto {

    private Long id;
    private String name;
    private String endereco;
    private List<ProdutoDto> produtoList;

    public static EmpresaDto from(Empresa empresa) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(empresa, EmpresaDto.class);
    }

    public EmpresaDto(Long id, String name, String endereco, List<ProdutoDto> produtoList) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
        this.produtoList = produtoList;
    }

    public EmpresaDto() {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<ProdutoDto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<ProdutoDto> produtoList) {
        this.produtoList = produtoList;
    }
}
