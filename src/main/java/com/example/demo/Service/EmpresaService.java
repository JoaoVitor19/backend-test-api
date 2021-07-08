package com.example.demo.Service;

import com.example.demo.Dto.EmpresaDto;
import com.example.demo.Model.Empresa;
import com.example.demo.Repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpresaService {

    private EmpresaRepository empresaRepository;

    public List<EmpresaDto> findAll() {
        List<Empresa> rsempresa = empresaRepository.findAll();
        return rsempresa.stream().map(EmpresaDto::from).collect(Collectors.toList());
    }

    public EmpresaDto save(EmpresaDto empresaDto) {

        if (empresaRepository.findByNameContaining(empresaDto.getName()).isPresent()) {
            empresaDto.getName();

        }
        return EmpresaDto.from(empresaRepository.save(new Empresa(empresaDto.getName(), empresaDto.getEndereco())));
    }
}
