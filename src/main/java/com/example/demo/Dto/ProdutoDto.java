package com.example.demo.Dto;

import com.example.demo.Model.Produto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ProdutoDto {

    private Long id;
    private String name;
    private String valor;

    public static ProdutoDto from(Produto produto) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper.map(produto, ProdutoDto.class);
    }

    public ProdutoDto(String name, String valor) {
        this.name = name;
        this.valor = valor;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
