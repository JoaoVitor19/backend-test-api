package com.example.demo.Service;

import com.example.demo.Dto.EmpresaDto;
import com.example.demo.Model.Empresa;
import com.example.demo.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<EmpresaDto> findAll() {
        List<Empresa> empresaList = empresaRepository.findAll();
        return empresaList.stream().map(EmpresaDto::from).collect(Collectors.toList());
    }

    public EmpresaDto save(EmpresaDto empresaDto) {
        System.out.println(empresaDto);
        Empresa empresa = new Empresa();
        empresa = Empresa.from(empresaDto);
        return EmpresaDto.from(empresaRepository.save(empresa));
    }
}
