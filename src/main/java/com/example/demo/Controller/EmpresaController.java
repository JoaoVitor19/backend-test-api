package com.example.demo.Controller;

import com.example.demo.Dto.EmpresaDto;
import com.example.demo.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    private ResponseEntity<List<EmpresaDto>> findAll(){
        List<EmpresaDto> list = empresaService.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<EmpresaDto> create(@RequestBody @Validated EmpresaDto empresaDto) {
        return ResponseEntity.ok(empresaService.save(empresaDto));
    }
}
