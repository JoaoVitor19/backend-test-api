package com.example.demo.Controller;

import com.example.demo.Dto.ProdutoDto;
import com.example.demo.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    private ResponseEntity<List<ProdutoDto>> findAll(){
        List<ProdutoDto> list = produtoService.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<ProdutoDto> create(@RequestBody @Validated ProdutoDto produtoDto) {
        return ResponseEntity.ok(produtoService.save(produtoDto));
    }
}
