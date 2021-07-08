package com.example.demo.Dto;

import com.example.demo.Model.Empresa;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class EmpresaDto {

    private Long id;
    private String name;
    private String endereco;

    public static EmpresaDto from(Empresa empresa) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper.map(empresa, EmpresaDto.class);
    }

    public EmpresaDto(String nome, String endereco) {
        this.name = nome;
        this.endereco = endereco;
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
}
