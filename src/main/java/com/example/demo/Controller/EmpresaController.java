package com.example.demo.Controller;

import com.example.demo.Dto.EmpresaDto;
import com.example.demo.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    private ResponseEntity<List<EmpresaDto>> findAll(){
        return ResponseEntity.ok(empresaService.findAll());
    }

    @PostMapping
    public ResponseEntity<EmpresaDto> create(@RequestBody EmpresaDto empresaDto) {
        return ResponseEntity.ok(empresaService.save(empresaDto));
    }
}
